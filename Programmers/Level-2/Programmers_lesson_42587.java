/**
 * 프로그래머스 Level 2 Lesson 42587 프린터
 * 코딩테스트 연습 > 코딩테스트 고득점 Kit > 스택/큐 > 기능개발
 * 문제 URL: https://programmers.co.kr/learn/courses/30/lessons/42587
 *
 * 테스트 1 〉 통과 (0.76ms, 74MB)
 * 테스트 2 〉 통과 (1.25ms, 74.8MB)
 * 테스트 3 〉 통과 (1.22ms, 77.7MB)
 * 테스트 4 〉 통과 (0.43ms, 72.2MB)
 * 테스트 5 〉 통과 (0.52ms, 80.2MB)
 * 테스트 6 〉 통과 (0.47ms, 73.3MB)
 * 테스트 7 〉 통과 (0.59ms, 80.6MB)
 * 테스트 8 〉 통과 (1.28ms, 78.6MB)
 * 테스트 9 〉 통과 (0.42ms, 75.9MB)
 * 테스트 10 〉 통과 (0.69ms, 75.8MB)
 * 테스트 11 〉 통과 (0.88ms, 82.1MB)
 * 테스트 12 〉 통과 (0.65ms, 73.5MB)
 * 테스트 13 〉 통과 (1.07ms, 76.7MB)
 * 테스트 14 〉 통과 (0.35ms, 79.3MB)
 * 테스트 15 〉 통과 (0.43ms, 73.5MB)
 * 테스트 16 〉 통과 (0.43ms, 73.8MB)
 * 테스트 17 〉 통과 (1.16ms, 76MB)
 * 테스트 18 〉 통과 (0.58ms, 76.4MB)
 * 테스트 19 〉 통과 (0.87ms, 75.6MB)
 * 테스트 20 〉 통과 (0.61ms, 79.9MB)
 *
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */

import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for (int i = 0; i < priorities.length; i++) {
            pq.add(priorities[i]);
        }

        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == pq.peek()) {
                    if (i == location) {
                        answer++;
                        return answer;
                    }

                    pq.poll();
                    answer++;
                }
            }
        }
        return -1;
    }
}