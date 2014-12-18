import java.util.Scanner;

public class TestGame {

	public static void main(String[] args) {
		System.out
				.println("Bila je strasna i tmurna noc...sinoc...danas  je vec druga situacija suncano, cak \nmjestimicno oblacno naravno"
						+ "trebamo bniti iskreni i reci da je onako cak pretoplo ya \n ovo doba godine....probas da se sakrije od ove odvratne  zege u jednoj staroj napustenoj "
						+ "kuci. Cujes nesto tamo suska, realno boli trebe briga sta \nsuska ti probas da nadjes lampu...a ono suskaaaaaa.....nadjes lampu ... \npalis je...."
						+ "KAD IMAS STA VIDJET EMINA....");

		Player first = new Player("Haris", 350, 0.5, null, 8, 5, 2);
		// System.out.println(first.attack());
		// Emina mina=new Emina ("Emina",97,0.7,null,8,15);
		// Smoker smoke=new Smoker ("SmEmina",80,0.6,null,7,14);
		// Spitter spit=new Spitter ("SpEmina",79,0.5,null,6,13);
		// Jockey jock=new Jockey ("JockEmina",75,0.4,null,3,12);
		// Charger charge=new Charger ("ChargEmina",67,0.3,null,2,11);
		Scanner in = new Scanner(System.in);
		int br = 0;
		Zombie[] prvi = new Zombie[15];
		while (br < 15) {

			int broj = (int) (1 + (Math.random() * (5)));
			switch (broj) {
			case 1:
				prvi[br] = new Emina("Emina", 97, 0.7, null, 8, 15);
				break;
			case 2:
				prvi[br] = new Smoker("SmEmina", 80, 0.6, null, 7, 14);
				break;
			case 3:
				prvi[br] = new Spitter("SpEmina", 79, 0.5, null, 6, 13);
				break;
			case 4:
				prvi[br] = new Jockey("JockEmina", 75, 0.4, null, 3, 12);
				break;
			case 5:
				prvi[br] = new Charger("ChargEmina", 67, 0.3, null, 2, 11);
				break;

			}
			br++;
		}
		int run;
		for (int i = 0; i < prvi.length; i++) {
			System.out.println("Novi ZOMBIE... Bjezati ili ne?");
			run = in.nextInt();
			if (run == 1 && !first.escChance(prvi[i])) {
				System.out.println("Niste uspjeli pobjeci, bijte se!\n.\n.BUM!\n.\n.TRS!\n.\n.POAW!\n.");
				if (first.surviveBattle(prvi[i])) {
					System.out.println("Prezivjeli ste " + (i + 1)
							+ ". zombie!");
					System.out.println("Ostalo vam je " + first.getHp()
							+ " HP!");
				} else {
					System.out.println("JEBIGA SREO SI EMINU...");
					break;

				}

			} else if(first.escChance(prvi[i])){
				System.out.println("Uspjesno ste pobjegli!");
			}
			else if(run==0){
				if (first.surviveBattle(prvi[i])) {
					System.out.println("Prezivjeli ste " + (i + 1)
							+ ". zombie!");
					System.out.println("Ostalo vam je " + first.getHp()
							+ " HP!");
				} else {
					System.out.println("JEBIGA SREO SI EMINU...");
					break;
				}
				}
		
			
		}
	}

}
