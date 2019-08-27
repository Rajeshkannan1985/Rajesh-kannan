package Git_work;

import java.util.Scanner;

public class OddEven {
		  private static Scanner input;

		public static void main(String args[])
	  {
	    int num;
	    System.out.println("Enter an Integer number:");

	    input = new Scanner(System.in);
	    num = input.nextInt();   
	    if ( num % 2 == 0 )
	        System.out.println("Entered number is even");
	     else
	        System.out.println("Entered number is odd");
	  }

}
