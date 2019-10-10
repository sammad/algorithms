package com.ms.algo.graphs;

import java.util.List;

public class BFSTest {

	public static void main(String[] args) {
		//(1,2) (1,3) (1,4)
		Graph graph = Graph.createGraph(args);
		graph.printGraphAdjacencyList();
		BFSGraph bfsGraph=new BFSGraph();
		List<Integer> visitedNodes = bfsGraph.search(graph,1);
		System.out.println("Visited Nodes: "+visitedNodes);
		System.out.println("Parents Mapping: "+bfsGraph.getParentMapping());
		System.out.println("Level Mapping: "+bfsGraph.getLevelMapping());
	}
}
