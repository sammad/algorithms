package algo.utils;

import java.util.List;

public class SortingUtil {

	private SortingUtil(){}
	
	public static <T extends Comparable<? super T>> boolean isLess(List<T> comparableList,int item1Idx,int item2Idx){
		return comparableList.get(item1Idx).compareTo(comparableList.get(item2Idx))<0;
	}

	public static <T extends Comparable<? super T>> void exchange(List<T> comparableList, int idx, int innerIdx) {
		T temp =comparableList.get(idx);
		comparableList.set(idx, comparableList.get(innerIdx));
		comparableList.set(innerIdx, temp);
	}

	public static <T extends Comparable<? super T>> boolean isSorted(List<T> comparableItemList) {
		boolean result=true;
		for(int idx=0;idx<comparableItemList.size()-1;idx++){
			if(!SortingUtil.isLess(comparableItemList, idx, idx+1)){
				result=false;
			}
		}
		return result;
	}

	public static <T extends Comparable<? super T>> boolean isSorted(List<T> comparableItemList, int startIdx, int endIdx) {
		boolean result=true;
		for(int idx=startIdx;idx<endIdx-1;idx++){
			if(!SortingUtil.isLess(comparableItemList, idx, idx+1)){
				result=false;
			}
		}
		return result;
	} 
}
