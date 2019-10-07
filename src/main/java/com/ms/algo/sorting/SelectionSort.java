package com.ms.algo.sorting;

import java.util.List;

import com.ms.algo.utils.SortingUtil;

public class SelectionSort{

	private SelectionSort(){}
	public static <T extends Comparable<? super T>> void sort(List<T> comparableList) {
		for(int idx=0;idx<comparableList.size();idx++){
			for(int innerIdx=idx+1;innerIdx<comparableList.size();innerIdx++){
				if(SortingUtil.isLess(comparableList, innerIdx,idx)){
				 SortingUtil.exchange(comparableList, idx, innerIdx);
				}
			}
		}
	}
	
}
