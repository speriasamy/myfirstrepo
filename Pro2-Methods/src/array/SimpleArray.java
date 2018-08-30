package array;

import java.util.Arrays;

public class SimpleArray {
public static void main(String[] args) {
	System.out.println("welcome");
	int [] arr={1,2,3,4,5,126,7,8,9,10}; //declaration
	int [] arr1=new int[]{1,5,3,23,3,667,18,2};//alternate declaration
	int [] arr2=new int[10];//fixed iteration
	//arr2={1,2,3,4,5,6,7,8,9,10};
	String strarr[]=new String[12];
	arr2[0]=1;
	arr2[9]=10;
	Arrays.sort(arr); //sorting an array. this will change arr values.
	Arrays.sort(arr1);
	
	int length=arr.length;
	int sum=0;
	int maxvalue=0;
	for (int i=0; i<length; i++)
	{
		System.out.println(arr[i]);
		sum=sum+arr[i];
		if (arr[i]>maxvalue){ maxvalue=arr[i];	}
		
	}
	
	System.out.println("Sum of all values are : "+sum);
	System.out.println("max of all values are : "+maxvalue);
	System.out.println("max of all values are : "+arr1[arr1.length-1]);
	System.out.println("Before initialization "+strarr[11]);
	Arrays.fill(strarr, "Sasi");  // INITIALIZE all positions
	System.out.println("After initialization  " + strarr[11]);
	
}
}