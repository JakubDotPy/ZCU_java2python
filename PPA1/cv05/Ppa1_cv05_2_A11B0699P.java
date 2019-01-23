package cv05;







import java.util.*;

public class Ppa1_cv05_2_A11B0699P {


	//metoda na orez cisla


	public static int castCisla(int puvodniCislo, int pocetCislicZprava){
		int stovky = (int) puvodniCislo/100;
		int desitky = (int) (puvodniCislo-(stovky*100))/10;
		int jednotky = (int) (puvodniCislo-(stovky*100)-(desitky*10));

		if ((puvodniCislo<100 && pocetCislicZprava==3)||(puvodniCislo<10 && pocetCislicZprava==2)) {

		//if ((puvodniCislo>99 && pocetCislicZprava==3)||(puvodniCislo>9 && pocetCislicZprava==2)) {
			return 0; // error vypis	
			
		} else if (pocetCislicZprava==1) {
			return jednotky;
			
		} else if (pocetCislicZprava==2) {
			return jednotky+(desitky*10);
				
		} else if (pocetCislicZprava==3) {
			return puvodniCislo;

		}
		return 8888; //osetreni
	}
	
	public static void main(String[] args) {	 

		Scanner sc = new Scanner(System.in);
		System.out.print("Zadej puvodni cislo (max. 999): ");
		int puvodniCislo = sc.nextInt();
		sc.nextLine();

		System.out.print("Zadej pocet cifer zprava (max. 3): ");
		int  pocetCislicZprava = sc.nextInt();
		sc.nextLine();

		System.out.println("---Vysledky---");

		if (castCisla(puvodniCislo, pocetCislicZprava)==0) {
			System.out.println("Cisla " +puvodniCislo+" a "+pocetCislicZprava+" jsou chybne zadana");
		} else {
			System.out.println(castCisla(puvodniCislo,pocetCislicZprava));
		}


	}

}


