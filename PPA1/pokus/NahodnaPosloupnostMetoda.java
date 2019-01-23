package pokus;
import java.util.*;

public class NahodnaPosloupnostMetoda {
  static final int HORNI_MEZ = 3;
  static final int POSUN = 1;
  
  static boolean posloupnostVyhovuje(int c1, int c2, int c3) {
    return (c1 == 1  &&  c2 == 2  &&  c3 == 3);
  }
  
  public static void main(String[] args) {
    Random r = new Random();  
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    
    while (!posloupnostVyhovuje(i1, i2, i3)) {
      i1 = i2;
      i2 = i3;
      i3 = POSUN + r.nextInt(HORNI_MEZ);
      System.out.print(" " + i3);
    }
    System.out.println();
  }
}