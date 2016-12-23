package algo;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import algo.quickunion.QuickUnionWeight;

public class QuickUnionWeightTest {

	private QuickUnionWeight quickUnionWeight = null;
	
	@Before
	public void setUp(){
		quickUnionWeight = new QuickUnionWeight(10);
		try(Scanner scanner=new Scanner(System.in)){
			quickUnionWeight.buildArray();
		}
	}
	@Test
	public void testQuickUnionWeight() {

		try {
			String command="union(3,4)";
			System.out.println("*********"+command+"**********");
			quickUnionWeight.union(command);
			System.out.println();

			command="union(4,5)";
			System.out.println("*********"+command+"**********");
			quickUnionWeight.union(command);
			System.out.println();

			command="union(6,7)";
			System.out.println("*********"+command+"**********");
			quickUnionWeight.union(command);
			System.out.println();

			command="union(5,6)";
			System.out.println("*********"+command+"**********");
			quickUnionWeight.union(command);
			System.out.println();

			command="connected(4,7)";
			System.out.println("*********"+command+"**********");
			Assert.assertTrue((quickUnionWeight.connected(command)));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
