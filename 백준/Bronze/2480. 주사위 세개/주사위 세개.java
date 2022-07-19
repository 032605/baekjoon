import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		String arr[] = input.split(" ");
		int a = Integer.parseInt(arr[0]); 
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		
		if(a==b && b==c) {
			System.out.println(10000+(a*1000));
		} else if(a==b || b==c || a==c) {
			
			int val = a;
			if(b==c) {
				val=b;
			}
			System.out.println(1000 + (val*100));
		} else {
			Arrays.sort(arr);
			System.out.println(Integer.parseInt(arr[2]) * 100);
		}
	}
}