import java.util.ArrayList;
import java.util.Scanner;

public class Road2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		
		
		for(int i =0 ; i<t; i++) {
			int n = kb.nextInt();
			int m = kb.nextInt();
			int p = kb.nextInt();
			int q = kb.nextInt();
			
			EdgeWeightedGraph g = new EdgeWeightedGraph(n+1);
			
			for(int j =0; j<m ; j++) {
				g.addEdge(new Edge(kb.nextInt(), kb.nextInt(), kb.nextDouble()));
			}
			
			int sum = 0;
			
			KruskalMST k = new KruskalMST(g);
			ArrayList<Edge> arr = k.edges();
			for(Edge e : arr) {
				if(e.from() == p && e.to() == q) {
					System.out.println("yes");
					sum = 1;
					break;
				}
				
			}
			if(sum == 0) {
				System.out.println("no");
			}
		}
		
	}

}
