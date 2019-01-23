package cv08;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;

/**
 * Testovaci trida pro prvni priklad cviceni
 * @author P.Herout
 */
public class TestOsoby {
  private static Scanner sc;
  public final static int N = 3;
  
  /**
   * Vytvori a naplni jednu instanci tridy Osoba
   */
  public static Osoba vytvorANactiOsobu() {
    //System.out.print("Jmeno: ");
    String jmeno = sc.next();
    //System.out.print("Vaha: ");
    int vaha = sc.nextInt();
    //System.out.print("Vyska: ");
    int vyska = sc.nextInt();
    sc.nextLine();  // precteni konce radky
    Osoba o = new Osoba(jmeno, vaha, vyska);
    return o;
  }
   
  /**
   * Testuje tridu Osoba
   * @param args nepouzito
   */
  public static void main(String[] args) {
    sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Osoba[] lide = new Osoba[N];
    for (int i = 0;  i < lide.length;  i++) {
      lide[i] = vytvorANactiOsobu();
    }
    System.out.println(Arrays.toString(lide));
  }
}
