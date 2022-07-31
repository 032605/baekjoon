import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static Integer[] dp;
	
	public static void main(String[] args) throws IOException  {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		
		dp = new Integer[X + 1];
		
		dp[0] = 0;
		dp[1] = 0;
		
		System.out.println(makeOne(X));
		
	}

	public static int makeOne(int X) {
		
		if(dp[X] == null ) {
			if(X%6==0) {
				dp[X] = Math.min(makeOne(X/3), Math.min(makeOne(X/2), makeOne(X-1))) +1;
			} else if(X%3==0) {
				dp[X] = Math.min(makeOne(X/3), makeOne(X-1)) + 1;	
			} else if(X%2==0) {
				dp[X] = Math.min(makeOne(X/2), makeOne(X-1)) + 1;
			} else {
				dp[X] = makeOne(X-1) +1;
			}
			
		}			

		return dp[X];
	}
}