import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		int cnt = 0;
		String val ="";
		
		String num = input;
		
		while(!num.equals(val)) {
			
			cnt++;
			
			if(input.length() <= 1) {
				input = "0" + input; 	// 1자리 수는 앞에 0 붙이기
			}
			String[] arr= input.split("");
			int B = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);	//일의 자리 수
			String[] arr2 = Integer.toString(B).split("");					//십의 자리 수
			//새로운 수 계산
			if(arr2.length > 1) {
				val = arr[1] + arr2[1];
			} else {
				val = arr[1] + arr2[0];
			}
			
			if(Integer.parseInt(num) == Integer.parseInt(val)) {
				break;
			} else {
				input = val;	
			}
			
		};
		
		System.out.println(cnt);			
		br.close();
		
	}
}