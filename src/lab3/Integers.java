package lab3;

import java.util.Scanner;

public class Integers {

	public static void main(String[] args) {
		String userResponse = "yes";
		 int studentNum;
		    System.out.println("Enter a number between 1 and 100:");
		 
		    //The input provided by user is stored in num
		    Scanner scnr = new Scanner(System.in);
		    studentNum = scnr.nextInt();
		 
		    /* If number is divisible by 2 then it's an even number
		     * else odd number*/
		    if ( studentNum % 2 == 0 ) {
		        System.out.println("Even");
		    }
		     else 
		        System.out.println("Odd");	
		  
		    System.out.println("Would you like to continue (yes/no)?");
		    userResponse = scnr.next();
			 userResponse.equals("yes");
           

}

}

