import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine()); 	
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<N; i++)
			list.add(Integer.parseInt(br.readLine()));
		
		Collections.sort(list);	// Timsort (합병 및 삽입정렬 알고리즘)
		
		for(int val : list) {
			sb.append(val + "\n");
		}
			
		System.out.println(sb);
	}
}