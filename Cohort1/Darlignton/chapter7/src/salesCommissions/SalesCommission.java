package salesCommissions;


import java.util.Scanner;

public class SalesCommission {
	
	
	//Array that will hold the calculated commission
	static int[] commission;
	
	
	//Method that calculates commission
	public static  int commissionCalculator(int grossSales) {
		
		final int COMMISSION_PER_WEEK = 200;
		double bonusCommission = 0.09 * grossSales;
		
		return (int) (COMMISSION_PER_WEEK + bonusCommission);
	}
	
	
	public static void evaluator() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of workers");
		
		int arrayLength = input.nextInt();
		 commission = new int[arrayLength];
		 
		 
		System.out.println("Enter their gross sales");
		int grossSales =0;
		int sales = 0;
		
		for(int i = 0; i< arrayLength; i++) {
			
		grossSales = input.nextInt();
		
		sales = commissionCalculator(grossSales);
		
		commission[i] = (int) sales;
		
		}
		
		input.close();
	 
	}
	
	public static void outputStatics() {
		
		int[] frequency = new int[11];
		
		for(double myArray: commission) {
			++frequency[(int) (myArray / 100)];
			}
		
		//Print out bars of asteriks
		
		for(int i = 2; i< frequency.length; i++) {
			
			if (i == 10)
				 System.out.printf("$%2d and Over: ", 1000 );
			
			else {
				
				System.out.printf("$%2d - %2d", i * 100, i * 100 + 99);
			}
			
			for(int x = 0; x< frequency[i]; x++)
				System.out.print("*");	
			
			System.out.println();
			
		}
		
	}
	
	
	

}