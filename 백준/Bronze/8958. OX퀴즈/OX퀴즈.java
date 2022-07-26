import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String[] arr = new String[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = br.readLine();
		}
		
		int val, sum;
		
		for(int i=0; i<N; i++) {
			
			val = 0;
			sum = 0;
			
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					val++;
					sum += val;
				} else
					val = 0;
			}
			
			System.out.println(sum);
		}
		
		br.close();
	}
}