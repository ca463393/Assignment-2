import java.util.Scanner;
public class Rose_p1_decrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final int arrayMax = 4;
		int[] userDigits = new int[arrayMax];
		int i, temp;

		System.out.println("Enter 4 digit number:");
		int userInput = scnr.nextInt();

		if (userInput > 9999) {
		System.out.println("Number must be 4 digits.");
		userInput = scnr.nextInt();
		}//end if statement
		
		 userDigits[0] = userInput / 1000;
			
		 userDigits[1] = userInput / 100;
		 userDigits[1] = userDigits[1] % 10;
		
		 userDigits[2] = userInput % 100;
		 userDigits[2] = userDigits[2] / 10;
		 
		 userDigits[3] = userInput % 10;
		 
		 temp = userDigits[0];
		 
		 userDigits[0] = userDigits[2];
		 userDigits[2] = temp;
		 
		 temp = userDigits[1];
		 
		 userDigits[1] = userDigits[3];
		 userDigits[3] = temp;
		 
		 for (i=0; i<arrayMax; ++i){
			    
			userDigits[i] = (userDigits[i] + 3) % 10;
		    
		 }//end for loop
		 
		 
		 //outputs decryption
		 for (i=0; i<arrayMax; ++i){
		    System.out.print(userDigits[i]);
		 }//end for loop
		
		

	}//end main
}//end class
