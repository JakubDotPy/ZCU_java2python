package cv06;

import java.util.Scanner;

public class Ppa1_cv06_3_A11B0699P {

	static void vypisMatici(int[][] matice) {
		for (int i = 0;  i < matice.length;  i++) {
			for (int j = 0;  j < matice[i].length;  j++) {
				System.out.format("%3d", matice[i][j]);
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.print("Zadej rad matice: ");
			int n = sc.nextInt();
			int[][] mat = new int[n][n];

			for (int i = 0;  i < mat.length;  i++) {
				for (int j = 0;  j < mat[i].length;  j++) {
					System.out.print("m[" + i + "]["+ j + "]: ");
					mat[i][j] = sc.nextInt();
				}

			}
			System.out.println("---Vysledky---");
			System.out.println("Byla zadana matice:");
			vypisMatici(mat);

			int MaxPrvek = Integer.MIN_VALUE;
			int MinPrvek = Integer.MAX_VALUE;

			int indexMax = 0;
			for(int i = 0; i<mat.length; i++){
				if(mat[i][mat.length-i-1]>MaxPrvek){
					MaxPrvek=mat[i][mat.length-i-1];
					indexMax = i;
				}
			}
			System.out.println("Max. prvek na vedlejsi diagonale: \n" +
					"["+indexMax+"]["+(mat.length-1-indexMax)+"] = "+MaxPrvek);
			
			int indexMin = 0;
			for(int j = 0; j<mat.length; j++){
				if(mat[j][mat.length-j-1]<MinPrvek){
					MinPrvek=mat[j][mat.length-j-1];
					indexMin = j;
				}
			}
			System.out.println("Min. prvek na vedlejsi diagonale: \n" +
					"["+indexMin+"]["+(mat.length-1-indexMin)+"] = "+MinPrvek);
		}

	}
