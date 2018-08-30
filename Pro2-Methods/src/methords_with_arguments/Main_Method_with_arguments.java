package methords_with_arguments;

import methords_with_arguments.methods_collection.*;

public class Main_Method_with_arguments {
public static void main(String[] args) {
	int a,b,c,d,f,g,h;
	a=1;
	b=100;
	c=10;
	d=5;
	
	System.out.println("This is main method ");
	Methods obj1=new Methods();
	f=obj1.add(a, b);
	System.out.println("addition of 2 is "+ f);
	g=obj1.sub(c,d);
	System.out.println("subration of 2 is "+g);
	h=obj1.multi(f, g);
	System.out.println("multiplication of 2 is "+h);
	obj1.showresults(h);
}
}
