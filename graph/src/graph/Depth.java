package graph;

import java.util.*;

public class Depth {
	
	public ArrayList<String> dfsMethod(HashMap<String, ArrayList<String>> graph, String startData) {
		ArrayList<String> visitQ = new ArrayList<>();
		ArrayList<String> needQ = new ArrayList<>();
		
		needQ.add(startData);
		
		while(needQ.size() > 0) {
			String node = needQ.remove(needQ.size()-1);
			if(!visitQ.contains(node)) {
				visitQ.add(node);
				needQ.addAll(graph.get(node));
			}
		}
		
		return visitQ;
		
	}

}
