package cv04;
import java.util.*;

public class Ppa1_cv04_2_A11B0699P {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
	    System.out.print("Zadej realne cislo: ");
	    double x = sc.nextDouble();
	    
	    System.out.println("---Vysledky---");
	    
	    if (x>0) {
	    	System.out.println("10^"+x+" = "+(double)Math.pow(10,x));	
		} else if (x<0) {
			System.out.println(Math.abs(x)+" odmocnina z 10 = "+(double)Math.pow(10, -1/x));
		} else {
			System.out.println("Vstup = 0.0");
		}

	}

}
