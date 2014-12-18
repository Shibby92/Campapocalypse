
public class Katana extends Weapon{
	private String nameWeapon;
	
	
public Katana(double dmg, double critical, double ammo){
	super(dmg,critical,ammo);
	nameWeapon="Katana";
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
