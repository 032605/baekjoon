import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<String>();
		
		for(int i=0; i<N; i++) {
			set.add(br.readLine());	//중복제거
		}

		String[] arr = set.toArray(new String[set.size()]);	//set을 배열로 변환
		Arrays.sort(arr);	// 정렬
		
		for(int i=0; i<51; i++) {
			for(String val : arr) {
				if(val.length() == i) { sb.append(val + "\n"); }
			}
		}
		System.out.println(sb);
	}
}