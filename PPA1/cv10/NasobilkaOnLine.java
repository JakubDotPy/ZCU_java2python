package cv10;

import java.util.*;

public class NasobilkaOnLine {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Zadej pocet clenu: ");
		int clenu = sc.nextInt();
		
		int[] pole = new int[clenu+2];
		
		pole[0] = clenu;
		pole[1] = 0;
		
		for (int i = 1; i <= clenu+1; i++) {
			pole[i] = (i-1)*5;
		}
		System.out.println(Arrays.toString(pole));
		OnlineTestVypis.zapisInt(pole);
		
	}
}
