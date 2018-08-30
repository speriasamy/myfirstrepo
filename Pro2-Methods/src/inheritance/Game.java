package inheritance;

public class Game {

	public static void main(String[] args) {
		Sword s1=new Sword("Sword1", 100);
		Sword s2=new Sword("Sword2", 75);
		
		System.out.printf("%s: %d", s1.name, s1.calculate_damage());
		System.out.println();
		System.out.printf("%s: %d", s2.name, s2.calculate_damage());
		System.out.println();
		System.out.println("Number of weapons created: "+ Weapon.numWeapons);

	}

}
