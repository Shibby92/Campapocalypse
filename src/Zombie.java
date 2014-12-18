
public class Zombie extends Character {
	
	public Zombie(String name, double hp, double dexterity, Weapon weapon,
			double strength, double speed) {
	super(name, hp, dexterity, weapon, strength, speed);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: " + getName() + "\nHP: " + getHp() + "\nDexterity: "
				+ getDexterity() + "\nWeapon: " + getWeapon().toString()
				+ "\nStrength: " + getStrength() + "\nSpeed: " + getSpeed());

		return sb.toString();
	}
	public double specAttack(){
		return 0;
	}

}
