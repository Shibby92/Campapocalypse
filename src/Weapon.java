
public class Weapon {

	private double dmg;
	private double critical;
	private double ammo;
	
	public Weapon(double dmg, double critical, double ammo){
		this.dmg=dmg;
		this.critical=critical;
		this.ammo=ammo;
	}
	
	public String toString(){
		 String str="";
		 str+="Damage: " + dmg + "Critical hit: " + critical + "Curent Ammo: " + ammo;
		 return str;
	}
	
	
}
