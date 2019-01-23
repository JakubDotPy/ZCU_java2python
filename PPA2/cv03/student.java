package cv03;

public class student {
	String fakulta;
    String osCislo;

   public student() {
   }
   
   protected void setFakulta(String fakulta) {
	this.fakulta = fakulta;
    }
   
   public void setOsCislo(String osCislo) {
	this.osCislo = osCislo;
    }
   
   public String getFakulta() {
	return fakulta;
    }
   
  public String getOsCislo() {
	return osCislo;
    }
   
    
   public student(String f, String oC) {
   this.fakulta = f;
   this.osCislo = oC;
}
	
}
