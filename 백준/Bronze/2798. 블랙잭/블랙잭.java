import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
		}
		
		int sum = 0;
		int temp = 0;
		
		for(int i=0; i<N-2; i++) {
				if(arr[i]>M) { continue; }
			for(int j=i+1; j<N-1; j++) {
				if(arr[i]+arr[j]>M) { continue; }
				for(int k=j+1; k<N; k++) {
					temp = arr[i]+arr[j]+arr[k];
					
					if(temp == M) {
						sum = M;
						break;
					}
					
					if(temp < M && temp > sum) { sum = temp; }
				}
			}
		}
		
		System.out.println(sum);
	}
}