import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException  {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		for(int i=0; i<str.length(); i++) {

			String a = Character.toString(str.charAt(i));
			if(str.charAt(i)>=97) {
				sb.append(a.toUpperCase());
			} else {
				sb.append(a.toLowerCase());
			}
		}
		System.out.println(sb);
	}
}