package pokus;
import java.util.*;
import ppa1.DrawingTool;
//import java.awt.*;

/**
  * Generuje a vykresli nahodnou posloupnost
  * 
  * @author netrvalo@kiv.zcu.cz
  */
public class VykresleniNahodnaPosloupnostMetoda {
  static final int HORNI_MEZ = 3;
  static final int POSUN = 1;
  static final int X_MAX = 400;
  static final int Y_MAX = 400;
  static final int ODSAZENI = 3;
  static DrawingTool dt;
  
  /**
   * Zjisti, zda  zadana posloupnost vyhovuje
   * @param c1 prvni clen testovane posloupnosti
   * @param c2 druhy clen
   * @param c3 treti clen
   * @return true posloupnost vyhovuje
  */
  static boolean posloupnostVyhovuje(int c1, int c2, int c3) {
    return (c1 == 1  &&  c2 == 2  &&  c3 == 3);
  }
  
   /**
   * Nakresli svislou caru v meritku 100:1
   * @param xSouradnice x-ova souradnice (tj. poradi)
   * @param hodnota delka svisle cary
   */
  static void cara(int xSouradnice, int hodnota) {
    dt.line(xSouradnice, Y_MAX, xSouradnice, Y_MAX - (hodnota * 100));
  }
  
  /**
   * Generuje nahodnou posloupnost
   * @param args nepouzito
   */
  public static void main(String[] args) {
    Random r = new Random();
    dt = new DrawingTool(X_MAX, Y_MAX);
    int pocet = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    
    while (!posloupnostVyhovuje(i1, i2, i3)) {
      i1 = i2;
      i2 = i3;
      i3 = POSUN + r.nextInt(HORNI_MEZ);
      cara(pocet * (1+ODSAZENI), i3); // 1 pro zapocteni tloustky cary
      pocet++;
      //System.out.print(" " + i3);
    }
    System.out.println();
  }
  
 
  
}