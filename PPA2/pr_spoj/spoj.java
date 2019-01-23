package pr_spoj;

public class spoj {

	
	public static void main(String[] args) {
		
		int cislo = 1;
		
		//polozka head = null;
		
		
		polozka pom = new polozka(cislo);
		polozka head = pom;
		
				
		pom.dalsiPol = new polozka(++cislo);
		pom = pom.dalsiPol;
		
		pom.dalsiPol = new polozka(++cislo);
		
		
		pom = head;
		int soucet = 0;
		while(pom != null){
			soucet += pom.hodnota;
			pom = pom.dalsiPol;
		}
		
		System.out.println("soucet = "+soucet);
	}

}
