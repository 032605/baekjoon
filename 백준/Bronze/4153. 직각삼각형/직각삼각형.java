import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = "";
		
		int[] arr = new int[3];
		
		while(!(input = br.readLine()).equals("0 0 0")){
			StringTokenizer st = new StringTokenizer(input, " ");
			
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());

			Arrays.sort(arr);	//정렬하여 길이가 긴 것이 먼저 와도 계산
			
			if((arr[2]*arr[2]) == (arr[0]*arr[0]) + (arr[1]*arr[1])) {
				sb.append("right" + "\n");
			} else {
				sb.append("wrong" + "\n");
			}

		}
		System.out.println(sb);
	}
}