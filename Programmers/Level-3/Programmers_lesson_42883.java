/**
 * 프로그래머스 Level 2 Lesson 42883 큰 수 만들기
 * 코딩테스트 연습 > 코딩테스트 고득점 Kit > 탐욕법(Greedy) > 큰 수 만들기
 * 문제 URL: https://programmers.co.kr/learn/courses/30/lessons/42883
 *
 * 정확성 테스트
 * 테스트 1 〉	통과 (0.03ms, 75.3MB)
 * 테스트 2 〉	통과 (0.03ms, 75.9MB)
 * 테스트 3 〉	통과 (0.04ms, 74.8MB)
 * 테스트 4 〉	통과 (0.15ms, 72.4MB)
 * 테스트 5 〉	통과 (0.57ms, 76.6MB)
 * 테스트 6 〉	통과 (14.11ms, 79MB)
 * 테스트 7 〉	통과 (49.87ms, 91.2MB)
 * 테스트 8 〉	통과 (139.57ms, 76.3MB)
 * 테스트 9 〉	통과 (21.53ms, 82.4MB)
 * 테스트 10 〉	통과 (4979.80ms, 82.6MB)
 * 테스트 11 〉	통과 (0.05ms, 77.5MB)
 * 테스트 12 〉	통과 (0.02ms, 75.6MB)
 *
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */
class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();

        int cnt = number.length() - k;
        int left = 0;
        int right = number.length() - cnt;
        int max = -1;
        int idx = 0;

        while (cnt > 0) {
            max = -1;
            for (int j = left; j <= right; ++j) {
                int num = number.charAt(j) - '0';
                if (num > max) {
                    idx = j;
                    max = num;
                }
            }
            sb.append(number.charAt(idx));
            left = idx + 1;
            right = number.length() - --cnt;
        }

        return sb.toString();
    }
}