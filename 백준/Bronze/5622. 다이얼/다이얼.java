import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int time = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>=87) {
				time += 10;
			} else if(str.charAt(i)>=84) {
				time += 9;
			} else if(str.charAt(i)>=80) {
				time += 8;
			} else {
				time += (str.charAt(i) - 65) / 3 + 3;
			}
		}
		System.out.println(time);
	}
}