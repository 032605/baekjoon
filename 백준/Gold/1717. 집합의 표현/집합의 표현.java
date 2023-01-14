import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int[] parent; // 대표원소
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		
		parent = new int[n+1];
		
		for(int i=1; i<n+1; i++) {
			parent[i] = i;
		}
		
		for(int i=0; i<q; i++) {
			st = new StringTokenizer(br.readLine());
			
			int query = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			switch(query) {
				case 0 : 
					union(a,b);
					break;
				case 1 :
					if(find(a) == find(b)) {
						System.out.println("YES");
					} else {
						System.out.println("NO");
					}
					break;
			}
		}
	}

	static int find(int index) {
			if(index != parent[index]) {
				return parent[index] = find(parent[index]);
			} else {
				return index; 
			}
	}

	static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if(a!=b) {
			if(a<b) {
				parent[b] = a;
			} else {
				parent[a] = b;
			}
		}
	}
}