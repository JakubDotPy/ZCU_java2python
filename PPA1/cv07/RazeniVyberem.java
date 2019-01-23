package cv07;

import java.util.*;

public class RazeniVyberem {
	// public final static int MAX = 10;
	//public final static int N = 10;

//	/**
//	 * Seradi pole metodou SelectSort
//	 * @param pole razene pole
//	 */
	//	static void razeniVyberem(int[] pole) {
	//		for (int i = 0;  i < pole.length - 1;  i++) {
	//			int iMin = i;
	//			for (int j = i + 1;  j < pole.length;  j++) {
	//				if (pole[j] < pole[iMin]) {
	//					iMin = j;
	//				}
	//			}
	//			if (i != iMin) {
	//				int pom = pole[iMin];
	//				pole[iMin] = pole[i];
	//				pole[i] = pom;
	//			}
	//		}    
	//	}
	
	/**
	 * Seradi pole metodou InsertSort
	 * @param pole razene pole
	 */
	static void razeniVkladanim(int[] pole){
		for (int i = 1; i < pole.length; i++) {
			int pom = pole[i];
			int j;
			for (j = i-1; j>=0 && pole[j]>pom; j--) {
				pole[j+1] = pole[j];
			}
			pole[j+1] = pom;
		}
	}

	/**
	 * Naplni pole nahodnymi cisly a seradi jej
	 * @param args nepouzito
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Zadej pocet clenu posloupnosti: ");
		int N = sc.nextInt();
		System.out.print("Zadej horní mez intervalu: ");
		int MAX = sc.nextInt();

		Random r = new Random(1);
		int[] pole = new int[N];

		// naplneni
		for (int i = 0;  i < pole.length;  i++) {
			pole[i] = r.nextInt(MAX);
		}
		System.out.println(Arrays.toString(pole));
		razeniVkladanim(pole);
		System.out.println(Arrays.toString(pole));
	}
}
