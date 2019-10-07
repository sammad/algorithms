package com.ms.algo.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

	private Map<Integer, List<Integer>> adjacencyList = new HashMap<>();
	
	private Graph() {}
	
	public static Graph createGraph(String[] args) {
		Graph graph = new Graph();
		for(String edge:args) {
			String[] edgeSplit = edge.split(",");
			if(!graph.adjacencyList.containsKey(Integer.valueOf(edgeSplit[0]))) {
				graph.adjacencyList.put(Integer.valueOf(edgeSplit[0]), new ArrayList<Integer>());
			}
			graph.adjacencyList.get(Integer.valueOf(edgeSplit[0])).add(Integer.valueOf(edgeSplit[1]));
		}
		return graph;
	} 
	
	public void printGraphAdjacencyList() {
		for(Map.Entry<Integer,List<Integer>> entry:adjacencyList.entrySet()) {
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
	}
	
	public int verticesCount() {
		return adjacencyList.size();
	}
	
	public List<Integer> getEdges(Integer vertex){
		return adjacencyList.get(vertex);
	}
}
