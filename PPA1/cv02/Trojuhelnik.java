package cv02;
import java.awt.*;
import ppa1.DrawingTool;

public class Trojuhelnik {
  public static void main(String[] args) {
    DrawingTool dt = new DrawingTool(
                     310, 210, Color.YELLOW, true);
    dt.setColor(Color.BLUE);
    dt.line(5, 205, 155, 5);
    dt.setColor(Color.RED);
    dt.line(155, 5, 305, 205);
    dt.setColor(Color.GREEN);
    dt.line(5, 205, 305, 205);
  }
}
