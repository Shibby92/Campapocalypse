
public class Player extends Character {

	
	private double inteligence;
	
	
	public Player(String name, double hp, double dex, Weapon weapon, double strenght, double speed, double inteligence){
		super(name, hp, dex, weapon, strenght, speed );
		this.inteligence=inteligence;
	}
	
	
	
	
	
	public double getInteligence() {
		this.inteligence=0.5+Math.random()*(2-(0.5+1));
		return inteligence;
	}


	public double  attack(Character osnov){
		double vrijednostAtt;
		vrijednostAtt=super.attack()*getInteligence();
		return vrijednostAtt;
	}
	
	

	public String toString (){
		StringBuilder sb = new StringBuilder();
		sb.append("Name: " + getName() + "\nHP: " + getHp() + "\nDexterity: "
				+ getDexterity() + "\nWeapon: " + getWeapon().toString()
				+ "\nStrength: " + getStrength() + "\nSpeed: " + getSpeed()+"\nInteligence : " + inteligence);

		return sb.toString();
		
	}
	
	
	public boolean escChance(Character z){
		 int chance = (int) ((this.inteligence*this.getSpeed())/ z.getSpeed());
		return chance >= 1 ? true : false;
	}

	
}
