package com.ms.dcp;

public class ConcatTwoInterleavedStrings {

	public static void main(String[] args) {
		String a = "abcmmmmmmmmmmmmmm";
		String b ="cde";
		char[] first;
		char[] second;
		char[] result= new char[a.length()+b.length()];
		first=a.toCharArray();
		second =b.toCharArray();
		int resultSize=(a.length()<b.length())?a.length():b.length();
				
		for(int index=0,rIndex=0;rIndex<2*resultSize&&index<resultSize; index++,rIndex+=2){
				result[rIndex]=first[index];
				result[rIndex+1]=second[index];
		}
		
		if(a.length()>b.length()){
			for(int index=resultSize,rIndex=2*resultSize;index<a.length();index++,rIndex++){
				result[rIndex]=first[index];
			}
		}else{
			for(int index=resultSize,rIndex=2*resultSize;index<b.length();index++,rIndex++){
				result[rIndex]=second[index];
			}
		}
		System.out.println(new String(result));
   }

	

}
