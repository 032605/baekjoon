import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine().toUpperCase();
		int[] arr = new int[26];
		
		for(int i=0; i<str.length(); i++) {
		
			for(int j=0; j<arr.length; j++) {
				if((str.charAt(i)-65) == j) {
					arr[str.charAt(i)-65]++;
				} 
			}
			
		}
		
		int max = 0;
		int val = 0;
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				val = i;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(max == arr[i]) {
				cnt++;
			}
		}
		
		if(cnt >= 2) { 
			bw.write("?");
		} else {
			bw.write((char) (val+65));
		}
		
		bw.flush();
		bw.close();
	}
}