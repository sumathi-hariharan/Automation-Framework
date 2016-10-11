package arrays;
/* To find sum of array - method 2*/
import java.util.Scanner;

public class SumOfArray2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int[ ] Array = new int[10];
		int sum = 0;
		System.out.println("Enter the Array:");
		
		for (int i=0; i<10; i++) {
			
			Array[i] = scan.nextInt();
		}
		
		for (int num : Array) {
			
			sum = sum + num;
		}
		System.out.println("Sum of Array is :" + sum);
		}

	}


