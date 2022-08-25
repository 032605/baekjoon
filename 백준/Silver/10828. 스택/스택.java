import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine()); 	
		
		Stack<Integer> stack = new Stack<>(); //char형 스택 선언
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			
			if(str.length() > 5) {
				String[] arr = str.split(" ");
				stack.push(Integer.parseInt(arr[1]));
				continue;
			}
				
			switch(str) {
				case "pop" :
					if(stack.empty()) {
						sb.append("-1\n");
					} else {
						sb.append(stack.peek() + "\n");
						stack.pop();
					}
					break;
				case "size" :
					sb.append(stack.size() + "\n");
					break;
				case "empty" :
					if(stack.empty()) {
						sb.append("1\n");
					} else {
						sb.append("0\n");
					}
					break;
				case "top" :
					if(stack.empty()) {
						sb.append("-1\n");
					} else {
						sb.append(stack.peek() + "\n");
					}
					break;
				default: break;
			}
		}
		System.out.println(sb);
	}
}