package algo.main;

import java.util.Scanner;

import algo.quickunion.QuickUnion;

public class Main {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Please enter number of elements:");
			int numberOfInteger = scanner.nextInt();
//			QuickFind quickFind = new QuickFind(numberOfInteger);
			QuickUnion quickUnion = new QuickUnion(numberOfInteger);
			quickUnion.buildArray(scanner);
			try {
				quickUnion.executeUserCommands(scanner);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
