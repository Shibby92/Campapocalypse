
public class Weapon {

	private double dmg;
	private double critical;
	private double ammo;
	
	public Weapon(){
		this.dmg=0;
		this.critical=0;
		this.ammo=0;
	}
	
	public String toString(){
		 String str="";
		 str+="Damage: " + dmg + "Critical hit: " + critical + "Curent Ammo: " + ammo;
		 return str;
	}
	
	
}
