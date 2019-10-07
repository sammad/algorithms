package com.ms.algo.sorting;

import java.util.List;

import com.ms.algo.utils.SortingUtil;

public class InsertionSort{

	private InsertionSort(){}
	public static <T extends Comparable<? super T>> void sort(List<T> comparableList) {
		for(int idx=0;idx<comparableList.size()-1;idx++){
			for(int innerIdx=idx+1;innerIdx>0;innerIdx--){
				if(SortingUtil.isLess(comparableList, innerIdx,innerIdx-1)){
				 SortingUtil.exchange(comparableList, innerIdx, innerIdx-1);
				}
			}
		}
	}
	
}
