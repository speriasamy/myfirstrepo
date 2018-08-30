package variables;

public class StringHandling {
	public static void main(String[] args) {
		System.out.println("Welcome to my programing");
		String s = "Sasikumar periasamy";
		String a="Akilesh";
		String b="Akilesh";
		String c="Chandu";
		String d=new String("Chandu");
		String e=new String("Chandu");
		//LENGTH of the string
		System.out.println(s.length());
		
		//index of the char
		System.out.println(s.indexOf('e'));
		
		//string comparision1//EQUALS method is for content comparision
		System.out.println("Test 1: "+(s.equals("Sasikumar periasamy")));//TRUE
		//string comparision2//==is for reference comparision
		System.out.println("Test 2: "+(c  == "Chandu"));//TRUE 
		System.out.println("Test 3: "+(d   == "Chandu"));//FALSE because c is new object
		System.out.println("Test 4: "+(a == b));//TRUE
		System.out.println("Test 5: "+(d == e));//FALSE
			
		
		//display a particular character
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(18));
		
		//replace
		System.out.println(s.replace('y', 'i'));
		System.out.println(s.replace("Sasi", "Sam"));
		System.out.println(s.replace(" ", ""));
		
		//concatinate and calling  more than one method in the same line
		System.out.println(s.concat(" ").concat("Rules"));
		
		//substring
		System.out.println(s.substring(10));
		System.out.println(s.substring(10, 16));
	}
}
