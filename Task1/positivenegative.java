package TASK1;

import java.util.Scanner;

public class positivenegative {
	public static void main (String[]args)
	  {

	Scanner num = new Scanner(System.in);
	int str1 = num.nextInt();
	    //Conditions to check if the number is negative or positive
	    if (str1 > 0)
	        System.out.println ("The number is positive");
	    else if (str1 < 0)
	        System.out.println ("The number is negative");
	    else
	        System.out.println ("Zero");
	  }

}
