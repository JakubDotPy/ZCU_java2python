package cv08;

/**
 * Datova trida pro prvni priklad cviceni
 * umoznuje vypocet BMI
 * @author P.Herout
 */
public class Osoba {
  // atributy
  private String jmeno;
  private int vaha;
  private int vyska;
  
  // konstruktor  
  public Osoba(String jmeno, int vaha, int vyska) {
    this.jmeno = jmeno;
    setVaha(vaha);
    this.vyska = vyska;    
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

  // ostatni metody
  public int vypoctiBMI() {
    double vyskaMetry = vyska / 100.0;
    double bmi = vaha / (vyskaMetry * vyskaMetry);
    return (int) Math.round(bmi);  // zaokrouhleni
  }
  
  public String toString() {
    return "\n<" + jmeno 
           + ", vaha: " + vaha
           + ", vyska: " + vyska 
           + ", BMI: " + vypoctiBMI()
           + ">";    
  }
}
