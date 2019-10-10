package com.ms.algo.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BFSGraph {

	private List<Integer> visitedVertices = new ArrayList<Integer>();
	private Map<Integer,Integer> parentMapping = new HashMap<>();
	private Map<Integer,Integer> levelMapping = new HashMap<>();
	public List<Integer> search(Graph graph, int sourceNode) {
		Queue<Integer> vertexPendingQueue = new LinkedList<>();
		vertexPendingQueue.add(sourceNode);
		parentMapping.putIfAbsent(sourceNode, -1);
		levelMapping.putIfAbsent(sourceNode, 1);
		while(!vertexPendingQueue.isEmpty()) {
			Integer vertex = vertexPendingQueue.remove();
			if(!visitedVertices.contains(vertex)) {
				visitedVertices.add(vertex);
				List<Integer> edges=graph.getEdges(vertex);
				if(edges!=null) {
					for(Integer neighbour:edges) {
						parentMapping.putIfAbsent(neighbour, vertex);
						levelMapping.putIfAbsent(neighbour, levelMapping.get(vertex)+1);
						if(!vertexPendingQueue.contains(neighbour)) {
							vertexPendingQueue.add(neighbour);
						}
					}
				}
			}
		}
		return visitedVertices;
	}

	public Map<Integer,Integer> getParentMapping(){
		return parentMapping;
	}
	
	public Map<Integer,Integer> getLevelMapping(){
		return levelMapping;
	}
}
