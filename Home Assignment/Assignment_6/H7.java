package Assignment_6;

import java.util.LinkedList;
import java.util.Scanner;


class Graph1<T>{
	private LinkedList<T>[]adjList;
	private int vertices;
	public Graph1(int vertices) {
		// TODO Auto-generated constructor stub
		this.vertices = vertices;
		adjList = new LinkedList[vertices];
		for (int i = 0; i < vertices; i++) {
			adjList[i] = new LinkedList<>();
		}
	}
	void addEdge(int src, T des) {
		if(src >= 0 && src < vertices) {
			adjList[src].add(des);
		}
		else {
			throw new IndexOutOfBoundsException("Vertex "+src+" does not exist.");
		}
	}
	void printAdjList() {
		for(int i=0; i < vertices; i++) {
			System.out.print("Vertext "+i+"-->");
			for (T vertex : adjList[i]) {
				System.out.print(vertex+" ");
			}
			System.out.println();
		}
	}
	void DFS(int vertex, boolean[]visited) {
		visited[vertex] = true;
		System.out.print(vertex+" ");
		for (T v : adjList[vertex] ) {
			int n = (int) v;
			if(! visited[n]) {
				DFS(n, visited);
			}
		}
	}
}
public class H7 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vertices: ");
		int vertices = sc.nextInt();
		Graph1<Integer> graph = new Graph1<>(vertices);
		System.out.println("Enter the number of edges: ");
		int edges = sc.nextInt();
		System.out.println("Enter the edges: ");
		for (int i = 0;i < edges;i++) {
			System.out.println("Source: ");
			int source = sc.nextInt();
			System.out.println("Destination: ");
			int destination = sc.nextInt();
			graph.addEdge(source, destination);
		}
		boolean[] visited = new boolean[vertices];
		System.out.println("\nAdjacency List:");
		graph.printAdjList();
		System.out.println("\nFollowing is Depth First Traversal:");
		for (int i = 0; i < vertices; i++) {
			if(!visited[i]) {
				graph.DFS(i, visited);
			}
		}
		sc.close();
	}
    
}