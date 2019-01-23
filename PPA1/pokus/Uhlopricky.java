package pokus;

import java.awt.*;
import ppa1.DrawingTool;

public class Uhlopricky {
  public static void main(String[] args) {
    // inicializace: sirka = 300, vyska = 200, barva pozadi = bila
    DrawingTool dt = new DrawingTool(
                     300, 200, Color.YELLOW, true);
    // nastaveni barvy cary na modrou
    dt.setColor(Color.BLUE);
    // nakresleni uhlopricky z leveho horniho rohu [0, 0]
    // do praveho dolniho rohu [300 - 1, 200 - 1]
    dt.line(0, 0, 299, 199);
    // nakresleni uhlopricky z leveho dolniho rohu [0, 199]
    // do praveho horniho rohu [300 - 1, 0]
    dt.line(0, 199, 299, 0);
  }
}
