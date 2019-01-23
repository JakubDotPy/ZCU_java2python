package cv03;

public class ctverec {

	int strana;
	
	public ctverec(int strana) {
		if (strana > 0) {
	     this.strana = strana;
		}
		else
			this.strana = 1;
	}
	
	public int spoctiObsah(){
		return strana*strana;
	}
	
	public String toString(){
		return ("Delka strany = " + strana + "\nObsah ctverce = " + spoctiObsah());
	}
	
	public int spoctiCtverce(ctverec c){
		return (int)(c.spoctiObsah() / spoctiObsah());
	}
	
}
