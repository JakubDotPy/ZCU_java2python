package cv08;

import java.util.*;

/*class OsobaVek { //vlozena trida kvuli validatoru
	// atributy
	private String jmeno;
	private int vaha;
	private int vyska;
	private int vek;

	// konstruktor  
	public OsobaVek(String jmeno,int vek, int vaha, int vyska) {
		this.jmeno = jmeno;
		setVaha(vaha);
		this.vyska = vyska;  
		setVek(vek);
	}

	// getry a setry
	// BES: pozn. jmeno osoby, jakmile zalozena, nelze menit
	public String getJmeno() { 
		return jmeno; 
	}

	public int getVaha() { 
		return vaha; 
	}

	public void setVaha(int vaha) {
		if (vaha > 0) {
			this.vaha = vaha;
		}
	}

	public int getVyska() { 
		return vyska; 
	}

	public void setVyska(int vyska) {
		if (vyska > 0) {
			this.vyska = vyska;
		}
	}

	public int getVek() { 
		return vek; 
	}

	public void setVek(int vek) {
		if (vek > 0) {
			this.vek = vek;
		}
	}
	// ostatni metody
	public int vypoctiBMI() {
		double vyskaMetry = vyska / 100.0;
		double bmi = vaha / (vyskaMetry * vyskaMetry);
		return (int) Math.round(bmi);  // zaokrouhleni
	}

	public String toString() {
		return "\n<" + jmeno 
				+ ", vek: " + vek
				+ ", vaha: " + vaha
				+ ", vyska: " + vyska
				+ ", BMI: " + vypoctiBMI()
				+ ">";    
	}
}

 */
public class Ppa1_cv08_1_A11B0699P {
	
private static Scanner sc;
	
	public static OsobaVek vytvorANactiOsobu() { //vytvoreni osoby
	    //System.out.print("Jmeno: ");
	    String jmeno = sc.next();
	    
	    //System.out.print("Vek: ");
	    int vek = sc.nextInt();
	    
        //System.out.print("Vaha: ");
	    int vaha = sc.nextInt();
	    
        //System.out.print("Vyska: ");
	    int vyska = sc.nextInt();
	    
	    //sc.nextLine();  // precteni konce radky
	    OsobaVek o = new OsobaVek(jmeno, vek, vaha, vyska);
	    return o;
	  }
	
	public static OsobaVek minVek(OsobaVek[] pole) { 
		OsobaVek pom = pole[0];
      for (int i = 0;  i < pole.length - 1;  i++) {
        if (pom.getVek() > pole[i+1].getVek()){
          pom = pole[i+1];
        }
      }
	    OsobaVek min_vek = pom;
		return min_vek;
	  }
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
	    sc.useLocale(Locale.US);
	    int n = sc.nextInt(); //pocet osob
	    
	    OsobaVek[] osoby = new OsobaVek[n];
	    for (int i = 0;  i < osoby.length;  i++) {
	        osoby[i] = vytvorANactiOsobu();
	      }
      System.out.println("---Vysledky---");
      System.out.print("Nejmladsi osoba je: ");
	    System.out.print(minVek(osoby).toString());
	}
	
}
