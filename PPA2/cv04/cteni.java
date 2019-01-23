package cv04;

import java.util.Scanner;

public class cteni {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("zadej vyraz");
		String vyraz = sc.next();
		System.out.println("vyraz = " + vyraz);

		zavorka head = null;

		zavorka pom = head;

		for (int i = 0; i < vyraz.length(); i++) {
			switch (vyraz.charAt(i)) {
			case '(':
				pom = new zavorka(vyraz.charAt(i));
				if (head == null) {
					head = pom;
				}
				pom = pom.dalsi;
				System.out.println(head.toString());
				break;

			case '[':
				pom = new zavorka(vyraz.charAt(i));
				if (head == null) {
					head = pom;
				}
				pom = pom.dalsi;
				System.out.println(head.toString());
				break;

			case '{':
				pom = new zavorka(vyraz.charAt(i));
				if (head == null) {
					head = pom;
				}
				pom = pom.dalsi;
				System.out.println(head.toString());
				break;

			case ')':
				if (pom.znak == '(') {
					pom = null;
					System.out.println(head.toString());

					pom = head;
					while (pom != null) {
						pom = pom.dalsi;
					}
				}else {
					System.out.println("chybi prava zavorka k " + pom.znak);
				}
				break;

			case ']':
				if (pom.znak == '[') {
					pom = null;
					System.out.println(head.toString());

					pom = head;
					while (pom != null) {
						pom = pom.dalsi;
					}
				}else {
					System.out.println("chybi prava zavorka k " + pom.znak);
				}
				break;

			case '}':
				if (pom.znak == '{') {
					pom = null;
					System.out.println(head.toString());

					pom = head;
					while (pom != null) {
						pom = pom.dalsi;
					}
				}else {
					System.out.println("chybi prava zavorka k " + pom.znak);
				}
				break;

			default: //pismeno
				break;
			}

		}



	}
}

