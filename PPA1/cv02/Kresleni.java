package cv02;

import java.awt.*;
import ppa1.DrawingTools;


public class Kresleni {
  public static void main(String[] args) {
    // inicializace: sirka = 300, vyska = 200, barva pozadi = bila
    DrawingTool dt = new DrawingTool(
                     300, 200, Color.WHITE, true);
    // nastaveni barvy cary na cernou
    dt.setColor(Color.BLACK);
    // nakresleni uhlopricky z leveho horniho rohu [0, 0]
    // do praveho dolniho rohu [300 - 1, 200 - 1]
    dt.circle(0, 0, 299, 199);
  }
}
