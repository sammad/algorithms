package algo;



import java.util.concurrent.ThreadLocalRandom;

import org.junit.Ignore;
import org.junit.Test;

import algo.quickfind.QuickFind;
import algo.quickunion.QuickUnion;
import algo.utils.Stopwatch;

public class TestQuickFindForPerf {

	@Test
	@Ignore
	public void testQuickFindForPerf() throws Exception{
		Stopwatch stopwatch =new Stopwatch();
		int n=100000;
		QuickFind quickFind = new QuickFind(n);
		quickFind.buildArray();
		int trials=n;
		
		for(int idx=0;idx<trials;idx++){
			int item1=ThreadLocalRandom.current().nextInt(n);
			int item2=ThreadLocalRandom.current().nextInt(n);
			String command ="union("+item1+","+item2+")";
			//System.out.println(command);
			quickFind.union(command);
		}
		
		System.out.println("Time Elapsed (s)="+stopwatch.elapsedTime());
		//quickFind.showComponents();
		
		
	}
	
	@Test
	
	public void testQuickUnionForPerf() throws Exception{
		Stopwatch stopwatch =new Stopwatch();
		int n=1000;
		QuickUnion quickUnion = new QuickUnion(n);
		quickUnion.buildArray();
		int trials=n;
		
		for(int idx=0;idx<trials;idx++){
			int item1=ThreadLocalRandom.current().nextInt(n);
			int item2=ThreadLocalRandom.current().nextInt(n);
			String command ="union("+item1+","+item2+")";
			System.out.println(command);
			quickUnion.union(command);
		}
		
		System.out.println("Time Elapsed (s)="+stopwatch.elapsedTime());
		//quickFind.showComponents();
		
		
	}
	
}
