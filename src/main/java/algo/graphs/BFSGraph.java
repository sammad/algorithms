package algo.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSGraph {

	private List<Integer> visitedVertices = new ArrayList<Integer>();
	
	public List<Integer> search(Graph graph, int sourceNode) {
		Queue<Integer> vertexPendingQueue = new LinkedList<>();
		vertexPendingQueue.add(sourceNode);
		
		while(!vertexPendingQueue.isEmpty()) {
			Integer vertex = vertexPendingQueue.remove();
			if(!visitedVertices.contains(vertex)) {
				visitedVertices.add(vertex);
				List<Integer> edges=graph.getEdges(vertex);
				if(edges!=null) {
					for(Integer neighbour:edges) {
						if(!vertexPendingQueue.contains(neighbour)) {
							vertexPendingQueue.add(neighbour);
						}
					}
				}
			}
		}
		return visitedVertices;
	}

}
