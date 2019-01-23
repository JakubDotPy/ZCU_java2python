package cv08;

public class Aplikace {
	  
	  public static void main(String [] args){
	    
	    // chybne nastaveni poctu
	    Ovoce jablka = new Ovoce (-100);
	    System.out.println(jablka.toString("jablka: "));
	    
	    //  nastaveni poctu 
	    jablka.setpocetKg(100);
	    //jablka.pocetKg = 100;
	    System.out.println(jablka.toString("jablka: "));
	    
	    // dohromady
	    Ovoce hrusky = new Ovoce (250);
	    System.out.println(hrusky.toString("hrusky: "));
	    System.out.println("Dohromady: " + (jablka.getPocetKg() + hrusky.getPocetKg()) + "[kg]");
	    //System.out.println("Dohromady: " + (jablka.pocetKg + hrusky.pocetKg) + "[kg]");
	  }
	}