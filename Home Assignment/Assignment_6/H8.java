package Assignment_6;

import java.util.*;

class Graph2<T> {
	private Map<T, List<T>> map = new HashMap<>();

	public void addNewVertex(T s) {
		map.put(s, new LinkedList<T>());
	}

	public void addNewEdge(T source, T destination, boolean bidirectional) {
		if (!map.containsKey(source)) {
			addNewVertex(source);
		}
		if (!map.containsKey(destination)) {
			addNewVertex(destination);
		}
		map.get(source).add(destination);
		if ((bidirectional) == true) {
			map.get(destination).add(source);
		}
	}
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (T v : map.keySet()) {
			builder.append(v.toString() + " : ");
			for (T w : map.get(v)) {
				builder.append(w.toString() + " ");
			}
			builder.append("\n");
		}
		return (builder.toString());
	}
}

public class H8 {
	public static void main(String[] args) {
		Graph2 graph = new Graph2();
		graph.addNewEdge(0, 1, true);
		graph.addNewEdge(0, 4, true);
		graph.addNewEdge(1, 2, true);
		graph.addNewEdge(1, 3, false);
		graph.addNewEdge(1, 4, true);
		graph.addNewEdge(2, 3, true);
		graph.addNewEdge(2, 4, true);
		graph.addNewEdge(3, 0, true);
		graph.addNewEdge(2, 0, true);
		System.out.println("Adjacency List for the graph:\n" + graph.toString());
	}
}