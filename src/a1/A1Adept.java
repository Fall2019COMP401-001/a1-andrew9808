package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		adept(scan);
	}

	public static void adept(Scanner scan) {
		String maxName="";
		String minName="";
		int storeItems = scan.nextInt();
		String[] names = new String[storeItems];
		Double[] prices = new Double[storeItems];
		for (int i = 0; i < storeItems; i++) {
			names[i] = scan.next();
			prices[i] = scan.nextDouble();
			// possibly prices[storeItems]
		}
		int numPeople = scan.nextInt();
		Double[] total = new Double[numPeople];
		String[] firstName = new String[numPeople];
		String[] lastName = new String[numPeople];
		for (int j = 0; j < numPeople; j++) {
			firstName[j] = scan.next();
			lastName[j] = scan.next();
			int numItems = scan.nextInt();
			String[] items = new String[numItems];
			int[] itemNumber = new int[numItems];
			Double cost = 0.0;
			for (int k = 0; k < numItems; k++) {
				itemNumber[k] = scan.nextInt();
				items[k] = scan.next();
				for (int l = 0; l < storeItems; l++) {
					if (items[k].equals(names[l])) {
						cost += prices[l] * itemNumber[k];
						// System.out.println(lastName[j] + " " + items[k] + " " + cost) ;

					}

				}

			}
			total[j] = cost;
			// System.out.println(cost);
		}
		
		Double max = total[0];
		for (int m = 0; m < total.length; m++) {
			if (total[m] >= max) {
				max = total[m];
				maxName = firstName[m] + " " + lastName[m];
				// System.out.println(maxName);
			}

		}
		Double min = total[0];
		for (int n = 0; n < total.length; n++) {
			if (total[n] <= min) {
				min = total[n];
				minName = firstName[n] + " " + lastName[n];
				//System.out.println(minName);

			}

		}
		Double avgTotal = 0.0;
		for (int o = 0; o < total.length; o++) {
			avgTotal += total[o];
		}
		Double avg = (avgTotal / total.length);

		System.out.println("Biggest: "+maxName +" ("+String.format("%.2f", max)+")");
		System.out.println("Smallest: "+minName +" ("+String.format("%.2f", min)+")");
		System.out.println("Average: "+String.format("%.2f", avg));
	}
	

}
