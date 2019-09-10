package exercise7_15;
//import java.util.Scanner;

public class CommandLineArguments {
	public static void main(String[] args) {
		
//		Scanner in = new Scanner(System.in);		
//		System.out.print("Please enter number for array size, initial value and increment:");
		 // check number of command-line arguments
	
		if (args.length != 3) {
		 System.out.printf(
		 "Error: Please re-enter the entire command, including%n" +
		 "an array size, initial value and increment.%n");
		 }
		else {
		 //  get array size from first command-line argument
		 int arrayLength = Integer.parseInt(args[0]);
		 int[] array = new int[arrayLength];
		
		 // get initial value and increment from command-line arguments
		 int initialValue = Integer.parseInt(args[1]);
		 int increment = Integer.parseInt(args[2]);
		
		 // calculate value for each array element
		 for (int count = 0; count < array.length; count++) {
		 array[count] = initialValue + increment * count;
		 }
		
		 System.out.printf("%s%8s%n", "Index", "Value");
		
		 // display array index and value
		 for (int count = 0; count < array.length; count++) {
		 System.out.printf("%5d%8d%n", count, array[count]);
		 }
	 }
	}
}