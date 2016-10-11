package arrays;
/* To find sum of Array Method 1*/
public class SumOfArray1 {

	public static void main(String[] args) {
		
		int[ ] Array = {1,2,3,4,5};
		int sum =0;
		for (int num : Array) {
			sum = sum +num;
		}
		System.out.println("Sum of Array is :" + sum);
		}
		
	}


