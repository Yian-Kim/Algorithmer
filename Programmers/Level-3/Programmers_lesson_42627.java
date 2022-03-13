/**
 * 프로그래머스 Level 3 Lesson 42627 디스크 컨트롤러
 * 코딩테스트 연습 > 코딩테스트 고득점 Kit > 힙(Heap) > 디스크 컨트롤러
 * 문제 URL: https://programmers.co.kr/learn/courses/30/lessons/42627
 *
 * 정확성 테스트
 * 테스트 1 〉	통과 (2.32ms, 71.1MB)
 * 테스트 2 〉	통과 (2.38ms, 79MB)
 * 테스트 3 〉	통과 (2.55ms, 72.5MB)
 * 테스트 4 〉	통과 (2.26ms, 72MB)
 * 테스트 5 〉	통과 (2.39ms, 76.3MB)
 * 테스트 6 〉	통과 (0.99ms, 75.1MB)
 * 테스트 7 〉	통과 (2.78ms, 71.3MB)
 * 테스트 8 〉	통과 (2.97ms, 69.8MB)
 * 테스트 9 〉	통과 (1.35ms, 71.6MB)
 * 테스트 10 〉	통과 (2.56ms, 78.1MB)
 * 테스트 11 〉	통과 (1.05ms, 72.5MB)
 * 테스트 12 〉	통과 (1.10ms, 72.6MB)
 * 테스트 13 〉	통과 (1.33ms, 76.9MB)
 * 테스트 14 〉	통과 (1.47ms, 74.8MB)
 * 테스트 15 〉	통과 (1.41ms, 70.8MB)
 * 테스트 16 〉	통과 (1.58ms, 77.2MB)
 * 테스트 17 〉	통과 (1.32ms, 76.3MB)
 * 테스트 18 〉	통과 (1.04ms, 73.2MB)
 * 테스트 19 〉	통과 (1.38ms, 73.6MB)
 * 테스트 20 〉	통과 (0.96ms, 76.9MB)
 *
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */
import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int count = 0; // 처리된 디스크
        int now = 0; // 작업이 끝난시간

        Arrays.sort(jobs, ((o1, o2) -> o1[0] - o2[0]));

        PriorityQueue<int[]> queue = new PriorityQueue<>(((o1, o2) -> o1[1] - o2[1]));
        int i = 0;
        while (count < jobs.length) {
            while (i < jobs.length && jobs[i][0] <= now) {
                queue.add(jobs[i++]);
            }

            if (queue.isEmpty()) {
                now = jobs[i][0];
            } else {
                int[] tmp = queue.poll();
                answer += tmp[1] + now - tmp[0];
                now += tmp[1];
                count++;
            }
        }

        return answer / jobs.length;
    }
}