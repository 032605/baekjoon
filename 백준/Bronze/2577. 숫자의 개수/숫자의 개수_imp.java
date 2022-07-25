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
		
		for(int i=0; i<val.length(); i++) {
			arr[val.charAt(i) - 48]++;
			
		}
		
		for (int cnt : arr)
			bw.write(cnt + "\n");
		
		br.close();

		bw.flush();
		bw.close();
	}
}
