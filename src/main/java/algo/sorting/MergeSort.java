package algo.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

	private MergeSort(){
		
	}
	public static <T extends Comparable<? super T>> void sort(List<T> comparableList){
		List<T> auxComparableList = new ArrayList<>(comparableList);
		sort(comparableList,auxComparableList,0,comparableList.size());
	}

	private static <T extends Comparable<? super T>> void sort(List<T> comparableList, List<T> auxComparableList, int low, int high) {
		if(high<low){
			return;
		}
		int mid =(high-low)/2;
		sort(comparableList,auxComparableList,low,mid);
		sort(comparableList,auxComparableList,mid+1,high);
		merge(comparableList,auxComparableList);
	}

	private static <T extends Comparable<? super T>>void merge(List<T> comparableList, List<T> auxComparableList) {
		int mid = auxComparableList.size()/2;
		for(int idx=0,idxMid=mid;idx<mid && idxMid<auxComparableList.size();){
			
		}
		
	}
}
