package looping;

public class Forloop {
public static void main(String[] args) {
	System.out.println("welcome to my program");
	for (int i=1;i<10;i++){
		System.out.println(i);
	}
	System.out.println("second loop");
	// BREAK statement. comes out of the loop
	for (int j=1;j<10;j++){
		System.out.println(j);
		if (j==4){
			break;
		}
	}
	System.out.println("third loop");
	//CONTINUE statement. goes to next iteration
	for (int k=1;k<5;k++){
	      if (k==3){
	    	 continue;
	     }
	     System.out.println(k);
	}
}
}
