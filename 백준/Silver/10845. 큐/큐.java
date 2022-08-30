import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException  {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		Queue<String> queue = new LinkedList<>();
		
		StringTokenizer st;
		String last = "";
		
		for(int i=0; i<N; i++) {
			
			st  = new StringTokenizer(br.readLine(), " ");
			
			String str = st.nextToken();
			
			switch(str) {
			case "push" : 
				last = st.nextToken();
				queue.add(last);
				break;
			case "pop" :
				if(queue.size() > 0) { sb.append(queue.poll() +  "\n"); } else { sb.append("-1\n"); }
				break;
			case "front" : 
				if(queue.size() > 0) { sb.append(queue.peek() + "\n");	} else { sb.append("-1\n"); }
				break;
			case "back" :
				if(queue.size() > 0) { sb.append(last + "\n"); } else { sb.append("-1\n"); }
				break;
			case "size" :
				sb.append(queue.size() + "\n");
				break;
			case "empty" : 
				if(queue.isEmpty()) { sb.append("1\n"); } else { sb.append("0\n"); }
				break;
			}
		}
		System.out.println(sb);
	}
}