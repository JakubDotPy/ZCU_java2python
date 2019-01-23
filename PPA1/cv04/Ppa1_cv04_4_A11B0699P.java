package cv04;

import java.util.Scanner;

public class Ppa1_cv04_4_A11B0699P {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Zadej 1. cislo: ");
	    int a = sc.nextInt();
	    System.out.print("Zadej 2. cislo: ");
	    int b = sc.nextInt();
	    System.out.print("Zadej 3. cislo: ");
	    int c = sc.nextInt();
	    
       
	    double vysledek = Math.pow(3, -1/2.0)*Math.pow(a*a+b*b+c*c, 1/2.0);
	    
	    System.out.println("---Vysledky---");
	    System.out.println("Kvadraticky prumer = " + vysledek);
	   
	  }
}
