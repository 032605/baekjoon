import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int val = Integer.parseInt(br.readLine());
		int num = 0;
		
		for(int i=1; i<val; i++) {
			num += i;
		}
		
		System.out.println(num + val);
	}
}
