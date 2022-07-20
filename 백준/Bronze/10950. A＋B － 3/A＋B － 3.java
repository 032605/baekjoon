import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int val = Integer.parseInt(br.readLine());
		
		int arr[] = new int[val];
		int arr2[] = new int[val];
		
		for(int i=0; i<val; i++) {

			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input," ");
			
			arr[i] = Integer.parseInt(st.nextToken());
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<val; i++) {
			System.out.println(arr[i] + arr2[i]);
		}
		
	}
}
