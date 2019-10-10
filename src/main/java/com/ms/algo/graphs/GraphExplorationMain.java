package com.ms.algo.graphs;

import java.util.List;

public class GraphExplorationMain {

	public static void main(String[] args) {
		//Sample Input : 1,2 1,3 2,1 2,3 3,1 3,2 1,4 4,1 4,5 4,8 5,4 5,6 5,7 6,5 6,7 6,8 6,9 7,5 7,6 8,9 8,6 9,6 9,10 10,9
		Graph graph = Graph.createGraph(args);
		graph.printGraphAdjacencyList();
		BFSGraph bfsGraph=new BFSGraph();
		List<Integer> visitedNodes = bfsGraph.search(graph,1);
		System.out.println("Visited Nodes: "+visitedNodes);
		System.out.println("Parents Mapping: "+bfsGraph.getParentMapping());
		System.out.println("Level Mapping: "+bfsGraph.getLevelMapping());
		DFSGraph dfsGraph=new DFSGraph();
		dfsGraph.search(graph,4);
		System.out.println("Visited Nodes: "+dfsGraph.getVisitedVertices());
		System.out.println("Parents Mapping: "+dfsGraph.getParentMapping());
		System.out.println("Pre Mapping: "+dfsGraph.getPreCount());
		System.out.println("Post Mapping: "+dfsGraph.getPostCount());
	}
}
