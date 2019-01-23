package cv10;

import java.util.Scanner;

public class Ppa1_cv10_1_A11B0699P {

	static int ctiDec(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadej èíslo v dekadické soustavì: ");
		String zadano = sc.next();

		System.out.println("---Vysledky---");

		int cislo = 0;

		try {
			cislo = Integer.parseInt(zadano);
		} catch (NumberFormatException e) {
			System.out.println("Zadane cislo je chybne: "+zadano);
			System.exit(0);
		}

		return cislo;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Bylo zadano cislo: "+ ctiDec());





	}

}
