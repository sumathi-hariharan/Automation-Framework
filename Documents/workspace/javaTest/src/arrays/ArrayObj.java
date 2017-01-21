package arrays;

/* To print an array using object */

public class ArrayObj {
 public static void printArray( int[] anArray){
	 StringBuilder sb = new StringBuilder ();
	 for (int i=0 ; i< anArray.length ; i++) {
		if (i>0)  {
			sb.append(",  ");
		}
			sb.append(anArray[i]);
		}
	 System.out.println(sb. toString());
	 }
 
	public static void main(String[] args) {
		int [] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		printArray(testArray);

	}

}
