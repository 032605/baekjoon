import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		int[] arr = new int[26];
		
		for(int i=0; i<arr.length; i++) {
			
			char alp = (char) (i+97);
			
			if(str.indexOf(alp) > -1) {
				arr[i] = str.indexOf(alp);
			} else {
				arr[i] = -1;
			} 
			System.out.print(arr[i] + " ");
		}
	}
}