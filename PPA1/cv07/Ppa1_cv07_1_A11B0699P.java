package cv07;

import java.util.*;

public class Ppa1_cv07_1_A11B0699P {

	public final static int VELPOLE = 10;

	public static Scanner sc = new Scanner(System.in);

	public static int[] bublinkoveRazeni(int[] pole) {
		for(int i = 1;i<pole.length;i++) {
			for(int j = pole.length-1; j>=i ;j--) {
				if(pole[j]<pole[j-1]) {
					int a = pole[j-1];
					pole[j-1] = pole[j];
					pole[j] = a;
				}
			}
		}
		System.out.println(Arrays.toString(pole));
		return pole;
	}
	
	public static void vypocet(int[]SerPole) {
		int Opakovani = 1;
		int CisloKolikrat = 0;
		int OpakovaneCislo = 0; 
		for(int i = 0; i<SerPole.length-1; i++){
			if(SerPole[i]==SerPole[i+1]){
				Opakovani++;
			}else{
				Opakovani = 1;
			}
			if(CisloKolikrat<Opakovani){ //najde nejmensi a cislokolikrat priradi opakovani
				OpakovaneCislo=SerPole[i];
				CisloKolikrat=Opakovani;
			}
		}
		System.out.println("Max. pocet je "+CisloKolikrat+" x "+OpakovaneCislo);
	}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadej jednotlive prvky pole: ");

		int[] pole = new int [VELPOLE]; 
		for(int i = 0; i<VELPOLE; i++){
			System.out.format("p["+i+"]: ");
			pole[i]=sc.nextInt();
		}
		System.out.println("---Vysledky---");
		System.out.println(Arrays.toString(pole));

		pole=bublinkoveRazeni(pole);
		vypocet(pole);
	}
}

