package cv03;
import org.omg.CORBA.NVList;


public class hlavni {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
    ctverec c1 = new ctverec(2);
    ctverec c2 = new ctverec(4);
    System.out.println(c1.toString() + "\n\n" + c2.toString());
	
    System.out.println("\n" + c1.spoctiCtverce(c2));
    
	}

}
