import java.util.Scanner;
import java.util.Stack;

public class shortTestPath {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt(); 
		EdgeWeightedDigraph g = new EdgeWeightedDigraph(n+1);
		
		for(int i= 0; i<m; i++) {
			g.addEdge(new DirectedEdge(kb.nextInt(), kb.nextInt(), kb.nextInt()));
		}
		
		int s  = kb.nextInt();
		DijkstraSP dij = new DijkstraSP(g, s);
		for(int i=0; i<=n; i++) {
			
			if(!Double.isInfinite(dij.distTo(i))) {
				System.out.print(s+" to "+i+" ( ");
				System.out.printf("%.2f",dij.distTo(i));
				System.out.print(" ): ");
				
				Stack<DirectedEdge> st = dij.pathTo(i);
				System.out.print(s);
				
				while(!st.isEmpty()) {
					DirectedEdge e = st.pop();
					System.out.print(" -> " + e.to());
				}
				System.out.println();
			}
		
			
		}
		

	}

}
