package cv04;

public class zavorka {
	char znak;
	zavorka dalsi;

	public zavorka(char znak) {
		this.znak = znak;
		dalsi = null;
	}

	public String toString(){
		String vypis = "";
		
		while (dalsi != null) {
			vypis = vypis+znak+" ";
			
		}

		return vypis;

	}
}
