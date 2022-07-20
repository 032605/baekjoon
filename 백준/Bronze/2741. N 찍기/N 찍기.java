import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int val = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=val; i++) {
			
			bw.write(i + "\n");
		}
		
		br.close();
		
		bw.flush(); // write로 담은 내용 출력 후, 버퍼를 비움.
		bw.close(); 
	}
}