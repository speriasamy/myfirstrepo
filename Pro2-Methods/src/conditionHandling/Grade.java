package conditionHandling;

public class Grade {

	public char clculategrade(int a){
		if (a>90){
			return 'A';
		}
		else if (a>80){
			return 'B';
		}
		else if (a>70){
			return 'C';
		}
		else if (a>60){
			return 'D';
		}
		else if (a>40){
			return 'E';
		}
		else{
			return 'F';	
		}
		
	}
}
