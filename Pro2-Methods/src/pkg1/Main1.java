package pkg1;

import pkg2.*;

public class Main1 {
public static void main(String[] args) {
	System.out.println("Main method");
	Main1 obj1=new Main1();
	obj1.method1();
	obj1.method2();
	Class2 obj2=new Class2();
	obj2.method3();
	obj2.method4();
	Class3 obj3=new Class3();
	obj3.method5();
	obj3.method6();
	pkg2.Class4 obj4=new pkg2.Class4();//instead of IMPORT, you can give full path.. ////package.method//
	obj4.method7();
}

public void method1(){
	System.out.println("method1 from the same program"+"\n Rating:");
}
public void method2(){
	System.out.println("method2 from the same program");
}
}
