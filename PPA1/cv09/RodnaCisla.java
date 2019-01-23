package cv09;

import java.util.Scanner;

/**
 * Vypisuje datum narozeni z rodneho cisla
 * v ruznych formatech
 * @author P.Herout, J. Kohout
 */
public class RodnaCisla {  
  static final int R_LIMIT = 54;
  static int den;
  static int mesic;
  static int rok;
  
  static String odstranPomlcky(String radka) {
    return radka.replaceAll("[-/]","");  
  }
  
  static void rozeberRodneCislo(String cislo) {
    String r = cislo.substring(0, 2);
    String m = cislo.substring(2, 4);
    String d = cislo.substring(4, 6);
    rok = Integer.parseInt(r) ;
    if (cislo.length() == 9 || rok >= R_LIMIT) {
      rok += 1900;  //stary format cisla platny do 1.1.1954 mel jen 9 cislic
    }
    else {
      rok += 2000;
    }

    mesic = Integer.parseInt(m);    
    //Zeny maji u mesice +50
    //Od roku 2004 (z�konem �. 53/2004 Sb.) je zavedena mo�nost v p��pad�, �e jsou v n�jak� den vy�erp�na v�echna platn� �ty���sl�, 
    //pou��t alternativn� rodn� ��slo, u kter�ho maj� mu�i k ��slu m�s�ce p�i�teno 20 a �eny 70.
    if (mesic > 50) {
      mesic -= 50;
    }
    if (mesic > 20) {
      mesic -= 20;
    }
    
    den = Integer.parseInt(d);
  }  

  static String dodejLomitko(String cislo) {    
      String pred = cislo.substring(0, 6);
      String za = cislo.substring(6);
      return (pred + "/" + za);      
  }
  
  /**
   * Pracuje s rodnymi cisly
   * @param args nepouzito
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String radka = sc.nextLine();
    while (radka.length() > 0) {
      System.out.print(radka + "\t -> ");
      String cislo = odstranPomlcky(radka);
      rozeberRodneCislo(cislo);
      System.out.format("%02d.%02d.%04d -> ", den, mesic, rok);
      System.out.print(dodejLomitko(cislo));
      if (cislo.charAt(2) > '2') {
        System.out.println(" -> F");
      }
      else {
        System.out.println(" -> M");
      }
      
      radka = sc.nextLine();
    }
  }
}

