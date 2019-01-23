package cv10;

import java.util.*;

public class UplneOsetreniVyjimky {
	
	public static int ctiDecKontrola(){
		Scanner sc = new Scanner(System.in);
	
	    String cislo = sc.nextLine();
	    
	    int dekadicky = 0;
	    try {
			dekadicky = Integer.parseInt(cislo, 10);
			
		} catch (NumberFormatException e) {
			System.out.println("Zadano cislo ve spatnem formatu.");
			
		}
	    return dekadicky;	
	}
	
	public static void main(String[] args) {
	    System.out.print("Zadej cislo: ");
	    int cislo = ctiDecKontrola();
			
	    if(cislo!=0){
		System.out.println("Zadano: " + cislo);
	    }
		
	}
			
		
	}
	

