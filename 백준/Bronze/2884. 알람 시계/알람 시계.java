import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		String arr[] = input.split(" ");
		int h = Integer.parseInt(arr[0]); 
		int m = Integer.parseInt(arr[1]);
		
		if(m>=45) {
			System.out.println(h + " " + (m-45) );
		} else {
			if(h == 0) {
				h = 24; 
			}
			
			System.out.println((h-1) + " " + ((m+60) - 45));
		}
	}
}