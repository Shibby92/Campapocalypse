
public class Jockey extends Zombie {
	public Jockey(String name, double hp, double dexterity, Weapon weapon,
			double strength, double speed) {
	super(name, hp, dexterity, weapon, strength, speed);
}
	@Override
	public double specAttack() {
		return super.specialAttack()*3;
	}
}