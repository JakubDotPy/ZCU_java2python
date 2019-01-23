package cv10;

import java.io.*;

/**
 * Staticke zapisove metody pro on-line test
 * zapisuji vzdy do souboru on-line-test.txt
 * 
 * @author Herout
 */
public class OnlineTestVypis {
  private final static String SOUBOR = "on-line-test.txt";
  
  /**
   * Zapise pole int do souboru
   * @param pole zapisovane pole
   */
  public static void zapisInt(int[] pole) {
    try {
      PrintWriter pw = new PrintWriter(
                       new BufferedWriter(
                       new FileWriter(SOUBOR)));
      for (int i = 0;  i < pole.length;  i++) {
        pw.println(pole[i]);
      }
      pw.close();
    } catch (IOException e) {
      System.out.println("Chyba pri zapisu do souboru");
      e.printStackTrace();
      System.exit(1);
    }
  }
  
  /**
   * Zapise pole double do souboru
   * @param pole zapisovane pole
   */
  public static void zapisDouble(double[] pole) {
    try {
      PrintWriter pw = new PrintWriter(
                       new BufferedWriter(
                       new FileWriter(SOUBOR)));
      for (int i = 0;  i < pole.length;  i++) {
        pw.println(pole[i]);
      }
      pw.close();
    } catch (IOException e) {
      System.out.println("Chyba pri zapisu do souboru");
      e.printStackTrace();
      System.exit(1);
    }
  }
  
  /**
   * Pouze testovaci
   * @param args nevyuzito
   */
  public static void main(String[] args) {
//    int[] pi = { 1, 22, 333, 44, 5 };
//    zapisInt(pi);
    double[] pd = { 1.1, 22.2, 333.3, 44.4, 5.5 };
    zapisDouble(pd);
  }

}


