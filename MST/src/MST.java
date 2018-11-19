import java.util.ArrayList;
import java.util.Scanner;

public class MST {

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
			System.out.printf("%.2f",e.weight());
			System.out.println();
			
		}
		
	}

}
