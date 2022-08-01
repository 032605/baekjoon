import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		String A = st.nextToken();
		String B = st.nextToken();
		
		int sangsuA = Integer.parseInt(A.charAt(2) + "00") + Integer.parseInt(A.charAt(1) + "0") + A.charAt(0) - '0';
		int sangsuB = Integer.parseInt(B.charAt(2) + "00") + Integer.parseInt(B.charAt(1) + "0") + B.charAt(0) - '0';
		
		if(sangsuA > sangsuB) {
			System.out.println(sangsuA);
		} else {
			System.out.println(sangsuB);
		}
	}
}