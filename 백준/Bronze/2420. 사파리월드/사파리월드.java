import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			long N = Long.parseLong(st.nextToken()); 	// 층수
			long M = Long.parseLong(st.nextToken()); 	// 호수
			
			System.out.println(Math.abs(N-M));
	}
}