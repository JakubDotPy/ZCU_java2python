package pokus;
import java.util.*;

/**
  * Suma cisel nactenych z klavesnice
  * 
  * @author P.Herout
  */
public class SumaCisel {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Zadej pocet cisel: ");
    int n = sc.nextInt();
    
    int suma = 0;
    for (int i = 1;  i <= n;  i++) {
      System.out.print("Zadej " + i + ". cislo: ");
      int cislo = sc.nextInt();
      suma += cislo;
    }
    System.out.println("Suma = " + suma);
  }
}