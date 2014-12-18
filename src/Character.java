public class Character {
	private String name;
	private double hp;
	private double dexterity;
	private Weapon weapon;
	private double strength;
	private double speed;

	
	
	public Character(String name, double hp, double dexterity, Weapon weapon,
			double strength, double speed) {
		this.name = name;
		this.hp = hp;
		this.dexterity = dexterity;
		this.weapon = weapon;
		this.strength = strength;
		this.speed = speed;
	}

	public attack() {

	}

	public specialAttack() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}

	public double getDexterity() {
		return dexterity;
	}

	public void setDexterity(double dexterity) {
		this.dexterity = dexterity;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public double getStrength() {
		return strength;
	}

	public void setStrength(double strength) {
		this.strength = strength;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: " + getName() + "\nHP: " + getHp() + "\nDexterity: "
				+ getDexterity() + "\nWeapon: " + this.weapon.toString()
				+ "\nStrength: " + getStrength() + "\nSpeed: " + getSpeed());

		return sb.toString();
	}

}
