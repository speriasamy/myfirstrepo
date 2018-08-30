package variables;

public class Integerconversion {
public static void main(String[] args) {
	System.out.println("welcome to my program");
	int i=1;
	float f=2;
	double d=3.3;
	char c='a';
	String s="sasi";
	// i=d; type mismatch. can't convert from double to int
	// converting from double to int
	i=(int)d; // this is called typecasting
	System.out.println(i);
	f=(float)d;
	System.out.println(f);
	System.out.println(c);
	System.out.println(s);
}
}
