
public class Uzi extends Weapon {
	private String nameWeapon;
	
	public Uzi (double dmg, double critical, double ammo){
		super(dmg,critical,ammo);
		nameWeapon="Uzi";
	}
	
	
	public String getNameWeapon() {
		return nameWeapon;
	}


	public void setNameWeapon(String nameWeapon) {
		this.nameWeapon = nameWeapon;
	}


	public String toString (){
		String output="";
		output= "Oruzije: " + nameWeapon;
		return output;
	}
	
}
