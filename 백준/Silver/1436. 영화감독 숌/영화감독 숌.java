import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());	
		
		int num = 665;
		int cnt=0;
		while(true) {
			num++;
			
			if(Integer.toString(num).contains("666") && cnt < N) {	
				cnt++;
				if(cnt == N) { 
					sb.append(num);
					break;
				}
			}
		}
		
		System.out.println(sb);
			
	}
}