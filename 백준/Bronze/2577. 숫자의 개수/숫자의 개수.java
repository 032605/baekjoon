import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		String val = Integer.toString(A * B * C);
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<val.length(); j++) {
				
				int num = val.charAt(j) - '0';
				
				if(num == i) {
					arr[i]++;
				}
			}
			bw.write(arr[i] + "\n");
		}
		br.close();

		bw.flush();
		bw.close();
	}
}