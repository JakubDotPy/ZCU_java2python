package SP;

import java.awt.Color;
import java.io.*;
import java.util.*;
import ppa1.*;

public class XXXX_SP_A11B0699P {

	/**
	 * Metoda pro zadavani vstupniho cisla rucne uzivatelem.
	 * @author Jakub
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
	 * @author Jakub 
	 * @param poleN - Pomocne pole pro porovnavani
	 */
	public static boolean porovnavani (int [] poleN,int vstupniCislo2) {
		for (int i=0; i < poleN.length-1; i++){
			if (vstupniCislo2 == poleN[i]){
				return false;
			}
			
		}
		return true;
	}
	
	/**
	 * Algorytmus generovani pseudonahone posloupnosti (dale jen PNP).
	 * @author Jakub 
	 * @param vstupniCislo - hodnota pro generovani posloupnosti
	 */
	public static int[]  generator (int vstupniCislo){ 
		
		int[] pole = new int[1];		//vytvori pole o velikosti 1 
			pole[0] = vstupniCislo;		//a ulozi do nej vstupni hodnotu
			
			int[] poleN = null;
			int vstupniCislo2 = 0;
			int vetsiPole = 2;	
			
				do   {
					poleN = new int[vetsiPole];						  //vytvori pole o 1 vetsi
					for (int i = 0; i < pole.length; i++) {			  //prenda do nej hodnoty puvodniho pole
						poleN[i] = pole[i];
						}
					
						int nadruhou = vstupniCislo * vstupniCislo;	  //vypocte dalsi clen PNP
						String retezec = Integer.toString(nadruhou);  //		  |
						String orez = retezec.substring(0, 2);		  //		  |
						//System.out.println(orez);					  //		  |
						vstupniCislo2 = (Integer.parseInt(orez)) + 1; //		  V
						//System.out.println(vstupniCislo2);          
						poleN[poleN.length - 1] = vstupniCislo2;	  //ulozi jej na posledni misto v poli
						vstupniCislo = vstupniCislo2;				  //a pripravi na dalsi cyklus
						vetsiPole ++;
						pole = poleN;
						
				//System.out.println(vstupniCislo2);
				//System.out.println(Arrays.toString(poleN));	
						
				} 
				while (porovnavani(poleN,vstupniCislo2));			  //dokud se nektery z prvku neopakuje
				
				int[] mensiPoleN = new int[poleN.length -1];	// smaze posledni prvek v poli (ktery se opakoval)
				for (int i = 0; i < poleN.length -1; i++) {
					mensiPoleN[i] = poleN[i];
					}
				return mensiPoleN;
		//System.out.println(Arrays.toString(poleN));
		//System.out.println(Arrays.toString(mensiPoleN));
	}

	/**
     * Serazeni pole pomoci metody "razeni vkladanim".
	 * @author Jakub 
	 * @param generovanePole - vygenerovane pole z generatoru
	 */
	public static int[] razeniVkladanim(int[] generovanePole) {
		    for (int k = 1; k < generovanePole.length; k++) {
		      int pom = generovanePole[k];
		      int i;
		      // posun od posledniho prvku
		      for (i = k - 1; i >= 0 && generovanePole[i] > pom; i--) {
		    	  generovanePole[i + 1] = generovanePole[i];
		      }
		      generovanePole[i + 1] = pom;
		    }
		    return generovanePole;
		  }
	
	/**
	 * Graficka vizualizace vysledku pomovi nastorje drawingtools.
	 * @author Jakub 
	 * @param dt - nastroj pro kresleni 
	 * @param cx - horizontalni velikost pole
	 * @param cy - veritkalni velikost pole
	 * @param generovanePole - pole vygerenrovane generatorem
	 * @param serPole - serazene pole
	 * @param pokusnePole - pomocne pole
	 */
	private static void vytvorGraf(DrawingTool dt, int cx, int cy, int[] generovanePole, int[] serPole, int[] pokusnePole) {
		
		int[] serazene = serPole;
		int[] pokus = pokusnePole;
		 
	//nalajnovani
		dt.setColor(Color.GRAY);
		int osaY = 20;
		while (osaY <= 450) {
			dt.line(0, osaY, cx, osaY); 
			if (osaY == 220){
				osaY += 10;
			}
			else {
				osaY += 20;
			}
		} 
	//vykresleni horního grafu		
			for (int a = 0; a < generovanePole.length; a++) { 		//postupne vykresleni vsech hodnot
				
				int srdnceX = a * 25;                               //posun po ose X
				//vykresleni jednoho sloupce "a"
				for (int i = 0; i <= 10; i++) {
					dt.setColor(new Color(0,30,255));
					dt.line(srdnceX + 5 + i, 220, srdnceX + 5 + i,
							(220 - (pokus[a] * 2)));
				}
				for (int j = 0; j <= 5; j++) {									//    3D efekt
					dt.setColor(new Color(0,8,96));                             //		  | 
					dt.line(srdnceX + 16 + j, 220 - j, srdnceX + 16 + j,        //		  | 
							(220 - j - (pokus[a] * 2)));                        //		  | 
				}                                                               //		  | 
				for (int k = 0; k <= 5; k++) {                                  //		  |
					dt.setColor(new Color(58,75,255));                          //		  |
					dt.line(srdnceX + 6 + k,                                    //		  |
							(220 - k - 1 - (pokus[a] * 2)), srdnceX             //		  |
									+ 16 + k,(220 - k - 1 - (pokus[a] * 2)));   //		  V
				}
			} 
	//vykresleni dolniho grafu		
			for (int a = 0; a < serPole.length; a++) {              //postupne vykresleni vsech hodnot
				                                                                                      
				int srdnceX = a * 25;                               //posun po ose X                  
				//vykresleni jednoho sloupce "a"
				for (int i = 0; i <= 10; i++) {
					dt.setColor(new Color(255,0,0));
					dt.line(srdnceX + 5 + i, 450, srdnceX + 5 + i,
							(450 - (serazene[a] * 2)));
				}
				for (int j = 0; j <= 5; j++) {								    //    3D efekt
					dt.setColor(new Color(150,0,0));                            //		  |   
					dt.line(srdnceX + 16 + j, 450 - j, srdnceX + 16 + j,        //		  |   
							(450 - j - (serazene[a] * 2)));                     //		  |   
				}                                                               //		  |   
				for (int k = 0; k <= 5; k++) {                                  //		  |   
					dt.setColor(new Color(255,40,40));                          //		  |   
					dt.line(srdnceX + 6 + k,                                    //		  |   
							(450 - k - 1 - (serazene[a] * 2)), srdnceX            //	  |   
									+ 16 + k,(450 - k - 1 - (serazene[a] * 2)));   //	  V   
				} 
			}
	}
	
	/**              
	 * Ridici metoda
	 * @author Jakub 
	 * @param        
	 */              
	public static void main(String[] args) {
		if(args.length > 0) {
			//FileReader fr = null;
			try { 
				Scanner sc = new Scanner(new File(args[0]));
				
				PrintWriter pw = new PrintWriter(
								 new BufferedWriter(
								 new FileWriter("vystup.txt")));
				
				while (sc.hasNext() == true) {							//cteni dokomentu
					int vstupníHodnota = sc.nextInt();
			
					int[] generovanePole = generator(vstupníHodnota);
					pw.println(generovanePole.length + " " + Arrays.toString(generovanePole));
					int[] serPole = razeniVkladanim(generovanePole);
					pw.println(generovanePole.length + " " + Arrays.toString(serPole));
					pw.println();
				}	
					sc.close();
					pw.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			

		} else {
			Scanner sc = new Scanner(System.in);
			sc.useLocale(Locale.US);
	
			int vstupníHodnota = vstup(sc);
			
			int[] pokusnePole = generator(vstupníHodnota);
			int[] generovanePole = generator(vstupníHodnota);
				System.out.println(generovanePole.length + " " + Arrays.toString(generovanePole));
			int[] serPole = razeniVkladanim(generovanePole);
				System.out.println(generovanePole.length + " " + Arrays.toString(serPole));
	
				
				//rozmery plochy (adaptivni podle poctu prvku pole)
				int cx = generovanePole.length * 25;
				int cy = 451;
				
				//vytvori kreslici plochu
				DrawingTool dt = new DrawingTool(cx, cy);
				
				//zobrazi graf
				vytvorGraf(dt,cx,cy,generovanePole,serPole,pokusnePole);
		}
	}

}
