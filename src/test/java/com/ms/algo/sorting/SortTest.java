package com.ms.algo.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ms.algo.sorting.InsertionSort;
import com.ms.algo.sorting.SelectionSort;
import com.ms.algo.utils.SortingUtil;

public class SortTest {

	private List<Integer> intList = new ArrayList<>();
	
	@Before
	public void populateList(){
		//intList.addAll(Arrays.asList(new Integer[]{14,27,33,22,10,37,39,44,42}));
		for(int idx=0;idx<100;idx++){
			intList.add(ThreadLocalRandom.current().nextInt(100));
		}
		//intList.addAll(Arrays.asList(new Integer[]{14,27,33,22,10,37,39,44,42}));
	}
	
	@After
	public void cleanList(){
		intList.clear();
	}
	
	@Test
	public void testSelectionSort(){
		long startTime = System.currentTimeMillis();
		System.out.println("Before="+intList);
		SelectionSort.sort(intList);
		System.out.println("After="+intList);
		long endTime = System.currentTimeMillis();
		System.out.println("Selection Sort Time(millis)="+(endTime-startTime));
		Assert.assertTrue(SortingUtil.isSorted(intList));
	}
	
	@Test
	public void testInsertionSort(){
		long startTime = System.currentTimeMillis();
		System.out.println("Before="+intList);
		InsertionSort.sort(intList);
		System.out.println("After="+intList);
		long endTime = System.currentTimeMillis();
		System.out.println("Insertion Sort Time(millis)="+(endTime-startTime));
		Assert.assertTrue(SortingUtil.isSorted(intList));
	}
	
}
