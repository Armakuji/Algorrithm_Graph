import java.util.Scanner;

public class quictoi {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Graph g = new Graph(1001);
		int count = 0;
		int n= kb.nextInt();
		int p1,p2;
		
		for(int i = 0; i<n ; i++) {
			g.addEdge(kb.nextInt(), kb.nextInt());
		}
		
	
		
		for(int i = 0 ;i<10;i++) {
			p1 = kb.nextInt();
			p2 = kb.nextInt();
			
			BreadthFirstPaths bfs = new BreadthFirstPaths(g, p1);
			
			if(p1 == 0 && p2 == 0) {
				break;
			}else {
				for(int j = 0 ;j<1001;j++) {
					if(bfs.distTo(j) > p2) {
						count++;
					}
				}
				
				System.out.println(count);
				count = 0;
				
			}
			
			
		}
		
	
		
		
		
		
		
	}

}
