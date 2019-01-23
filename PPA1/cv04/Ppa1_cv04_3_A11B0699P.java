package cv04;

import java.util.*;

public class Ppa1_cv04_3_A11B0699P {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Zadej cele cislo: ");
	    double uhel = Math.abs(sc.nextDouble());
	    int k = ((int)uhel - 90)/180; // pomocna prom na deleni
	    
	    System.out.println("---Vysledky---");
	    
	    if (uhel == 90 * (2 * k + 1)) {
	    	System.out.println("tangens nedefinovan");
		} else {
			double tang = Math.tan(Math.toRadians(uhel));
	    	System.out.println("tan("+(int)uhel+") = "+tang);
		}
	}
}