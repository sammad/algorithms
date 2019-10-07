package algo.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MergeSortTest {

private List<String> strList = new ArrayList<>();
	
	@Before
	public void populateList(){
		strList.addAll(Arrays.asList(new String[]{"M","E","R","G","E","S","O","R","T","T","E","S","T"}));
	}
	
	@After
	public void cleanList(){
		strList.clear();
	}
	
	@Test
	public void test(){
		MergeSort.sort(strList);
	}
}
