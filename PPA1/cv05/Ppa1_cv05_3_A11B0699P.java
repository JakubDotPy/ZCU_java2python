package cv05;


import java.util.*;

public class Ppa1_cv05_3_A11B0699P {

	public static double vstupCisla() {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.print("Zadej realne cislo: ");
		double realnecislo = sc.nextDouble();
		return realnecislo;
	}

	public static boolean jeLiche(int cislo) {
		if (cislo % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}


	public static void main(String[] args) {
		double realcislo = vstupCisla();

		System.out.println("---Vysledky---");

		if (jeLiche((int) realcislo)) {
			System.out.println("Cela cast " + realcislo + " je liche cislo");
		} else {
			System.out.println("Cela cast " + realcislo + " je sude cislo");
		}


	}
}