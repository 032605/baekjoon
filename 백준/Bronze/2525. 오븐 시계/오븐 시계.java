import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		StringTokenizer st = new StringTokenizer(input," ");
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int time = Integer.parseInt(br.readLine());
		
		int val = m + time;
		
		if(val>= 60) {
			h += val/60;
			m = val%60;
		} else {
			m += time;
		}
		
		if(h >= 24) {
			h -= 24;
		}
		
		System.out.println(h + " " + m);
	}
}