
public class Bone extends Weapon {
private String nameWeapon;

Bone(double dmg, double critical, double ammo){
	super(dmg,critical,ammo);
	nameWeapon="Bone";
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
