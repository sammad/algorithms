package com.ms.algo.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DFSGraph {

	private List<Integer> visitedVertices = new ArrayList<Integer>();
	private Map<Integer,Integer> parentMapping = new HashMap<>();
	private Map<Integer,Integer> levelMapping = new HashMap<>();
	private Map<Integer,Integer> preCountMapping = new HashMap<>();
	private Map<Integer,Integer> postCountMapping = new HashMap<>();
	private static int count=0;
	public void search(Graph graph, int sourceNode) {
		List<Integer> edges = graph.getEdges(sourceNode);
		visitedVertices.add(sourceNode);
		parentMapping.putIfAbsent(sourceNode, -1);
		preCountMapping.putIfAbsent(sourceNode, count++);
		for(Integer neighbour:edges){
			if(!visitedVertices.contains(neighbour)){
				parentMapping.putIfAbsent(neighbour, sourceNode);
				search(graph,neighbour);
			}
		}
		postCountMapping.putIfAbsent(sourceNode, count++);
	}

	public Map<Integer,Integer> getParentMapping(){
		return parentMapping;
	}
	
	public Map<Integer,Integer> getLevelMapping(){
		return levelMapping;
	}
	
	public List<Integer> getVisitedVertices(){
		return visitedVertices;
	}
	
	public Map<Integer,Integer> getPostCount(){
		return postCountMapping;
	}
	
	public Map<Integer,Integer> getPreCount(){
		return preCountMapping;
	}
}
