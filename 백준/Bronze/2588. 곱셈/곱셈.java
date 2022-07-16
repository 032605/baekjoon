import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main{
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int A = Integer.parseInt(br.readLine());
		String B = br.readLine();
		
		br.close();
		
		System.out.println(A * (B.charAt(2)-'0'));
		System.out.println(A * (B.charAt(1)-'0'));
		System.out.println(A * (B.charAt(0)-'0'));
		System.out.println(A * (Integer.parseInt(B)));
	}
}