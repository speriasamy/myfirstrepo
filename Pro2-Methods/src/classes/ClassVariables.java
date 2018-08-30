package classes;

public class ClassVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome");
		Song s1=new Song();
		s1.name="song1";
		s1.artist="artist1";
		s1.duration=10;
		
		Song s2=new Song();
		s2.name="song2";
		s2.artist="artist2";
		s2.duration=20;
		System.out.println(s1.prettyname());
		System.out.println(s2.prettyname());
	}

}
