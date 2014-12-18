
public class Smoker extends Zombie {
	public Smoker (String name, double hp, double dexterity, Weapon weapon,
			double strength, double speed) {
	super(name, hp, dexterity, weapon, strength, speed);
}
	@Override
	public double specAttack() {
		return 0;
	}
}