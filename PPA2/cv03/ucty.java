package cv03;
import java.util.Scanner;


public class ucty {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ucet head = null;
		String jmeno = "";
		
		while (true) {
			ucet pomU = head;
			
			jmeno = sc.next();
			if (jmeno.equals("0")) break;
			sc.nextLine();
			
			while (pomU != null) {
				if (jmeno.equals(pomU.jmeno)) {
					break;
				}
				pomU = pomU.dalsi;
			}
			
			if (pomU == null) {pomU = new ucet(jmeno);}
			
			
			
			int penize = sc.nextInt();
			if (penize > 0) {
				pomU.vlozit(penize);
			} else {
				pomU.vybrat(penize);
			}
			
			System.out.println(">>>" + pomU.jmeno + " " + pomU.vklad);
		}
		
		System.out.println("Debet ma");
		ucet pomU = head;
		while (pomU != null) {
			pomU.maDebet();
		}
		
	}
}
