package tempspace;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to my program");
		Integer itemp=10;
		testmethod(itemp);
		
		
	}

	private static void testmethod(Integer itemp) {
		for (int j = 0; j < 10; j++) {
			System.out.println("test"+itemp+j);
		}
	}

}
