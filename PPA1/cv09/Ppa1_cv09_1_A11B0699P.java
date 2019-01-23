package cv09;

import java.util.*;

public class Ppa1_cv09_1_A11B0699P {
	public final static String CHTENE = "0123456789ABCDEF";
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Zadej hexa cislo: ");
		String cislo = sc.nextLine();
		
		cislo = cislo.toUpperCase();
		System.out.println("---Vysledky---");
		for (int i = 0; i < cislo.length(); i++) {
			if (CHTENE.indexOf(cislo.charAt(i)) < 0) {
				System.out.println(cislo + " neni platne hexa cislo");
			}
		}
		
		int dekadicky = Integer.parseInt(cislo, 16);
		System.out.format(cislo+" H = "+dekadicky+" D = %o O",dekadicky);
		
	}
}
