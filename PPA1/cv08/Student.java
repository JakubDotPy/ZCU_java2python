package cv08;

public class Student {
	
	//atributy
	private String osobniCislo;
	private int prumerZnamek;
	
	//konstruktor
	public Student(String osobniCislo, int prumerZnamek){
		this.osobniCislo = osobniCislo;
		setPrumerZnamek(prumerZnamek);
	}
	
	//get set
	public String getOsobniCislo() { 
		return osobniCislo; 
	}

	public int getPrumerZnamek(){
		return prumerZnamek;
	}
	
	public void setPrumerZnamek(int prumerZnamek) {
		if (prumerZnamek > 0) {
			this.prumerZnamek = prumerZnamek;
		}
	}
		
	//to string
	String toString(String s){
	    return "<Osobni cislo: "+getOsobniCislo()+", prumer = "+getPrumerZnamek()+">";
	  }
	
	//vypocty
	public String vratLepsiPrumer(Student s){
		
		return toString();
	}
	
}
