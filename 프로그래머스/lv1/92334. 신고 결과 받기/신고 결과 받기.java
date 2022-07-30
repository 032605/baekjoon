import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.StringTokenizer;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, HashSet<String>> map = new HashMap<>();
        Map<String, Integer> idMap = new HashMap<>();
        
        for(int i=0; i<id_list.length; i++){
            map.put(id_list[i], new HashSet<>());
            idMap.put(id_list[i], i);
        }
        
        for(int i=0; i<report.length; i++){
            StringTokenizer st = new StringTokenizer(report[i], " ");
            String from = st.nextToken();
            String to = st.nextToken();
            map.get(to).add(from);
        }
        
        for(int i=0; i<id_list.length; i++){
            HashSet<String> mail = map.get(id_list[i]);
            if(mail.size() >= k){
                for(String name : mail)
                    answer[idMap.get(name)]++;
            }
        }
        
        return answer;
    }
}