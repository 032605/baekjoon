import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int cnt=0;
		
		for(int i=0; i<N; i++) {
			int num=i;
			int sum=0;
			
			while(num != 0) {
				sum+=num%10;	//1자리 수부터 계산하여 sum에 합계
				num/=10;		//앞자리 수 숫자 계산을 위해 10 나누기
			}
			
			if(sum+i==N) {
				System.out.println(i);
				cnt++;
				break;
			} 
		}
		
		if(cnt==0) {
			System.out.println(0);
		}
	}
}