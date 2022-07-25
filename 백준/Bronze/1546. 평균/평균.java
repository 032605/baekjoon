import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String score = br.readLine();
		StringTokenizer st = new StringTokenizer(score, " ");
		
		double[] arr = new double[N];
		double sum = 0.0;
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<N; i++) {
			arr[i] = (arr[i]/arr[N-1]*100);
			sum += arr[i];
		}
		
		System.out.println(sum/N);
		
		br.close();
	}
}
