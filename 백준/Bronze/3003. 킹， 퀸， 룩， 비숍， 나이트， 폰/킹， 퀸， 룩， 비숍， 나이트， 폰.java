import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] chess = {1, 1, 2, 2, 2, 8};	//킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
		
		for(int i=0; i<chess.length; i++) {
			System.out.print(chess[i] - Integer.parseInt(st.nextToken()) + " ");
		}
		
	}

}