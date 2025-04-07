package Assignment_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Graph {
	private int V;
	private List<List<Integer>> adjList;
	private int[][] adjMatrix;

	public Graph(int V) {
		// TODO Auto-generated constructor stub
		this.V = V;
		adjList = new ArrayList<>(V);
		adjMatrix = new int[V][V];
		for (int i = 0; i < V; i++) {
			adjList.add(new LinkedList<>());
		}
	}

	public void addEdge(int src, int dest) {
		adjList.get(src).add(dest);
		adjMatrix[src][dest] = 1;
	}

	public void displayAdjMatrix() {
		System.out.println("Adjacency Matrix: \n");
		for (int i = 0; i < V; i++) {
			for (int j = 0; j < V; j++) {
				System.out.print(adjMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void displayAdjList() {
		System.out.println("Adjacency List: \n");
		for (int i = 0; i < V; i++) {
			System.out.print(i + "-->");
			for (Integer neighbour : adjList.get(i)) {
				System.out.print(neighbour + " ");
			}
			System.out.println();
		}
	}

}

public class H6 {
	public static void main(String[] args) {
		int V = 5;
		Graph graph = new Graph(V);
		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.displayAdjMatrix();
		System.out.println();
		graph.displayAdjList();
	}
}

//OUTPUT
//Adjacency Matrix: 
//
//0 1 0 0 1 
//0 0 1 1 1 
//0 0 0 1 0 
//0 0 0 0 1 
//0 0 0 0 0 
//
//Adjacency List: 
//
//0-->1 4 
//1-->2 3 4 
//2-->3 
//3-->4 
//4-->