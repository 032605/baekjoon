import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String sosu = br.readLine();
		
		StringTokenizer st = new StringTokenizer(sosu, " ");
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int cnt = 0;

		for(int val : arr) {
			if(val == 2) {
				cnt++;
				continue;
			} else {
				for(int j=2; j<val; j++) {
					if(val % j != 0 ) {
						if(j == val-1) {
							cnt++;
							break;
						} else {
							continue;
						}
					} else {
						break;
					} 
				}				
			}
		}
		System.out.println(cnt);
	}
}