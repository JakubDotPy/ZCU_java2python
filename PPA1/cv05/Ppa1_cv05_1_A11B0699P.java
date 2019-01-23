package cv05;

import java.util.*;

public class Ppa1_cv05_1_A11B0699P {

	//metoda na nacteni cisla
	 public static int vstupMaxCisla() { 
		 
		    Scanner sc = new Scanner(System.in);
		    int maxCislo; 
		    
		    do {
		      System.out.print("Zadej max. cislo: ");
		      maxCislo = sc.nextInt();
		      if(maxCislo < 2){
		        System.out.println("Zadane cislo neni vetsi nez 2. \n " +
		        		"Zadej cislo vetsi nez 2");		        
		      }
		    } while (maxCislo < 2);
		    return maxCislo;
		  }
	 
	//metoda na zjisteni prvocisla
	 public static boolean jeProvcislo(int cislo){
		 boolean prv = true;
		 for (int i = 2; i < cislo; i++) {
			if (cislo % i == 0) {
				prv = false;				
			}
		}
		return prv;
	 }
	
	 //metoda na vypis
	 public static void vypisPrvocislo(int prvocislo){
		 System.out.print(prvocislo + ", ");
	 }
	 
	public static void main(String[] args) {
	    int mez = vstupMaxCisla();
	    System.out.println("---Vysledky---");
	    int x = 1;
		while (x < mez-1) {
			x++;
			if (jeProvcislo(x)) {
				vypisPrvocislo(x);
			}
		}
	  }
	
}
