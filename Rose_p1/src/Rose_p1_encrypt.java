import java.util.Scanner;
public class Rose_p1_encrypt {

	public static void main(String[] args) {
		 Scanner scnr = new Scanner(System.in);
		 final int arrayMax = 4;
		 int[] userDigits = new int[arrayMax];
		 int i;

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

		 for (i=0; i<arrayMax; ++i){
		    
			userDigits[i] += 7;
			userDigits[i] %= 10;
		    
		 }//end for loop
		 
		 int temp;
		 
		 temp = userDigits[0];
		 
		 userDigits[0] = userDigits[2];
		 userDigits[2] = temp;
		 
		 temp = userDigits[1];
		 
		 userDigits[1] = userDigits[3];
		 userDigits[3] = temp;
		 
		 //outputs encryption
		 for (i=0; i<arrayMax; ++i){
		    System.out.print(userDigits[i]);
		 }//end for loop

	}//end main
}//end class
