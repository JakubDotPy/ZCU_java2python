package cv04;
import java.util.*;

public class Ppa1_cv04_1_A11B0699P {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Zadej cislo a: ");
    double a = sc.nextDouble();
    System.out.print("Zadej cislo b: ");
    double b = sc.nextDouble();
    double vysledek = (-b/a);
    
    System.out.println("---Vysledky---");
    if (a == 0 && b==0) {
		System.out.print("Rovnice: 0 * x + 0 = 0" + "\n" +
				"ma nekonecne reseni");		
	} else if (a == 0) {
		System.out.print("Rovnice: 0 * x + "+(int)b+" = 0" + "\n" +
				"nema reseni v R");	
	} else if (b == 0) {
		System.out.print("Rovnice: "+(int)a+" * x + 0 = 0" + "\n" +
				"ma reseni x = 0.0");
	} else {
		System.out.print("Rovnice: "+(int)a+" * x + "+(int)b+" = 0" + "\n" +
				"ma reseni x = "+ vysledek);	
	}
  }
}