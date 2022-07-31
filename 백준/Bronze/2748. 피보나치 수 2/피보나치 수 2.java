import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static long[] dp;
	
	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());	
		
		dp = new long[N + 1];

		for(int i = 0; i < N + 1; i++) {
			dp[i] = -1;
		}
		
		dp[0] = 0;
		dp[1] = 1;
		System.out.println(fibo(N));
	}

	public static long fibo(int N) {
		
		if(dp[N]==-1){
			dp[N] = fibo(N-1) + fibo(N-2);	//값이 없다면 재귀함수 호출
		} 
		return dp[N];
	}
}