import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static int cnt; 
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		
		for(int i=1; i<=N; i++) {
			if(i<100) {
				cnt++;
			} else {
				if(hansu(i)) { cnt++; }
			}
		}

		System.out.println(cnt);
	}
	public static boolean hansu(int num) {

		int val = (num%10) - ((num/10) % 10);	//공차
		
		while(num>=100) {
			num /= 10;	//1자리수 제거
			if(val!=(num%10) - ((num/10) % 10)) {
				return false;		//공차와 1자리수 제거한 공차를 비교
			}
		}
		return true;
	}

}