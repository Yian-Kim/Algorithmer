/**
 * 프로그래머스 Level 2 Lesson 42626 더 맵게
 * 코딩테스트 연습 > 코딩테스트 고득점 Kit > 힙(Heap) > 더 맵게
 * 문제 URL: https://programmers.co.kr/learn/courses/30/lessons/42626
 *
 * 정확성 테스트
 * 테스트 1 〉	통과 (0.50ms, 75MB)
 * 테스트 2 〉	통과 (0.28ms, 75.4MB)
 * 테스트 3 〉	통과 (0.47ms, 73.3MB)
 * 테스트 4 〉	통과 (0.32ms, 76.1MB)
 * 테스트 5 〉	통과 (0.46ms, 69.2MB)
 * 테스트 6 〉	통과 (2.79ms, 68.1MB)
 * 테스트 7 〉	통과 (2.59ms, 80.3MB)
 * 테스트 8 〉	통과 (0.81ms, 77.2MB)
 * 테스트 9 〉	통과 (0.96ms, 73MB)
 * 테스트 10 〉	통과 (1.96ms, 82.7MB)
 * 테스트 11 〉	통과 (1.81ms, 65.9MB)
 * 테스트 12 〉	통과 (3.41ms, 86.4MB)
 * 테스트 13 〉	통과 (2.02ms, 77MB)
 * 테스트 14 〉	통과 (0.38ms, 72.5MB)
 * 테스트 15 〉	통과 (2.82ms, 75.8MB)
 * 테스트 16 〉	통과 (0.43ms, 79.7MB)
 *
 * 효율성 테스트
 * 테스트 1 〉	통과 (234.79ms, 70.5MB)
 * 테스트 2 〉	통과 (258.95ms, 86.9MB)
 * 테스트 3 〉	통과 (2021.09ms, 122MB)
 * 테스트 4 〉	통과 (120.77ms, 63.6MB)
 * 테스트 5 〉	통과 (1803.74ms, 127MB)
 *
 * 채점 결과
 * 정확성: 76.2
 * 효율성: 23.8
 * 합계: 100.0 / 100.0
 */
import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        // 최대 값이 우선순위인 큐 = 최대 힙, 최소 값이 우선순위인 큐 = 최소 힙

        // 자동 오름차순 정렬
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            minHeap.add(scoville[i]);
        }

        while (minHeap.peek() < K) {
            // 제일 낮은 값, 제일 낮은 값 + 1 빼기
            int min1 = minHeap.poll();
            int min2 = minHeap.poll();

            // 힙에 넣기
            minHeap.add(min1 + min2 * 2);
            answer++;

            // 제일 낮은 값이 K 이상이면 끝
            if (minHeap.peek() >= K) {
                break;
            }

            // 마지막 수가 K보다 작을 때
            if (minHeap.peek() < K && minHeap.size() == 1) {
                answer = -1;
                break;
            }
        }

        return answer;
    }
}