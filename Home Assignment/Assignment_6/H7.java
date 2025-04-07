package Assignment_6;

import java.util.LinkedList;

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
			System.out.println();
		}
	}
}
public class H7 {

}
