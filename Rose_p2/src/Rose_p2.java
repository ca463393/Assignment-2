import java.util.Scanner;
public class Rose_p2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please press:\ne for English units\nm for metric units");
		
		char metric;
		double weight, height;
		double BMI;
		metric = scnr.next().charAt(0);

		if (metric == 'e') {
				
				System.out.println("Please enter weight in pounds:");
				
				weight = scnr.nextDouble();
				
				System.out.println("Please enter height in inches:");
				
				height = scnr.nextDouble();
				
				BMI = (703*weight)/(Math.pow(height, 2));
				
				BMI = Math.round(BMI*10.0)/10.0;
				
				System.out.println("\nYour BMI is: " + BMI);
				
				System.out.println("\nBMI Categories:");
				System.out.println("Underweight = <18.5");
				System.out.println("Normal weight = 18.5-24.9");
				System.out.println("Overweight = 25-29.9");
				System.out.println("Obese = BMI of 30 or greater");
				
				
				
		}//end e if loop
		else if (metric == 'E') {
			
			System.out.println("Please enter weight in pounds:");
			
			weight = scnr.nextDouble();
			
			System.out.println("Please enter height in inches:");
			
			height = scnr.nextDouble();
			
			BMI = (703*weight)/(Math.pow(height, 2));
			
			BMI = Math.round(BMI*10.0)/10.0;
			
			System.out.println("\nYour BMI is: " + BMI);
			
			System.out.println("\nBMI Categories:");
			System.out.println("Underweight = <18.5");
			System.out.println("Normal weight = 18.5-24.9");
			System.out.println("Overweight = 25-29.9");
			System.out.println("Obese = BMI of 30 or greater");
			
			
		}//end E if loop
			
		else if (metric == 'm') {
				
				System.out.println("Please enter weight in kilograms:");
				
				weight = scnr.nextDouble();
				
				System.out.println("Please enter height in meters:");
				
				height = scnr.nextDouble();
				
				BMI = (weight)/(Math.pow(height, 2));
				
				BMI = Math.round(BMI*10.0)/10.0;
				
				System.out.println("\nYour BMI is: " + BMI);
				
				System.out.println("\nBMI Categories:");
				System.out.println("Underweight = <18.5");
				System.out.println("Normal weight = 18.5-24.9");
				System.out.println("Overweight = 25-29.9");
				System.out.println("Obese = BMI of 30 or greater");
				
				

		}//end m if loop
		
		else if (metric == 'M') {
		
			System.out.println("Please enter weight in kilograms:");
			
			weight = scnr.nextDouble();
			
			System.out.println("Please enter height in meters:");
			
			height = scnr.nextDouble();
			
			BMI = (weight)/(Math.pow(height, 2));
			
			BMI = Math.round(BMI*10.0)/10.0;
			
			System.out.println("\nYour BMI is: " + BMI);
			
			System.out.println("\nBMI Categories:");
			System.out.println("Underweight = <18.5");
			System.out.println("Normal weight = 18.5-24.9");
			System.out.println("Overweight = 25-29.9");
			System.out.println("Obese = BMI of 30 or greater");
			
			
		}//end M if loop
		else {
			
			System.out.println("Invalid Option");
			//metric = scnr.next().charAt(0);
			
		}//end else
		
		
	}//end main
}//end class
