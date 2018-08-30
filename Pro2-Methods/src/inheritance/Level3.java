package inheritance;

public class Level3 extends Level1 {
	String place;
	int cost;
	public void printplacecost(){
		System.out.println(name+" "+age+" "+place+" "+cost);
		
	}
	public void printplaceonly(){
		System.out.println(name+" "+age+" "+cost);
	}

}
