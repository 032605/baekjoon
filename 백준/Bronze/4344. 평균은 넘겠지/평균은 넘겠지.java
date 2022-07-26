import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int C = Integer.parseInt(br.readLine());
		StringTokenizer st;

		int N; 
		int[] arr;
		int sum, cnt;
		
		for(int i=0; i<C; i++) {

			sum = 0;
			cnt = 0;
			
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());	// 학생 수
			
			arr = new int[N];
			
			for(int j=0; j<N; j++) {
				arr[j] = Integer.parseInt(st.nextToken());	//배열 요소 삽입
			}
			
			for(int k=0; k<N; k++) {
				sum += arr[k];	// 배열 요소 합 구하기
			}
			
			for(int m=0; m<N; m++) {
				if(arr[m] > sum/N) {
					cnt++;	//평균 이상 개수 구하기
				}
			}
			
			double per = (double) cnt/N * 100;	// 비율 계산
			sb.append(String.format("%.3f", per)+"%").append('\n');
		}
		System.out.println(sb);
		
		br.close();
	}
}