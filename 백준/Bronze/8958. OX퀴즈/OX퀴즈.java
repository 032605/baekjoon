import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		boolean[][] arr = new boolean[N][80];
		int val = 0;
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			
			String str = br.readLine();
			
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) == 'O') {
					arr[i][j] = true;
				}
			}
			
		}
		
		for(int i=0; i<N; i++) {
			
			sum = 0;
			
			for(int j=0; j<80; j++) {
				if(arr[i][j]) {
					val++;
					sum += val;
				} else {
					val = 0;
				}
			}
			System.out.println(sum);
		}
		
		br.close();
	}
}
