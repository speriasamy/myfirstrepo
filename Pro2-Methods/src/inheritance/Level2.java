package inheritance;

public class Level2 extends Level1 {
	String gender;
	int height;
	public void printgenheight(){ 
		System.out.println(name+" "+age+" "+gender+" "+height);
		
	}
	public void printhtonly(){
		System.out.println(name+" "+age+" "+height);
	}
}
