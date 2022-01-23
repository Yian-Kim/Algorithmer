/**
 * 테스트 1 〉	통과 (0.02ms, 72.9MB)
 * 테스트 2 〉	통과 (0.05ms, 80.4MB)
 * 테스트 3 〉	통과 (0.32ms, 77.7MB)
 * 테스트 4 〉	통과 (0.02ms, 76.5MB)
 * 테스트 5 〉	통과 (0.02ms, 72.1MB)
 *
 */
class Solution {
    static boolean[] visited;
    static int answer = 0;

    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];

        dfs(begin, target, words, 0);
        return answer;
    }

    public static void dfs(String begin, String target, String[] words, int cnt) {
        if (begin.equals(target)) {
            answer = cnt;
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (visited[i]) {
                continue;
            }

            int k = 0;
            for (int j = 0; j < begin.length(); j++) {
                if (begin.charAt(j) == words[i].charAt(j)) { // 같은 스펠링 몇개인지 세기
                    k++;
                }
            }

            if (k == begin.length() - 1) {  // 한글자 빼고 모두 같은 경우
                visited[i] = true;
                dfs(words[i], target, words, cnt + 1);
                visited[i] = false;
            }
        }
    }
}