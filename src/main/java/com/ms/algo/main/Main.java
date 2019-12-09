package com.ms.algo.main;

import java.util.Scanner;

import com.ms.algo.quickunionweight.QuickUnionWeight;

public class Main {
	public static void main(String[] args) {
		/*
		 * try(Scanner scanner = new Scanner(System.in)){
		 * System.out.println("Please enter number of elements:"); int numberOfInteger =
		 * scanner.nextInt(); // QuickFind quickFind = new QuickFind(numberOfInteger);
		 * // QuickUnion quickUnion = new QuickUnion(numberOfInteger); QuickUnionWeight
		 * quickUnion = new QuickUnionWeight(numberOfInteger); quickUnion.buildArray();
		 * 
		 * try { while(true){ System.out.println("Command="); String command =
		 * scanner.next(); quickUnion.executeUserCommands(command); } } catch (Exception
		 * e) { e.printStackTrace(); }
		 * 
		 * }
		 */
		System.out.println(GFG.findMinInsertions("Geeks".toCharArray(), 0, "Geeks".length()-1));
	}
}

class GFG { 
	  
    // Recursive function to find minimum number 
    // of insertions 
    static int findMinInsertions(char str[], int l, 
                                             int h) 
    { 
    	System.out.println("s["+l+"]="+str[l]+" s["+h+"]"+str[h]);
        // Base Cases 
        if (l > h) return Integer.MAX_VALUE; 
        if (l == h) return 0; 
        if (l == h - 1) return (str[l] == str[h])? 0 : 1; 
  
        // Check if the first and last characters 
        // are same. On the basis of the  comparison 
        // result, decide which subrpoblem(s) to call 
        return (str[l] == str[h])? 
            findMinInsertions(str, l + 1, h - 1): 
            (Integer.min(findMinInsertions(str, l, h - 1), 
            findMinInsertions(str, l + 1, h)) + 1); 
    } 
  
    // Driver program to test above functions 
    public static void main(String args[]) 
    { 
        String str= "geeks"; 
        System.out.println(findMinInsertions(str.toCharArray(), 
                                          0, str.length()-1)); 
    } 
} 
