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
	
		String val = br.readLine();
		
		StringTokenizer st = new StringTokenizer(val, " ");
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		String A = br.readLine();
		StringTokenizer st2 = new StringTokenizer(A, " ");

		for(int i=0; i<N; i++) {
			int arr[] = new int[N];
			
			arr[i] = Integer.parseInt(st2.nextToken());
			
			if(arr[i] < X ) {
				bw.write(arr[i] + " ");
			}
		}
		
		br.close();
		
		bw.flush();
		bw.close();
	}
}
