package javaTest;

public class DecimalToBinary {
		 
		  public void Binary(int num){
			 
		     int binary[] = new int[40];
		     int index = 0;
		     while(num > 0) {
		       binary[index++] = num%2;
		       num = num/2;
		     }
		     for(int i = index-1;i >= 0;i--){
		       System.out.print(binary[i]);
		     }
		  }
		 
		  public static void main(String a[]){
		     DecimalToBinary obj = new DecimalToBinary();
		     System.out.println("Binary representation of 277: ");
		     obj.Binary(124);
		     
		  }	
	
	}


