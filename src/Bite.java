
public class Bite extends Weapon {
	private String nameWeapon;
	
	public Bite(){
		nameWeapon="Bite";
	}
	
	public String toString (){
		String output="";
		output= "Oruzije: " + nameWeapon;
		return output;
	}
}
