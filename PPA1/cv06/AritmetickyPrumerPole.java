package cv06;

import java.util.*;


public class AritmetickyPrumerPole {
  
  
 
  
  public static void main(String[] args) {
	  
    Scanner sc = new Scanner(System.in);
    System.out.print("Zadej velikost pole: ");
    int n = sc.nextInt();
    int[] pole = new int[n];

    // nacteni
    for (int i = 0;  i < pole.length;  i++) {
      System.out.print("Zadej pole[" + i + "]: ");
      pole[i] = sc.nextInt();
    }
    
    // vypocet sumy
    int suma = 0;
    for (int i = 0;  i < pole.length;  i++) {
      suma += pole[i];
    }

    double prumer = suma / (double) n;
    System.out.println("Aritmeticky prumer prvku pole: ");
    System.out.println(Arrays.toString(pole));
    System.out.println("je: " + prumer);
  }
}
