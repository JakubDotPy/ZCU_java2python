package cv07;

import java.util.*;

public class SekvencniVyhledavani {
	public final static int MAX = 9;
	public final static int mezHled = 14;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Zadej velikost pole: ");
		int N = sc.nextInt();
		int[] pole = new int[N];

		Random r = new Random();
		int hledane = (r.nextInt(mezHled))-2;	

		int index = -1;

		// naplneni
		for (int i = 0;  i < pole.length;  i++) {
			pole[i] = r.nextInt(MAX);
		}

		for (int i = 0; i < pole.length; i++) {
			if (pole[i]==hledane) {
				index = i;
				break;
			} 
		}

		System.out.println(Arrays.toString(pole)+"\nHledane cislo je: "+hledane);

		if (index == -1) {
			System.out.println("Cislo v poli neni.");
		} else {
			System.out.println("Hledane cislo: " + hledane + " je na indexu: "+index);
		}


	}
}