package com.ms.algo.graphs;

import java.util.List;

public class BFSTest {

	public static void main(String[] args) {
		//(1,2) (1,3) (1,4)
		Graph graph = Graph.createGraph(args);
		graph.printGraphAdjacencyList();
		List<Integer> visitedNodes = new BFSGraph().search(graph,9);
		System.out.println(visitedNodes);
	}
}
