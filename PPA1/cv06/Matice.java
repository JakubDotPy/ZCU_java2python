package cv06;

import java.util.Scanner;

/**
 * Nacte a vypise ctvercovou matici
 * @author P.Herout
 */
public class Matice {
  
  /**
   * Vypise matici
   * @param matice vypisovana matice
   */
  static void vypisMatici(int[][] matice) {
    for (int i = 0;  i < matice.length;  i++) {
      for (int j = 0;  j < matice[i].length;  j++) {
        System.out.format("%3d, ", matice[i][j]);
      }
      System.out.println();
    }
  }
  
  /**
   * Nacte a vypise ctvercovou matici
   * @param args nepouzito
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Zadej rad matice: ");
    int n = sc.nextInt();
    int[][] mat = new int[n][n];
    for (int i = 0;  i < mat.length;  i++) {
      for (int j = 0;  j < mat[i].length;  j++) {
        System.out.print("m[" + i + "]["+ j + "]: ");
        mat[i][j] = sc.nextInt();
      }
    }
    
    System.out.println("Byla zadana matice: ");
    vypisMatici(mat);
  }
}
