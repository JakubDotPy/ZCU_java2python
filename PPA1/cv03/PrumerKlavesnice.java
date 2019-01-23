package cv03;
import java.util.*;

/**
  * Vypocet aritmetickeho prumeru celych cisel
  * nactenych z klavesnice
  * pojmenovana konstanta a pretypovani
  * @author P.Herout
  */
public class PrumerKlavesnice {
  static final int POCET = 3;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Zadej 1. cislo: ");
    int a1 = sc.nextInt();
    System.out.print("Zadej 2. cislo: ");
    int a2 = sc.nextInt();
    System.out.print("Zadej 3. cislo: ");
    int a3 = sc.nextInt();
    int suma = a1 + a2 + a3;
    double prumer = (double) suma / POCET;
    System.out.println("Prumer = " + prumer);
  }
}