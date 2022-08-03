import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		String str = "";

		while ((str = br.readLine()) != null && (Integer.parseInt(str) != 0)) {
			sb.setLength(0); //sb 객체 비우기
			String strReverse = sb.append(str).reverse().toString();

			if(str.equals(strReverse)) {
				sb2.append("yes" + "\n");
			} else {
				sb2.append("no" + "\n");
			}
		}
		System.out.println(sb2);
	}
}