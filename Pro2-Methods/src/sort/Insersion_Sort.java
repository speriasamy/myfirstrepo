package sort;

/*
 * It will take one item in the array and find the position it should go in according to the sorting criteria. 
 * Let's say we have a random array and we want to sort it in ascending order:
 */
public class Insersion_Sort {

	public static void main(String[] args) {
		System.out.println("welcome to my program");
		int [] array = {45,12,85,32,89,39,69,44,42,1,6,8};
		System.out.print("original array: ");
		for (int i:array) {
			System.out.print(i+" ");
		}
		int temp;
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j]<array[j-1]) {
					temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;							
				}
				
			}
			
		}
		System.out.println();
		System.out.print("Sorted   array: ");
		for (int i:array) {
			System.out.print(i+" ");
		}
	}
}
