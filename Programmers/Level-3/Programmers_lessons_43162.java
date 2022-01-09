/**
 * 테스트 1 〉	통과 (0.02ms, 72.6MB)
 * 테스트 2 〉	통과 (0.03ms, 76.3MB)
 * 테스트 3 〉	통과 (0.03ms, 75.5MB)
 * 테스트 4 〉	통과 (0.02ms, 75.5MB)
 * 테스트 5 〉	통과 (0.02ms, 76.5MB)
 * 테스트 6 〉	통과 (0.08ms, 76.4MB)
 * 테스트 7 〉	통과 (0.02ms, 75.5MB)
 * 테스트 8 〉	통과 (0.06ms, 67MB)
 * 테스트 9 〉	통과 (0.04ms, 86.4MB)
 * 테스트 10 〉	통과 (0.04ms, 76.6MB)
 * 테스트 11 〉	통과 (0.20ms, 81.5MB)
 * 테스트 12 〉	통과 (0.17ms, 76.9MB)
 * 테스트 13 〉	통과 (0.17ms, 75MB)
 *
 */
public class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] check = new boolean[n]; // n 갯수만큼 boolean 배열을 만들고 모든 요소를 false로 초기화

        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                dfs(computers, i, check);
                answer++;
            }
        }

        return answer;
    }

    boolean[] dfs(int[][] computers, int i, boolean[] check) {
        check[i] = true;

        for (int j = 0; j < computers.length; j++) {
            if (i != j && computers[i][j] == 1 && check[j] == false) {
                check = dfs(computers, j, check);
            }
        }
        return check;
    }
}

/**
 * 내가 푼 것
 */
//class Solution {
//    public int solution(int n, int[][] computers) {
//        int answer = 0;
//        int cnt = 0;
//
//        for (int i=0; i<n; i++) {
//            for (int j=0; j<n; j++) {
//                if (i < j && computers[i][j] == 1) {
//                    cnt++;
//                }
//            }
//        }
//        answer = n - cnt;
//        return answer;
//    }
//}