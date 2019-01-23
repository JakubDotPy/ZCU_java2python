package cv10;

/**
 * Ukazka uplneho osetreni RunTimeException vyjimky
 * 
 * @author P.Herout, J. Kohout
 */
public class DeleniNulou {

  /**
   * pocita funkcni hodnotu
   *
   * @return funkcni hodnota nebo Double.NaN
   */
  static double vypocetFunkce(int a, int b) {
    try {
      return (double)((a + b) / Math.min(a, b));
    } catch (ArithmeticException e) {
      System.out.println("Zachycena vyjimka: " 
                         + e.getMessage());
      return Double.NaN;
    }
  }
  
  /**
   * Test spravne funkce  
   *
   * @param args nepouzito
   */
  public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);

    System.out.print("Zadej cele cislo a: ");
    int a = sc.nextInt();
    System.out.print("Zadej cele cislo b: ");
    int b = sc.nextInt();

    System.out.println("f(" + a + "," + b + ") = " + vypocetFunkce(a, b)); 	
  }
}

