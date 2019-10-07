package algo.sorting;

import java.util.ArrayList;
import java.util.List;

import algo.utils.SortingUtil;

public class MergeSort {

	private MergeSort(){
		
	}
	public static <T extends Comparable<? super T>> void sort(List<T> comparableList){
		List<T> auxComparableList = new ArrayList<>();
		System.out.println("Before Sort="+comparableList);
		sort(comparableList,auxComparableList,0,comparableList.size());
		System.out.println("After Sort="+comparableList);
	}

	private static <T extends Comparable<? super T>> void sort(List<T> comparableList, List<T> auxComparableList, int low, int high) {
		if(high<=low){
			return;
		}
		int mid =low+(high-low)/2;
		System.out.println("Low="+low+" Mid="+mid+" High="+high);
		sort(comparableList,auxComparableList,low,mid);
		sort(comparableList,auxComparableList,mid+1,high);
		merge(comparableList,auxComparableList,low,mid,high);
	}

	private static <T extends Comparable<? super T>>void merge(List<T> comparableList, List<T> auxComparableList,int low,int mid,int high) {
		for(int idx=low;idx<=high;idx++){
			auxComparableList.add(comparableList.get(idx));
		}
		assert SortingUtil.isSorted(auxComparableList,low,mid);
		assert SortingUtil.isSorted(auxComparableList,mid+1,high);
		
		int j=low,k=mid+1;
		for(int idx=low;idx<high;idx++){
			if(j>mid){
				comparableList.add(idx, auxComparableList.get(k++));
			}else if(k>high){
				comparableList.set(idx, auxComparableList.get(j++));
			}else if(SortingUtil.isLess(auxComparableList, j, k)){
				comparableList.set(idx, auxComparableList.get(j++));
			}else{
				comparableList.set(idx, auxComparableList.get(k++));
			}
		}
		System.out.println("List After Merge "+comparableList);
	}
}
