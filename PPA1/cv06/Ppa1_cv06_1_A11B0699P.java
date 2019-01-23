package cv06;


import java.util.*;

public class Ppa1_cv06_1_A11B0699P {

	public static int[] dalsiClen(int[] pole){
		
		int[] poleVetsi = new int[pole.length+1];
		
		for (int i=0; i < pole.length; i++){ //pøendání pole
			poleVetsi[i] = pole[i];
		}
		
		poleVetsi[pole.length]=pole[pole.length-1]+pole[pole.length-2];
		System.out.println(Arrays.toString(poleVetsi));
		return poleVetsi; 
		  
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Zadej pocet clenu posloupnosti: ");
		int n = sc.nextInt();
		
		System.out.println("---Vysledky---");		
		
		switch (n) {
		case 0:
			System.out.println("[0]");
			break;
		case 1:
			System.out.println("[0]\n[0, 1]");
			break;
		default:
			int[] pole = new int[2];
			pole[0]=0;
			pole[1]=1;
			System.out.println("[0]\n[0, 1]");
			for (int i = 1; i < n; i++) {
			pole = dalsiClen(pole);
		}
		break;
		
		}
		
	
	}
}