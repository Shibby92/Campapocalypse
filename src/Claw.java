
public class Claw extends Weapon {
	private String nameWeapon;
	
	
Claw(double dmg, double critical, double ammo){
	super(dmg,critical,ammo);
	nameWeapon="Claw";
	
}

public String toString (){
	String output="";
	output= "Oruzije: " + nameWeapon;
	return output;
}

public String getNameWeapon() {
	return nameWeapon;
}

public void setNameWeapon(String nameWeapon) {
	this.nameWeapon = nameWeapon;
}



}
