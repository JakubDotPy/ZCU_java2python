package cv09;

import java.util.*;

public class Ppa1_cv09_2_A11B0699P {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Zadej vetu slozenou z pismen a mezer zakoncenou . :");
		String veta = sc.nextLine();

		double pocetZnaku = 0;
		int pocetSlov = 1;

		for (int i = 0; veta.charAt(i) != 46 ; i++) { //projde vetu az do tecky
			if (veta.charAt(i)==32) { //mezera
				pocetSlov++;
			} else {
				pocetZnaku++;
			}
		}
		
		double prumer = (pocetZnaku/pocetSlov);
		System.out.println("slov je:"+pocetSlov+" znaku je:"+pocetZnaku);
		System.out.println("---Vysledky---");
		System.out.println("Veta obsahuje "+pocetSlov+" slov.");
		System.out.format("Prumerna delka slova je %.1f znaku.", prumer);

		
	}
}
