import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
		static ArrayList<Integer> A[];
		static boolean[] visited;
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());	//노드 개수
		int M = Integer.parseInt(st.nextToken());	//엣지 개수
		int S = Integer.parseInt(st.nextToken());	//시작점
		
		A = new ArrayList[N+1];
		
		for(int i=1; i<N+1; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for(int i=1; i<M+1; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			A[s].add(e);
			A[e].add(s);
		}
		
		for(int i=1; i<N+1; i++) {
			Collections.sort(A[i]);
		}
		
		visited = new boolean[N+1];
		DFS(S);
		System.out.println();
		visited = new boolean[N+1];
		BFS(S);
		System.out.println();
	}


	static void BFS(int node) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(node);
		visited[node] = true;
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			System.out.print(now + " ");
			for(int i : A[now]) {
				if(!visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}

	static void DFS(int node) {
		System.out.print(node + " ");
		visited[node] = true;
		for(int i : A[node]) {
			if(!visited[i]) {
				visited[i] = true;
				DFS(i);
			}
		}
	}
}
