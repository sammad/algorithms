package algo.main;

import java.util.Scanner;

import algo.quickunionweight.QuickUnionWeight;

public class Main {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Please enter number of elements:");
			int numberOfInteger = scanner.nextInt();
			//			QuickFind quickFind = new QuickFind(numberOfInteger);
			//			QuickUnion quickUnion = new QuickUnion(numberOfInteger);
			QuickUnionWeight quickUnion = new QuickUnionWeight(numberOfInteger);
			quickUnion.buildArray();
			
			try {
				while(true){
					System.out.println("Command=");
					String command = scanner.next();
					quickUnion.executeUserCommands(command);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
}
