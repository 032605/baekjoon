import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input, " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
	
		String num = br.readLine();
		StringTokenizer st2 = new StringTokenizer(num, " ");
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
		}
		
		System.out.println(sol(N, M, arr));
		
	}

	private static int sol(int N, int M, int[] arr) {
		int sum = 0;
		
		for(int i=0; i<N-2; i++) {
			if(arr[i] > M) continue; 
			for(int j=i+1; j<N-1; j++) {
				if(arr[i] + arr[j] > M) continue;
				for(int k=j+1; k<N; k++) {
					int temp = arr[i] + arr[j] + arr[k];
					
					if(temp == M) { return M; } 
					
					if(temp < M && sum < temp) {
						sum = temp;
					}
				}
			}
		}
		return sum;
	}
}