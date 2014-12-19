import java.util.Scanner;
/*
 * Igrica se zasniva na tome da se napravi ZombieApocalypse gdje ste vi igrac koji ima svoje osobine( ime, health, dexterity, weapon, strength, speed i intelligence)
 * i probija se kroz horde zombija koje imaju takodje svoje osobine ( ime, health, dexterity, weapon, strength i speed).Kada igrac naidje na zombija, ima opciju da li 
 * bjezi, ili ne. Bjezanje ce uspjeti ako je igrac dovoljno mudar i brzi od zombija, ako ne, dolazi do dvoboja. Dvoboj se vrsi sve dok jedan od protivnika izgubi cijeli HP
 * Bitka se odvija tako sto jedan protivnik udara drugog i obrnuto. Taj udarac ovisi o mnogo parametara napadaca (dexterity, weapon,strngth i intelligence). Postoje razna
 * oruzja za igraca i zombija, kao i razlicite vrste zombija raznih jacina. Poslije svakog dvoboja (ako igrac prezivi) treba ispisati preostali health igraca. Igrac je
 * pobjednik ako se uspije probiti kroz dovoljan broj zombija (ovisno koliko to korisnik postavi).
 */

public class TestGame {

	public static void main(String[] args) {
		

		Player igrac = new Player("Gorjan", 50, 0.5, null, 8, 5, 2);
	
		
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

			int broj = (int) (1 + (Math.random() * (4)));
			switch (broj) {
			case 1:
				prvi[br] = new Charger("Charger ", 80, 0.6, null, 7, 14);
				break;
			case 2:
				prvi[br] = new Smoker("Smoker Minimina", 80, 0.6, null, 7, 14);
				break;
			case 3:
				prvi[br] = new Spitter("Spiter Emina d Hrak", 79, 0.5, null, 6, 13);
				break;
			case 4:
				prvi[br] = new Jockey("JOCKEY", 75, 0.4, null, 3, 12);
				break;
						
				
//	prvi[br] = new Emina("Emina", 97, 0.7, null, 8, 15);
			}
			br++;
		}
		int run;
		int numZombies=5;
		int brojacPetlje=0;
		for (int i = 0; i < numZombies ; i++) {
			brojacPetlje++;
			System.out.println(Storyline.Storyline(i) );
			System.out.println(igrac.toString() +" VS \n\n"+ prvi[i].toString() );
			System.out.println("\nIspred vas je ZOMBIE... Bjezati ili ne? Pritisnite 0 da ostanete, 1 da bjezite:)");
			run = in.nextInt();
		
			if (run == 1 && !igrac.escChance(prvi[i])) {
				System.out.println("Niste uspjeli pobjeci, bijte se!\n");
				
				if (igrac.surviveBattle(prvi[i])) {
					igrac.fightScene(i);
				} else {
					System.out.println("ŠTETA SREO SI EMINU...");
					break;

				}

			} else if(igrac.escChance(prvi[i])){
				System.out.println("Uspjesno ste pobjegli!");
			}
			else if(run==0){
				if (igrac.surviveBattle(prvi[i])) {
					igrac.fightScene(i);
				} else {
					System.out.println("ŠTETA SREO SI EMINU...");
					break;
				}
				}
		
			
			
		}
		System.out.println("PRED VAMA SE POKAZUJE STRASNA I PRESTRASNA SEFICA PODZEMLJA");
		System.out.println("ISPRED VAS JE ");
		System.out.println("**********************  EMINA  **********************");
		prvi[6] = new Emina("Emina", 97, 0.7, null, 8, 15);
		System.out.println("Pritisnite 1 i pritisnite enter da Emina dobije po guzici i da je posaljete kuci placuci");
		int broj= in.nextInt();
		if (igrac.surviveBattle(prvi[6])|| brojacPetlje>4) {
			System.out.println("CESTITAMO POBJEDILI STE D HOROR PRICU PIVO FROM EMINA BOSS-a\n uzivaj u pivi zasluzio si :)");
		} else {
			System.out.println("ŠTETA SREO SI EMINU...sta si ti mislio?!?!?!?!");
			
		}
	}

}
