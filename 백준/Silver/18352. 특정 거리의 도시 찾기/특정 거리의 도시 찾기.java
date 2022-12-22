import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer> A[];
	static int visited[];
	static List<Integer> answer;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());	// 도시 개수
		int M = Integer.parseInt(st.nextToken());	// 도로 개수
		int K = Integer.parseInt(st.nextToken());	// 최단 거리
		int X = Integer.parseInt(st.nextToken());	// 출발지

		A = new ArrayList[N+1];
		visited = new int[N+1];
		answer = new ArrayList<>();
		
		for(int i=1; i<N+1; i++) {
			A[i] = new ArrayList<Integer>();
			visited[i] = -1;
		}
		
		for(int i=1; i<M+1; i++) {
			st = new StringTokenizer(br.readLine());
			
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			A[s].add(e);
		}
		
		BFS(X);
		
		for(int i=1; i<N+1; i++) {
			if(visited[i] == K) {
				answer.add(i);
			} 
		}
		
		if(answer.isEmpty()) {
			System.out.println("-1");
		} else {
			Collections.sort(answer);
			for(int val : answer) {
				System.out.println(val);
			}
		}
	}

	static void BFS(int node) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(node);
		visited[node]++;
		
		while(!queue.isEmpty()) {
			int data = queue.poll();
				for(int val : A[data]) {
					if(visited[val] == -1) {
						visited[val] = visited[data] + 1;
						queue.add(val);
				}
			}
		}		
	}
}
