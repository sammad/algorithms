package com.ms.dcp;

import java.util.Arrays;

public class TwoNumbersSumInList {

	public static void main(String[] args) {
		badPerformanceSolution();
		goodPerformanceSolution();
	}

	private static void badPerformanceSolution() {
		Integer[] intArr = new Integer[]{10,15,3,7};
		int sum=17;
		for(int outerIndex=0;outerIndex<intArr.length;outerIndex++){
			for(int innerIndex=0;innerIndex<intArr.length;innerIndex++){
				if(intArr[outerIndex]+intArr[innerIndex]==sum){
					System.out.println(true);
					return;
				}
			}
		}
		System.out.println(false);
	}
	
	private static void goodPerformanceSolution() {
		Integer[] intArr = new Integer[]{10,15,3,7};
		Integer[] diffArr = new Integer[intArr.length];
		int sum=17;
		for(int outerIndex=0;outerIndex<intArr.length;outerIndex++){
			diffArr[outerIndex]=sum-intArr[outerIndex];
		}
		
		for(int index=0;index<diffArr.length;index++){
			if(Arrays.asList(intArr).contains(diffArr[index])){
				System.out.println(true);
				return;
			}
		}
		System.out.println(false);
	}
}
