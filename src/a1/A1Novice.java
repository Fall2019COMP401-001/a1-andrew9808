wwpackage a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Your code goes here.
		process(scan);
	}

	public static void process(Scanner scan) {
		int numCustomers = scan.nextInt();
		double total =0.0;
		for (int i = 0; i < numCustomers; i++) {
			String firstName = scan.next();
			char firstInitial = firstName.charAt(0);
			String lastName = scan.next();
			int numItems = scan.nextInt();
			for (int j = 0; j < numItems; j++) {
				int numThing = scan.nextInt();
				String itemName = scan.next();
				double price = scan.nextDouble();
				double cost = price*numThing;
				//System.out.println(cost);
			
				total += cost;
				
			}
			System.out.println(firstInitial+"."+ " "+ lastName+ ": "+ String.format("%.2f", total));
			total = 0 ;
		}
	}
	// You can define / use static helper methods here.
}
