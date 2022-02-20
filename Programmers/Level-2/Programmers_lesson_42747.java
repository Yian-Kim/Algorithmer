/**
 * 프로그래머스 Level 2 Lesson 42747 H-Index
 * 코딩테스트 연습 > 코딩테스트 고득점 Kit > 정렬 > H-Index
 * 문제 URL: https://programmers.co.kr/learn/courses/30/lessons/42747
 *
 * 정확성 테스트
 * 테스트 1 〉	통과 (0.47ms, 71.7MB)
 * 테스트 2 〉	통과 (0.58ms, 77.1MB)
 * 테스트 3 〉	통과 (0.60ms, 83.2MB)
 * 테스트 4 〉	통과 (0.56ms, 77.4MB)
 * 테스트 5 〉	통과 (0.66ms, 75.4MB)
 * 테스트 6 〉	통과 (0.62ms, 80.7MB)
 * 테스트 7 〉	통과 (0.53ms, 74.1MB)
 * 테스트 8 〉	통과 (0.35ms, 72.9MB)
 * 테스트 9 〉	통과 (0.40ms, 75.4MB)
 * 테스트 10 〉 통과 (0.74ms, 75.7MB)
 * 테스트 11 〉 통과 (0.60ms, 77.3MB)
 * 테스트 12 〉 통과 (0.37ms, 75.1MB)
 * 테스트 13 〉 통과 (0.62ms, 76.2MB)
 * 테스트 14 〉 통과 (0.68ms, 79.3MB)
 * 테스트 15 〉 통과 (0.62ms, 77.3MB)
 * 테스트 16 〉 통과 (0.37ms, 72.7MB)
 *
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */
import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length;

        Arrays.sort(citations);

        for (int i = 0; i < n; i++) {
            int h = n-i;

            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }

        return answer;
    }
}