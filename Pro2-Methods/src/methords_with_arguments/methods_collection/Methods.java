package methords_with_arguments.methods_collection;

public class Methods {
	int result;
	public int add(int a , int b){
		System.out.println("welcome to add method");
		result=a+b;
		return result;
	}
	public int sub(int a, int b){
		result=a-b;
		return result;
	}
	public int multi(int a, int b){
		result=a*b;
		return result;
	}
	public void showresults(int a){
		System.out.println("The result is "+a);
	}
}
