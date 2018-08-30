package inheritance;

import java.util.Random;

public class Weapon {

	protected String name;
	protected int maxDamage;
	public static int numWeapons;
	
	public Weapon(String name, int maxDamage) {
		this.name = name;
		this.maxDamage = maxDamage;
		numWeapons++;//increase everytime you create a weapon.
	}

	public int calculate_damage() {
		Random rnd=new Random();
		return (int) rnd.nextInt(this.maxDamage);
						
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public int getMaxDamage() {
		return maxDamage;
	}

	public void setMaxDamage(int maxDamage) {
		this.maxDamage = maxDamage;
	}


}//end of class.
