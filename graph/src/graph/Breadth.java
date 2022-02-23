package graph;

import java.util.*;

public class Breadth {
	
	public ArrayList<String> bfsMethod(HashMap<String, ArrayList<String>> graph, String startKey){
		
		ArrayList<String> visitQ = new ArrayList<>();
		ArrayList<String> needQ = new ArrayList<>();
		
		needQ.add(startKey);
		
		while(needQ.size() > 0) {
			String node = needQ.remove(0);
			if(!visitQ.contains(node)) {
				visitQ.add(node);
				needQ.addAll(graph.get(node));	
			}
		}
		
		return visitQ;
		
	}

}
