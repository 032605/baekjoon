import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException  {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[8];
		int[] pb = {8, 7, 6, 5, 4, 3, 2, 1};
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int cnt = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == pb[i]) { cnt--; }
		}	
		
		Arrays.sort(pb);
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == pb[i]) { cnt++; }
		}
		
		if(cnt == 8) {
			System.out.println("ascending");
		} else if( cnt == -8) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
}