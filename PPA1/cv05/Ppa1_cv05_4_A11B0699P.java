package cv05;




import java.util.*;

public class Ppa1_cv05_4_A11B0699P {
	static Scanner scanner;
	
	public static void nastavScanner() {
		scanner = new Scanner(System.in);
	}

	 
	public static int vstupCisla() { 
		System.out.print("Zadej operand: ");
		int cislo = scanner.nextInt();
		return cislo;
	}
	
	public static char vstupZnaku() {
		System.out.print("Zadej znak + nebo -: ");
		char znak = scanner.nextLine().charAt(0);
		return znak;
	}

	public static void main(String[] args) {
		nastavScanner();
		
		int prvni = vstupCisla();
		scanner.nextLine(); // vyprazdneni
		char znak = vstupZnaku();
		int druhe = vstupCisla();
		
		System.out.println("---Vysledky---");
		if (znak == '+') {
			System.out.println(prvni+" + "+druhe+" = "+(prvni+druhe));
		} else {
			System.out.println(prvni+" - "+druhe+" = "+(prvni-druhe));
		}
		
	}
}
