public class Player extends Character {

	private double inteligence;

	public Player(String name, double hp, double dex, Weapon weapon,
			double strenght, double speed, double inteligence) {
		super(name, hp, dex, weapon, strenght, speed);
		this.inteligence = inteligence;
	}

	public double getInteligence() {
		return inteligence;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: " + getName() + "\nHP: " + getHp() + "\nDexterity: "
				+ getDexterity() + "\nWeapon: " + getWeapon().toString()
				+ "\nStrength: " + getStrength() + "\nSpeed: " + getSpeed()
				+ "\nInteligence : " + inteligence);

		return sb.toString();

	}

	public double attack() {
		double initAttack = super.attack();
		System.out.println(initAttack);
		initAttack *= inteligence;
		return initAttack;
	}

	public boolean escChance(Zombie other) {
		if ((int) ((this.inteligence * this.getSpeed()) / other.getSpeed()) != 0)
			return true;
		return false;
	}

}
