package exceptionHandling;

public class CustomException {
	
	public static String ntime(int n, String s)throws Exception {
		if (n<=0) throw new Exception ("number is invalid. It has to be more than zero");
		String results="";
		for (int i=1;i<=n;i++){
			results=results+s;
		}
		return results;
	}
	
public static void main(String[] args) {
	System.out.println("Welcome to my programing.");
	//CustomException ce=new CustomException();
	
	try {
		System.out.println(ntime(3, "sasi"));
	} catch (Exception e) {
		//e.printStackTrace();
		System.out.println(e);
	}
}
}
