import java.util.Arrays;
import java.util.Scanner;
public class Rose_p3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		final int maxTopics =5, maxRating =10;
		String [] topics = new String [maxTopics];
		int [][] responses = new int [maxTopics][maxRating];
		int i, j;
		char end = 'n';
		double [] sum = new double[maxTopics];
		double [] avg = new double[maxTopics];
		int n=0;
		int highest=0, lowest=999;
		String high="", low="";
		
		topics[0] = "Sports";
		topics[1] = "Movies";
		topics[2] = "School";
		topics[3] = "Church";
		topics[4] = "Health";
		
		System.out.println("Rate each topic on a scale from 1 (least important) to 10 (most important).");
		System.out.println("");
		
		
		//mainInput = scnr.nextInt();

		while (end != 'y') {
			
			n++;
			
			for (i=0; i<maxTopics; i++) {
				
				System.out.println("Please rate " + topics[i] + ":");
				int mainInput = scnr.nextInt();
				
				if ((mainInput<1)||(mainInput>10)) {
					
					System.out.println("Invalid rating, please rate each topic on a scale from 1 (least important) to 10 (most important).");
					System.out.println("Please rate " + topics[i] + ":");
					mainInput = scnr.nextInt();
					
				}//end if statement
				
				for (j=0; j<maxRating; j++) {
					
					if (mainInput == (j+1)) {
						
						responses[i][j] += 1;
						
					}//end response logging
				}//end column
			}//end for loop row 
			
			System.out.println("Have all responses been logged?\nPlease press y for yes or n for no");
			end = scnr.next().charAt(0);
		}//end while loop
		
		for (i=0; i<maxTopics; i++) {
			for (j=0; j<maxRating; j++) {
			
				sum[i] = sum[i] + (responses[i][j]*(j+1));
				
			}//end column
			
			avg[i] = sum[i]/n;
			
		}//end row
		
		System.out.println("");
		System.out.println("Summary Of Results: \n");
		System.out.println("        1  2  3  4  5  6  7  8  9  10");

		for (i=0; i<maxTopics; i++) {
			
			System.out.print(topics[i] + " ");
			
			for (j=0; j<maxRating; j++) {
				
				System.out.print("[" + responses[i][j] + "]");
				
			}//end column
			
			System.out.println(" Rating Average: " + String.format("%.2f", avg[i]));
			System.out.print("");
		}//end row
		
		System.out.println("\n");
		
		for (i=0; i<maxTopics; i++) {
				
				if (sum[i]>=highest) {
					
					highest = (int)sum[i];
					high = topics[i];
					
				}//end high if statement
				
				else if (sum[i]<=lowest) {
					
					lowest = (int)sum[i];
					low = topics[i];
					
				}//end elif

		}//end outer for loop
		
		System.out.println("The topic of " + high + " recieved the highest point total with " + highest + " points.\n");
		System.out.println("The topic of " + low + " recieved the lowest point total with " + lowest + " points.");

		
	}//end main
}//end class
