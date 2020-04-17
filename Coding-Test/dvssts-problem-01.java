import java.util.*;

class Solution {
    public int solution(String[] names) {
        int answer = 0;
        String[] firstName = new String[names.length];
        Map<String, Integer> map = new HashMap<>();
        
        Arrays.sort(names);
        
        for (int i = 0; i < names.length; i++) {
            firstName[i] = names[i].split("")[0];
            
            if (map.containsKey(firstName[i])) {
               map.put(firstName[i], map.get(firstName[i]) + 1);
            } else {
               map.put(firstName[i], 1);
            }
        }
        
        for (String key : map.keySet()) {
           if (map.get(key) > 2) {
              answer++;
           }
        }
        
        return answer;
    }
}
