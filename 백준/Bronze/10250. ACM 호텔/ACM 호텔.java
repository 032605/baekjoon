import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int H = Integer.parseInt(st.nextToken()); 	// 층수
			int W = Integer.parseInt(st.nextToken()); 	// 호수
			int S = Integer.parseInt(st.nextToken());	// 체크인 순서
			
			if(S%H==0) {
				sb.append(H);
			} else {
				sb.append(S-H*(S/H));
			}
			
			if(Math.ceil((double) S/H) < 10) {
				sb.append("0");
			}

			if(S%H==0) {
				sb.append(S/H + "\n");
			} else {
				sb.append((S/H)+1 + "\n");
			}
		}
		System.out.println(sb);
	}
}