package cv08;



public class OsobaVek {
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
