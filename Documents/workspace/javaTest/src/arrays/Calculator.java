package Java_Assignments;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		float a,b,result;
		char choice;
		Scanner scan = new Scanner (System.in);
		do
		{
			System.out.println("1. Addition \n" );
			System.out.println("2. Subtraction \n");
			System.out.println("3. Multiplication \n");
			System.out.println("4. Division \n");
			System.out.println("5. Exit \n");
            System.out.print("Enter Your Choice : ");
            choice = scan.next().charAt(0);
            switch (choice)
            {
            case '1': System.out.println("Enter the number :" );
            	a = scan.nextFloat();
            	b = scan.nextFloat();
            	result = a + b;
            	System.out.print("Result =" + result);
            	break;
            case '2': System.out.println("Enter the number :");
            	a = scan.nextFloat();
            	b = scan.nextFloat();
            	result = a - b;
            	System.out.print("Result =" + result);
            	break;
            case '3': System.out.println("Enter the number :");
            	a = scan.nextFloat();
            	b = scan.nextFloat();
            	result = a * b;
            	System.out.print("Result =" + result);
            	break;
            	
            case '4': System.out.println("Enter the number :");
            	a = scan.nextFloat();
            	b = scan.nextFloat();
            	result = a / b;
            	System.out.print("Result =" + result);
            	break;
            case '5': System.exit(0);
            	break;
            default : System.out.print("Enter a correct choice ");
             	break;
            	
            	
            }
            System.out.print("\n------------\n");
            
            
		} while (choice != 5);

	}

}
