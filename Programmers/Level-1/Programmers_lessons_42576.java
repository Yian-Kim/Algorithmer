/**
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.30ms, 73.7MB)
 * 테스트 2 〉	통과 (0.25ms, 77.5MB)
 * 테스트 3 〉	통과 (2.18ms, 75.2MB)
 * 테스트 4 〉	통과 (3.89ms, 80MB)
 * 테스트 5 〉	통과 (3.98ms, 76.8MB)
 *
 * 효율성  테스트
 * 테스트 1 〉	통과 (93.98ms, 80.9MB)
 * 테스트 2 〉	통과 (209.70ms, 104MB)
 * 테스트 3 〉	통과 (245.44ms, 95.2MB)
 * 테스트 4 〉	통과 (314.11ms, 95.8MB)
 * 테스트 5 〉	통과 (354.21ms, 95.3MB)
 *
 * 채점 결과
 * 정확성: 50.0
 * 효율성: 50.0
 * 합계: 100.0 / 100.0
 */

import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!completion[i].equals(participant[i])) {
                answer = participant[i];
                break;
            }
        }

        return answer;
    }
}