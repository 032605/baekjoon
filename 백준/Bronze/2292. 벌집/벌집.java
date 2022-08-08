import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		// 1 - 1
		// 2~7 - 2    6
		// 8~19 - 3   12
		// 20~37 - 4  18
		// 38~61 - 5  24
		
		int cnt = 1;
		int range = 2;
		
		if(N == 1) {
			System.out.println(1);
		} else {
			while(range <= N) {
				range =  range + (6 * cnt);
				cnt++;
			}
            System.out.println(cnt);
		}
	}
}