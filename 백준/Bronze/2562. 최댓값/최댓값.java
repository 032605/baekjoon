import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
	 
	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[9];
		int max = arr[0];
		int index = 0;
		StringTokenizer st;
		
		for(int i=0; i<arr.length; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(max < arr[i]) {
				max = arr[i];
				index = i+1;
			}
		}

		bw.write(max + "\n");
		bw.write(index + "");
		
		bw.flush();
		bw.close();
		
		br.close();
	}
}