import java.util.ArrayList;
import java.util.Scanner;

public class Road {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		EdgeWeightedGraph g = new EdgeWeightedGraph(n+1);
		
		for(int i =0; i<m ; i++) {
			g.addEdge(new Edge(kb.nextInt(), kb.nextInt(), kb.nextDouble()));
		}
		
		KruskalMST k = new KruskalMST(g);
		System.out.printf("%.2f",k.weight());
		System.out.println();
		
		ArrayList<Edge> arr = k.edges();
		for(Edge e : arr) {
			System.out.print(e.from() + "-" + e.to()+" ");
			k = new KruskalMST(g);
			System.out.printf("%.1f",e.weight());
			System.out.println();
			g.removeEdge(e);
			
		}
		
		KruskalMST k1 = new KruskalMST(g);
		System.out.printf("%.2f",k1.weight());
		System.out.println();
		
		ArrayList<Edge> arr1 = k1.edges();
		for(Edge e : arr1) {
			System.out.print(e.from() + "-" + e.to()+" ");
			k = new KruskalMST(g);
			System.out.printf("%.1f",e.weight());
			System.out.println();
			
			
		}
		

	}

}
