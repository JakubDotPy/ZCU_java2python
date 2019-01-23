package cv03;

public class ucet {
	String jmeno; 
	polozka vklad;
	polozka vyber;
	ucet dalsi;

	public ucet(String jmeno) {
		this.jmeno = jmeno;
		this.dalsi = null;
		this.vklad = null;
		this.vyber = null;
	}

	public int sectiVklady() {
		int soucet = 0;

		polozka pom = vklad;

		while (pom != null) {
			soucet += pom.hodnota;
			pom = pom.dalsi;
		}
		return soucet;
	}

	public int sectiVybery() {
		int soucet = 0;

		polozka pom = vyber;

		while (pom != null) {
			soucet += pom.hodnota;
			pom = pom.dalsi;
		}
		return soucet;
	}
	
	public boolean maDebet() {	

		if ((sectiVklady() - sectiVybery()) < 0) {
			System.out.println(jmeno);
			return true;
		}		
		else {
			return false;
		}
	}
	
	public void vlozit(int penize) {
		polozka pom = vklad; 
		while (pom != null) {
			pom = pom.dalsi;
		}
		pom = new polozka(penize);
	}
	
	public void vybrat(int penize) {
		polozka pom = vyber; 
		while (pom != null) {
			pom = pom.dalsi;
		}
		pom = new polozka(penize);
	}
	
	
}
