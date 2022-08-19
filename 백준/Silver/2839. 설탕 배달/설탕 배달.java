import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException  {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int result = -1;
		
		if(N==7 || N==4) {
			result = -1;
		} else if(N%5==0) {
			result = N/5;
		} else if(N%5==1||N%5==3) { 
			result = (N/5) + 1;
		} else if(N%5==2||N%5==4) {
			result = (N/5) + 2;
		}
		
		System.out.println(result);
	}
}