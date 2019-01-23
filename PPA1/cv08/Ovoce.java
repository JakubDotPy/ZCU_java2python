package cv08;

public class Ovoce {
	  
	  private int pocetKg = 10;   // atribut
	  
	  Ovoce (int pocetKg){        // konstuktor
	    setpocetKg(pocetKg);
	  }
	  
	  /** metoda pristupu - setr
	        * @param int pocet kg
	        * @return nevraci hodnotu
	    */
	  void setpocetKg(int pocetKg){
	    if (pocetKg > 0){
	      this.pocetKg = pocetKg;
	    }
	  }
	  /**  metoda pristupu - getr
	        * @param nevyuzit
	        * @return int pocet kg
	    */
	  int getPocetKg(){
	     return this.pocetKg;
	   }
	  /** metoda toString()
	        * @param String text
	        * @return String stav objektu
	    */ 
	  String toString(String s){
	    return "<" + s + getPocetKg() + "[kg]>";
	  }
	}