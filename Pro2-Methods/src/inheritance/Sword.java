package inheritance;




public class Sword extends Weapon {

	
	public Sword(String name, int maxDamage) {
		super(name, maxDamage);
		// TODO Auto-generated constructor stub
	}

	public int calculate_damage() {

		return (int) (super.calculate_damage()*1.5);
				
	}
	
	
	
}
