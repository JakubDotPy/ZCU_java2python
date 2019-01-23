package cv09;



import java.util.*;

public class Ppa1_cv09_3_A11B0699P {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Zadej text: ");
		String text = sc.nextLine();
		text = text.replace(" ","");
		text = text.replace(".","");
		text = text.toLowerCase();
		//System.out.println(text);

		boolean palindrom = true;

		for (int i = 0; i < (text.length()-1); i++) {
			if (text.charAt(i)!=text.charAt(text.length()-1-i)) {
				//System.out.println("chyba");
				palindrom = false;
			}
		}

		System.out.println("---Vysledky---");
		System.out.println(palindrom);
	}

}





