package junit_testing;

public class PrintGrade {

	public String print(int grade) {
		if (grade>93) return "You got an A";
		else if(grade>83) return "You got a B";
		else if(grade>73) return "you got a C";
		else return "You got to study more";
	}
	
	public int subtract(int a, int b) {
		return a-b;
	}
}
