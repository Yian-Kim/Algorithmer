/**
 * 테스트 1 〉	통과 (87.43ms, 114MB)
 * 테스트 2 〉	통과 (14.07ms, 78.5MB)
 * 테스트 3 〉	통과 (12.55ms, 72.5MB)
 * 테스트 4 〉	통과 (9.40ms, 72.4MB)
 */

import java.util.*;

class Solution {
    boolean[] visited;
    ArrayList<String> allRoute;

    public String[] solution(String[][] tickets) {
        String[] answer = {};
        int cnt = 0;
        visited = new boolean[tickets.length];
        allRoute = new ArrayList<>();

        dfs("ICN", "ICN", tickets, cnt);

        Collections.sort(allRoute);
        answer = allRoute.get(0).split(" ");

        return answer;
    }

    public void dfs(String start, String route, String[][] tickets, int cnt){
        if(cnt == tickets.length){
            allRoute.add(route);
            return;
        }

        for(int i=0; i<tickets.length; i++){
            if(start.equals(tickets[i][0]) && !visited[i]){
                visited[i] = true;
                dfs(tickets[i][1], route+" "+tickets[i][1], tickets, cnt+1);
                visited[i] = false;
            }
        }
    }
}