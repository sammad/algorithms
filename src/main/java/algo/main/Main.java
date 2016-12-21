package algo.main;

import java.util.Scanner;

import algo.quickfind.QuickFind;

public class Main {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Please enter number of elements:");
			int numberOfInteger = scanner.nextInt();
			QuickFind quickFind = new QuickFind(numberOfInteger);
			quickFind.buildArray(scanner);
			try {
				quickFind.executeUserCommands(scanner);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
