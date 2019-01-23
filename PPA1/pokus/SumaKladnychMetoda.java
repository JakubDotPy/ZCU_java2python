package pokus;
import java.util.*;

/**
  * Nacitani cisel z klavesnice a soucet kladnych cisel 
  * 
  * @author netrvalo
  */
public class SumaKladnychMetoda {
  
  static boolean jeKladne(int cislo){
    if (cislo > 0){
      return true;
    }
    else {
      return false;
    }
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Zadej pocet cisel: ");
    int n = sc.nextInt();
    
    int suma = 0;
    for (int i = 1;  i <= n;  i++) {
      System.out.print("Zadej " + i + ". cislo: ");
      int cislo = sc.nextInt();
      if(jeKladne(cislo))
        suma += cislo;
    }
    System.out.println("Suma = " + suma);
  }
}