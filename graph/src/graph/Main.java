package graph;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Breadth bfs = new Breadth();
		Depth dfs = new Depth();
		
		HashMap<String, ArrayList<String>> hashmap = new HashMap<>();
		hashmap.put("A", new ArrayList<String>(Arrays.asList("B","C")));
		hashmap.put("B", new ArrayList<String>(Arrays.asList("A","D")));
		hashmap.put("C", new ArrayList<String>(Arrays.asList("A","G","H","I")));
		hashmap.put("D", new ArrayList<String>(Arrays.asList("B","E","F")));
		hashmap.put("E", new ArrayList<String>(Arrays.asList("D")));
		hashmap.put("F", new ArrayList<String>(Arrays.asList("D")));
		hashmap.put("G", new ArrayList<String>(Arrays.asList("C")));
		hashmap.put("H", new ArrayList<String>(Arrays.asList("C")));
		hashmap.put("I", new ArrayList<String>(Arrays.asList("C","J")));
		hashmap.put("J", new ArrayList<String>(Arrays.asList("I")));
		
//		ArrayList<String> bfsSearch = bfs.bfsMethod(hashmap, "A");
//		
//		System.out.println("bfs result : "+ bfsSearch);
		
		ArrayList<String> dfsSearch = dfs.dfsMethod(hashmap, "A");
		System.out.println("dfs result : "+ dfsSearch);

	}

}
