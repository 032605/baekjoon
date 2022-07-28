import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		String[] str = new String[T];
		int N = 0;
		
		for(int i=0; i<T; i++) {
			String S = br.readLine();
			
			StringTokenizer st = new StringTokenizer(S, " ");
			
			N = Integer.parseInt(st.nextToken());	//반복 수
		
			str[i] = st.nextToken();
		
			for(int j=0; j<str[i].length(); j++) {
				for(int k=0; k<N; k++) {
					bw.write(str[i].charAt(j));
				}
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
