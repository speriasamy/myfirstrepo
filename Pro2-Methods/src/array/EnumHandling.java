package array;

public class EnumHandling {
  enum Rating{
	  G,PG,PG13,R,A,MA,X,b
  }
  
public static void main(String[] args) {
	System.out.println("Welcome to my program");
	Rating mymovierating = Rating.G;
	System.out.println(mymovierating);
	
	MovieEnum mymovie=MovieEnum.valueOf("G");
	System.out.println(mymovie);
	
	for(Rating r : Rating.values()) {
		System.out.println("-"+r);
	}
}
	
}//end of class
