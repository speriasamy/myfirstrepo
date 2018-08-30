package inheritance;

public class Main {

	public static void main(String[] args) {
		Level1 L1=new Level1();
		L1.name="Sasikumar";
		L1.age=40;
		L1.printnameonly();
		L1.printname();
				
		Level2 l2=new Level2();
		l2.name="chandu";
		l2.age=41;
		l2.gender="Male";
		l2.height=6;
		l2.printnameonly();
		l2.printname();
		l2.printhtonly();
		l2.printgenheight();
		
		Level3 l3=new Level3();
		l3.name="yasheen";
		l3.age=32;
		l3.place="sturburge";
		l3.cost=1200;
		l3.printnameonly();
		l3.printname();
		l3.printplaceonly();
		l3.printplacecost();
		
		
	}

}
