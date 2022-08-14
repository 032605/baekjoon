import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException  {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int A = Integer.parseInt(st.nextToken());	//올라감
		int B = Integer.parseInt(st.nextToken());	//내려감
		int V = Integer.parseInt(st.nextToken());	//나무 높이
		
		int days = (V-B)/(A-B);	// 막밤 제외 정점 찍는 낮까지 걸리는 일수
		
		if((V-B)%(A-B)!=0) {
			days++;				// 블럭이 남아있을 경우
		}
		
		System.out.println(days);
	}
}