package SP;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import ppa1.*;


public class Ppa1_SP_A11B0699P {

	/**
	 * Metoda pro zadavani vstupniho cisla rucne uzivatelem.
	 * @author Jakub Èervinka
	 * @param  Scanner - cteni z klavesnice
	 * @return vstup
	 */
	public static int vstup(Scanner sc){
		System.out.print("Zadej uvodni dvouciferne cislo: ");
		int vstup = sc.nextInt();
		return vstup;
	}

	/**
	 * Porovnava, zda v poli je jiz stejne cislo.
	 * @author Jakub Èervinka
	 * @param poleCisel - Pomocne pole pro porovnavani
	 * @param cislo - porovnavane cislo
	 */
	public static boolean porovnani(int [] poleCisel,int cislo) {
		for (int i=0; i < poleCisel.length-1; i++){
			if (cislo == poleCisel[i]){
				return false;
			} 
		}
		return true;
	}

	/**
	 * Algorytmus generovani pseudonahone posloupnosti (dale jen PNP).
	 * @author Jakub Èervinka
	 * @param vstupniCislo - hodnota pro generovani posloupnosti
	 */
	public static int[]  generator (int vstup){ 

		int[] pole = new int[1];		//vytvori pole o velikosti 1 
		pole[0] = vstup;				//a ulozi do nej vstupni hodnotu

		int[] poleN	 = null;
		int vstup2	 = 0;
		int zvetseni = 2;	

		do   {
			poleN = new int[zvetseni];						  //vytvori pole o 1 vetsi
			for (int i = 0; i < pole.length; i++) {			  //prenda do nej hodnoty puvodniho pole
				poleN[i] = pole[i];
			}

			int nadruhou = vstup * vstup;	  				//vypocte dalsi clen PNP
			String retezec = Integer.toString(nadruhou);  	//		  |
			String orez = retezec.substring(0, 2);		  	//		  |
			//System.out.println(orez);					  	//		  |
			vstup2 = (Integer.parseInt(orez)) + 1; 	//		  V
			//System.out.println(vstupniCislo2);          
			poleN[poleN.length - 1] = vstup2;	  	//ulozi jej na posledni misto v poli
			vstup = vstup2;				  			//a pripravi na dalsi cyklus
			zvetseni ++;
			pole = poleN;

			//System.out.println(vstupniCislo2);
			//System.out.println(Arrays.toString(poleN));	

		} 
		while (porovnani(poleN,vstup2));			  //dokud se nektery z prvku neopakuje

		int[] mensiPoleN = new int[poleN.length -1];	// smaze posledni prvek v poli (ktery se opakoval)
		for (int i = 0; i < poleN.length -1; i++) {		// vytvori mensi a prenda
			mensiPoleN[i] = poleN[i];
		}
		return mensiPoleN;
		//System.out.println(Arrays.toString(poleN));
		//System.out.println(Arrays.toString(mensiPoleN));
	}

	/**
	 * Serazeni pole pomoci metody "razeni vkladanim".
	 * @author Jakub 
	 * @param pole - vygenerovane pole z generatoru
	 */
	public static int[] razeniVkladanim(int[] pole) {
		for (int k = 1; k < pole.length; k++) {
			int pom = pole[k];
			int i;
			// posun od posledniho prvku
			for (i = k - 1; i >= 0 && pole[i] > pom; i--) {
				pole[i + 1] = pole[i];
			}
			pole[i + 1] = pom;
		}
		return pole;
	}

	/**
	 * Vykresleni obdelniku
	 * @author Jakub 
	 * @param dt - nastroj pro kresleni
	 * @param srX - souradnice x
	 * @param srY - souradnice y 
	 * @param sirka - sirka
	 * @param vyska - vyska
	 */
	public static void vykresliObdelnik(DrawingTool dt, int srX, int srY, int sirka, int vyska) {

		double meritko = 2; // pro zvetseni vysky X krat

		for (int i = 0; i < sirka; i++) {
			dt.line(srX+i, srY, srX+i, srY-(int)(vyska*meritko));
		}
	}

	/**
	 * Vykresleni obdelniku
	 * @author Jakub 
	 * @param dt - nastroj pro kresleni
	 * @param cislo - cislo k vykresleni
	 * @param srX - souradnice x
	 * @param srY - souradnice y 
	 */
	public static void vykresliCislo(DrawingTool dt, int cislo, int srX, int srY){
		int desitky = cislo/10;		//rozlozi cislo
		int jednotky = cislo%10;

		switch (desitky) {
		case 0:
			for (int i = 0; i < 2; i++) {		
				dt.line(srX,	srY-i,	srX+6,	srY-i);//spodek
				dt.line(srX,	srY-i-8,srX+6,	srY-i-8);//vrsek
				dt.line(srX+i,	srY,	srX+i,	srY-5);//Dole Levo
				dt.line(srX+i+5,srY,	srX+i+5,srY-5);//Dole vpravo
				dt.line(srX+i,	srY-4,	srX+i,	srY-9);//Nahore Levo
				dt.line(srX+i+5,srY-4,	srX+i+5,srY-9);//Nahore vpravo
			}
			break;
		case 1:
			for (int i = 0; i < 2; i++) {		
				dt.line(srX+i+5,srY,	srX+i+5,srY-5);//Dole vpravo
				dt.line(srX+i+5,srY-4,	srX+i+5,srY-9);//Nahore vpravo
			}
			break;
		case 2:
			for (int i = 0; i < 2; i++) {		
				dt.line(srX,	srY-i,	srX+6,	srY-i);//spodek
				dt.line(srX,	srY-i-8,srX+6,	srY-i-8);//vrsek
				dt.line(srX,	srY-i-4,srX+5,	srY-i-4);//prostredek
				dt.line(srX+i,	srY,	srX+i,	srY-5);//Dole Levo
				dt.line(srX+i+5,srY-4,	srX+i+5,srY-9);//Nahore vpravo
			}
			break;
		case 3:
			for (int i = 0; i < 2; i++) {		
				dt.line(srX,	srY-i,	srX+6,	srY-i);//spodek
				dt.line(srX,	srY-i-8,srX+6,	srY-i-8);//vrsek
				dt.line(srX,	srY-i-4,srX+5,	srY-i-4);//prostredek
				dt.line(srX+i+5,srY,	srX+i+5,srY-5);//Dole vpravo
				dt.line(srX+i+5,srY-4,	srX+i+5,srY-9);//Nahore vpravo
			}
			break;
		case 4:
			for (int i = 0; i < 2; i++) {		
				dt.line(srX,	srY-i-4,srX+5,	srY-i-4);//prostredek
				dt.line(srX+i+5,srY,	srX+i+5,srY-5);//Dole vpravo
				dt.line(srX+i,	srY-4,	srX+i,	srY-9);//Nahore Levo
				dt.line(srX+i+5,srY-4,	srX+i+5,srY-9);//Nahore vpravo
			}
			break;
		case 5:
			for (int i = 0; i < 2; i++) {		
				dt.line(srX,	srY-i,	srX+6,	srY-i);//spodek
				dt.line(srX,	srY-i-8,srX+6,	srY-i-8);//vrsek
				dt.line(srX,	srY-i-4,srX+5,	srY-i-4);//prostredek
				dt.line(srX+i+5,srY,	srX+i+5,srY-5);//Dole vpravo
				dt.line(srX+i,	srY-4,	srX+i,	srY-9);//Nahore Levo
			}
			break;
		case 6:
			for (int i = 0; i < 2; i++) {		
				dt.line(srX,	srY-i,	srX+6,	srY-i);//spodek
				dt.line(srX,	srY-i-8,srX+6,	srY-i-8);//vrsek
				dt.line(srX,	srY-i-4,srX+5,	srY-i-4);//prostredek
				dt.line(srX+i,	srY,	srX+i,	srY-5);//Dole Levo
				dt.line(srX+i+5,srY,	srX+i+5,srY-5);//Dole vpravo
				dt.line(srX+i,	srY-4,	srX+i,	srY-9);//Nahore Levo
			}
			break;
		case 7:
			for (int i = 0; i < 2; i++) {		
				dt.line(srX,	srY-i-8,srX+6,	srY-i-8);//vrsek
				dt.line(srX+i+5,srY,	srX+i+5,srY-5);//Dole vpravo
				dt.line(srX+i+5,srY-4,	srX+i+5,srY-9);//Nahore vpravo
			}
			break;
		case 8:
			for (int i = 0; i < 2; i++) {		
				dt.line(srX,	srY-i,	srX+6,	srY-i);//spodek
				dt.line(srX,	srY-i-8,srX+6,	srY-i-8);//vrsek
				dt.line(srX,	srY-i-4,srX+5,	srY-i-4);//prostredek
				dt.line(srX+i,	srY,	srX+i,	srY-5);//Dole Levo
				dt.line(srX+i+5,srY,	srX+i+5,srY-5);//Dole vpravo
				dt.line(srX+i,	srY-4,	srX+i,	srY-9);//Nahore Levo
				dt.line(srX+i+5,srY-4,	srX+i+5,srY-9);//Nahore vpravo
			}
			break;
		case 9:
			for (int i = 0; i < 2; i++) {		
				dt.line(srX,	srY-i,	srX+6,	srY-i);//spodek
				dt.line(srX,	srY-i-8,srX+6,	srY-i-8);//vrsek
				dt.line(srX,	srY-i-4,srX+5,	srY-i-4);//prostredek
				dt.line(srX+i+5,srY,	srX+i+5,srY-5);//Dole vpravo
				dt.line(srX+i,	srY-4,	srX+i,	srY-9);//Nahore Levo
				dt.line(srX+i+5,srY-4,	srX+i+5,srY-9);//Nahore vpravo
			}
			break;
		}

		srX += 9; //posun des. mista

		switch (jednotky) {
		case 0:
			for (int i = 0; i < 2; i++) {		
				dt.line(srX,	srY-i,	srX+6,	srY-i);//spodek
				dt.line(srX,	srY-i-8,srX+6,	srY-i-8);//vrsek
				dt.line(srX+i,	srY,	srX+i,	srY-5);//Dole Levo
				dt.line(srX+i+5,srY,	srX+i+5,srY-5);//Dole vpravo
				dt.line(srX+i,	srY-4,	srX+i,	srY-9);//Nahore Levo
				dt.line(srX+i+5,srY-4,	srX+i+5,srY-9);//Nahore vpravo
			}
			break;
		case 1:
			for (int i = 0; i < 2; i++) {		
				dt.line(srX+i+5,srY,	srX+i+5,srY-5);//Dole vpravo
				dt.line(srX+i+5,srY-4,	srX+i+5,srY-9);//Nahore vpravo
			}
			break;
		case 2:
			for (int i = 0; i < 2; i++) {		
				dt.line(srX,	srY-i,	srX+6,	srY-i);//spodek
				dt.line(srX,	srY-i-8,srX+6,	srY-i-8);//vrsek
				dt.line(srX,	srY-i-4,srX+5,	srY-i-4);//prostredek
				dt.line(srX+i,	srY,	srX+i,	srY-5);//Dole Levo
				dt.line(srX+i+5,srY-4,	srX+i+5,srY-9);//Nahore vpravo
			}
			break;
		case 3:
			for (int i = 0; i < 2; i++) {		
				dt.line(srX,	srY-i,	srX+6,	srY-i);//spodek
				dt.line(srX,	srY-i-8,srX+6,	srY-i-8);//vrsek
				dt.line(srX,	srY-i-4,srX+5,	srY-i-4);//prostredek
				dt.line(srX+i+5,srY,	srX+i+5,srY-5);//Dole vpravo
				dt.line(srX+i+5,srY-4,	srX+i+5,srY-9);//Nahore vpravo
			}
			break;
		case 4:
			for (int i = 0; i < 2; i++) {		
				dt.line(srX,	srY-i-4,srX+5,	srY-i-4);//prostredek
				dt.line(srX+i+5,srY,	srX+i+5,srY-5);//Dole vpravo
				dt.line(srX+i,	srY-4,	srX+i,	srY-9);//Nahore Levo
				dt.line(srX+i+5,srY-4,	srX+i+5,srY-9);//Nahore vpravo
			}
			break;
		case 5:
			for (int i = 0; i < 2; i++) {		
				dt.line(srX,	srY-i,	srX+6,	srY-i);//spodek
				dt.line(srX,	srY-i-8,srX+6,	srY-i-8);//vrsek
				dt.line(srX,	srY-i-4,srX+5,	srY-i-4);//prostredek
				dt.line(srX+i+5,srY,	srX+i+5,srY-5);//Dole vpravo
				dt.line(srX+i,	srY-4,	srX+i,	srY-9);//Nahore Levo
			}
			break;
		case 6:
			for (int i = 0; i < 2; i++) {		
				dt.line(srX,	srY-i,	srX+6,	srY-i);//spodek
				dt.line(srX,	srY-i-8,srX+6,	srY-i-8);//vrsek
				dt.line(srX,	srY-i-4,srX+5,	srY-i-4);//prostredek
				dt.line(srX+i,	srY,	srX+i,	srY-5);//Dole Levo
				dt.line(srX+i+5,srY,	srX+i+5,srY-5);//Dole vpravo
				dt.line(srX+i,	srY-4,	srX+i,	srY-9);//Nahore Levo
			}
			break;
		case 7:
			for (int i = 0; i < 2; i++) {		
				dt.line(srX,	srY-i-8,srX+6,	srY-i-8);//vrsek
				dt.line(srX+i+5,srY,	srX+i+5,srY-5);//Dole vpravo
				dt.line(srX+i+5,srY-4,	srX+i+5,srY-9);//Nahore vpravo
			}
			break;
		case 8:
			for (int i = 0; i < 2; i++) {		
				dt.line(srX,	srY-i,	srX+6,	srY-i);//spodek
				dt.line(srX,	srY-i-8,srX+6,	srY-i-8);//vrsek
				dt.line(srX,	srY-i-4,srX+5,	srY-i-4);//prostredek
				dt.line(srX+i,	srY,	srX+i,	srY-5);//Dole Levo
				dt.line(srX+i+5,srY,	srX+i+5,srY-5);//Dole vpravo
				dt.line(srX+i,	srY-4,	srX+i,	srY-9);//Nahore Levo
				dt.line(srX+i+5,srY-4,	srX+i+5,srY-9);//Nahore vpravo
			}
			break;
		case 9:
			for (int i = 0; i < 2; i++) {		
				dt.line(srX,	srY-i,	srX+6,	srY-i);//spodek
				dt.line(srX,	srY-i-8,srX+6,	srY-i-8);//vrsek
				dt.line(srX,	srY-i-4,srX+5,	srY-i-4);//prostredek
				dt.line(srX+i+5,srY,	srX+i+5,srY-5);//Dole vpravo
				dt.line(srX+i,	srY-4,	srX+i,	srY-9);//Nahore Levo
				dt.line(srX+i+5,srY-4,	srX+i+5,srY-9);//Nahore vpravo
			}
			break;
		}
	}

	/**
	 * Graficka vizualizace vysledku pomovi nastorje drawingtools.
	 * @author Jakub 
	 * @param dt - nastroj pro kresleni 
	 * @param cx - horizontalni velikost pole
	 * @param cy - veritkalni velikost pole
	 * @param generovanePole - pole vygerenrovane generatorem
	 * @param serPole - serazene pole
	 */
	public static void vytvorGraf(DrawingTool dt, int cx, int cy, int[] generovanePole, int[] serPole) {
		//hodnoty
		int odsZleva 	= 30;
		int odsZprava 	= 5;
		int polovina 	= 233;
		int nulHladHorni= polovina-20;
		int nulHladDolni= cy-20;
		int sirSlo 		= 21;

		dt.setColor(Color.RED);	//horni graf
		for (int i = 0; i < generovanePole.length; i++) { 
			vykresliObdelnik(dt, odsZleva+(sirSlo*i)+(2*i), nulHladHorni, sirSlo, generovanePole[i]); // x - y - sirka - vyska
		}

		dt.setColor(Color.BLUE);	//dolni graf
		for (int i = 0; i < serPole.length; i++) { 
			vykresliObdelnik(dt, odsZleva+(sirSlo*i)+(2*i), nulHladDolni, sirSlo, serPole[i]); // x - y - sirka - vyska
		}

		//nalajnovani
		dt.setColor(Color.BLACK);
		for (int i = 0; i < 2; i++) { //tlusta uprostred
			dt.line(2, polovina-i, cx - odsZprava, polovina-i);
		}
		for (int i = 20; i < 240; i+=20) { // vrchni grid 10
			dt.line(odsZleva, polovina-i, cx - odsZprava, polovina-i);
		}
		for (int i = 20; i < 240; i+=20) { // spodni grid 10
			dt.line(odsZleva, cy-i, cx - odsZprava, cy-i);
		}
		dt.setColor(Color.GRAY);
		for (int i = 20; i < 220; i+=20) { // vrchni grid 5
			dt.line(odsZleva, polovina-i-10, cx - odsZprava, polovina-i-10);
		}
		for (int i = 20; i < 220; i+=20) { // spodni grid 5
			dt.line(odsZleva, cy-i-10, cx - odsZprava, cy-i-10);
		}

		dt.setColor(Color.BLACK);
		//hodnoty os
		//horni
		for (int i = 0; i < 10; i++) {
			vykresliCislo(dt, i*10, 8, (nulHladHorni+5)-(i*20));
		}
		vykresliCislo(dt, 10, 0, nulHladHorni+5-200); //stovka	
		vykresliCislo(dt, 0, 9, nulHladHorni+5-200);  // -//-
		//dolni
		for (int i = 0; i < 10; i++) {
			vykresliCislo(dt, i*10, 8, (nulHladDolni+5)-(i*20));
		}
		vykresliCislo(dt, 10, 0, nulHladDolni+5-200); //stovka	
		vykresliCislo(dt, 0, 9, nulHladDolni+5-200);  // -//-

		//hodnoty grafu horni
		for (int i = 0; i < generovanePole.length; i++) {
			vykresliCislo(dt, generovanePole[i], odsZleva+(sirSlo*i)+(2*i)+4, nulHladHorni+13);
		}

		//hodnoty grafu dolni
		for (int i = 0; i < serPole.length; i++) {
			vykresliCislo(dt, serPole[i], odsZleva+(sirSlo*i)+(2*i)+4, nulHladDolni+13);

		}

	}

	/**              
	 * Ridici metoda
	 * @author Jakub Èervinka
	 * @param      
	 */              
	public static void main(String[] args) {
		if (args.length > 0) {

			try { 
				Scanner sc = new Scanner(new File(args[0]));

				PrintWriter pw = new PrintWriter(
						new BufferedWriter(
								new FileWriter("vystup.txt")));

				while (sc.hasNext() == true) {							//cteni dokomentu
					int vstupníHodnota = sc.nextInt();

					int[] generovanePole = generator(vstupníHodnota);
					int pocetPrvku  = generovanePole.length;
					pw.println(pocetPrvku + " " + Arrays.toString(generovanePole));
					int[] serPole = razeniVkladanim(generovanePole);
					pw.println(pocetPrvku + " " + Arrays.toString(serPole));
					pw.println();
				}	
				sc.close();
				pw.close();

			} catch (IOException e) {
				//e.printStackTrace();
				JOptionPane.showMessageDialog( //error tabulka
						null,
						e.getLocalizedMessage(),
						"Chyba pøi práci se souborem",
						JOptionPane.ERROR_MESSAGE);

			}



		} else {

			Scanner sc = new Scanner(System.in);
			sc.useLocale(Locale.US);

			int VstupniHodnota = vstup(sc);
			int[] neserPole = generator(VstupniHodnota); 
			int[] neserPole2= generator(VstupniHodnota);
			int pocetPrvku  = neserPole.length;
			int[] serPole	= razeniVkladanim(neserPole);

			//vystupy
			System.out.println(pocetPrvku + " " + Arrays.toString(neserPole2));
			System.out.println(pocetPrvku + " " + Arrays.toString(serPole));

			//rozmery plochy grafu (adaptivni podle poctu prvku pole)
			int cx = pocetPrvku * 25;
			int cy = 460;
			
			if (pocetPrvku<=3) {
				cx = pocetPrvku * 25 + 25; //osetreni male kreslici plochy
			} 
			
			

			//vytvori kreslici plochu
			DrawingTool dt = new DrawingTool(cx, cy);

			//zobrazi graf
			vytvorGraf(dt,cx,cy,neserPole2,serPole);
		}
	}

}
