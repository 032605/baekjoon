import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
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
		
		Deque<String> de = new ArrayDeque<>();
		
		StringTokenizer st;
		String last = "";
		
		for(int i=0; i<N; i++) {
			
			st  = new StringTokenizer(br.readLine(), " ");
			
			String str = st.nextToken();
			
			switch(str) {
			case "push_front" : 
				de.addFirst(st.nextToken());
				break;
			case "push_back" :
				de.addLast(st.nextToken());
				break;
			case "pop_front" : 
				if(de.size() > 0) { sb.append(de.removeFirst() + "\n");	} else { sb.append("-1\n"); }
				break;
			case "pop_back" :
				if(de.size() > 0) { sb.append(de.removeLast() + "\n"); } else { sb.append("-1\n"); }
				break;
			case "size" :
				sb.append(de.size() + "\n");
				break;
			case "empty" : 
				if(de.isEmpty()) { sb.append("1\n"); } else { sb.append("0\n"); }
				break;
			case "front" : 
				if(de.size() > 0) { sb.append(de.getFirst() + "\n");	} else { sb.append("-1\n"); }
				break;
			case "back" : 
				if(de.size() > 0) { sb.append(de.getLast() + "\n");	} else { sb.append("-1\n"); }
				break;
			}
		}
		System.out.println(sb);
	}
}