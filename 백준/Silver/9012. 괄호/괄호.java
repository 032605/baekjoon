import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine()); 	

		for(int i=0; i<N; i++) {
			int cnt = 0;	//초기화
			boolean TF = true;	//답 출력 가능/불가
			
			String str = br.readLine();
			
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) == '(' ) {
					cnt++;
				} else {
					cnt--;
				}
				
				if(cnt < 0 && TF) {
					sb.append("NO" + "\n");
					TF = false;
					continue;
				}
			}
			
			if (cnt > 0 && TF) {
				sb.append("NO" + "\n");
			} else if(cnt == 0 && TF) {
				sb.append("YES" + "\n");
			}
		}
		
		System.out.println(sb);
	}
}