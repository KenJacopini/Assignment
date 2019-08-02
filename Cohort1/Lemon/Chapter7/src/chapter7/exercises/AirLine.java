package chapter7.exercises;

import java.util.Scanner;

/**
 * @author LEMON
 *
 */
public class AirLine {	
	
	
	
	 static boolean[] space = new boolean[10];	
	 
	public static boolean checkIfSpaceAreFilled(boolean[] array) {
		
		boolean status = false;
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i] == false)
				status = true;
		}
		return status;
	}	
	
	public  void reservation() {
		
		int numb;
		Scanner input = new Scanner(System.in);
		int x =0;
		int y = 5;		
		
		while((checkIfSpaceAreFilled(space))) {		
			System.out.println("Enter 1 for First Class or 2 for Economy");			
			numb = input.nextInt();
			
			if(numb <1 || numb >2)
				System.out.println("Oops! Enter a valid code");			
		
		if(numb == 1) { 
			
			if(x <5) {
				
				space[x] = true;
				System.out.println("Flight booked!");
			System.out.println("Category: First Class\nSeat Number: "+ "FC seat" + (x+1)  +"\n");
			
			}
			
			x++;
			
			if(x >5 ) {
				
				System.out.println("Opps! our first Class is filled \nWill you like to switch to our Economy section?\nYes or No\n");
			
					String choice = input.next();
				if(choice.equalsIgnoreCase("No")) {
					System.out.println("\nNext Flight leaves in 3hours\n");
				break;
				}
				x--;
			}
		}
		
		if(numb == 2) { 
			
			if(y >= 5) {
				
				space[y] = true;
				System.out.println("Flight booked!");
			System.out.println("Category: Economy \nSeat Number: "+ "E seat" + (y+1) +"\n");
			
			}
			
			y++;
			
			if(y >= 10 ) {
				
				System.out.println("Opps! our Economy is filled \nWill you like to switch to our First Class section?\nYes or No\n");
			
					String choice = input.next();
				if(choice.equalsIgnoreCase("No")) {
					System.out.println("\nNext Flight leaves in 3hours\n");
				break;
				}
				y--;
			}
		}
		if(x + (y-4) == 10) {
			System.out.println("All space already filled!!! \nKindly book for next flight");
			reservation();
		}
		}
		input.close();
	}
}