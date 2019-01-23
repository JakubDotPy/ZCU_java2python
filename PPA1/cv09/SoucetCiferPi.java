package cv09;

/**
 * Secita jednotlive cifry Pi
 * prace s jednotlivymi prvky retezce
 * @author netrvalo
 */
public class SoucetCiferPi {
  
  /**
   * Secita jednotlive cifry Pi
   * @param args nepouzito
   */
  public static void main(String[] args) {
    String pi = "" + Math.PI;
    String piBezTecky = pi.charAt(0) + pi.substring(2);
    System.out.print(pi + ": ");
    
    int suma = 0;
    for(int i = 0; i < piBezTecky.length(); i++) {
      char c = piBezTecky.charAt(i);
      int k = (int) (c - '0');
      suma += k;
      System.out.print(c);
        if (i < pi.length() - 2) {
          System.out.print(" + ");
        }
    }
    System.out.println(" = " + suma);
  }
} 