/**
 * 프로그래머스 Level 2 Lesson 42584 주식가격
 * 코딩테스트 연습 > 코딩테스트 고득점 Kit > 스택/큐 > 주식가격
 * 문제 URL: https://programmers.co.kr/learn/courses/30/lessons/42584
 *
 * 정확성  테스트
 * 테스트 1 〉	통과 (19.73ms, 71.5MB)
 * 테스트 2 〉	통과 (14.32ms, 68.1MB)
 * 테스트 3 〉	통과 (20.21ms, 70MB)
 * 테스트 4 〉	통과 (17.53ms, 70MB)
 * 테스트 5 〉	통과 (12.22ms, 78.3MB)
 *
 * 채점 결과
 * 정확성: 66.7
 * 효율성: 33.3
 * 합계: 100.0 / 100.0
 */
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                answer[i]++;
                if (prices[i] > prices[j])
                    break;
            }
        }

        return answer;
    }
}