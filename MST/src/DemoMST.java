import java.util.ArrayList;

public class DemoMST {
	public static void main(String[] args) {
		EdgeWeightedGraph g = new EdgeWeightedGraph(6);
		
		g.addEdge(new Edge(1, 5, 25));
		g.addEdge(new Edge(2, 3, 12));
		g.addEdge(new Edge(2, 4, 8));
		g.addEdge(new Edge(2, 5, 9));
		g.addEdge(new Edge(4, 5, 6));

		KruskalMST m = new KruskalMST(g);
		System.out.println(m.weight());
		
		ArrayList<Edge> arr = m.edges();
		for(Edge e : arr) {
			System.out.println(e.from() + " -> " + e.to());
		}
		
	}
}