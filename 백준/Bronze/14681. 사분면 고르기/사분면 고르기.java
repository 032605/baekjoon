import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String args[]) throws IOException{
		
		//90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		if(x>= 0 && y>= 0) {
			System.out.println("1");
		} else if(x< 0 && y>= 0) {
			System.out.println("2");
		} else if(x< 0 && y< 0) {
			System.out.println("3");
		} else {
			System.out.println("4");
		}
		
	}
}