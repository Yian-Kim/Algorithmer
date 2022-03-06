/**
 * 프로그래머스 Level 2 Lesson 42583 다리를 지나는 트럭
 * 코딩테스트 연습 > 코딩테스트 고득점 Kit > 스택/큐 > 다리를 지나는 트럭
 * 문제 URL: https://programmers.co.kr/learn/courses/30/lessons/42583
 *
 * 정확성  테스트
 * 테스트 1 〉	통과 (1.06ms, 78.4MB)
 * 테스트 2 〉	통과 (5.78ms, 74.4MB)
 * 테스트 3 〉	통과 (0.14ms, 79.8MB)
 * 테스트 4 〉	통과 (7.52ms, 68.2MB)
 * 테스트 5 〉	통과 (30.85ms, 85.8MB)
 * 테스트 6 〉	통과 (13.55ms, 85.9MB)
 * 테스트 7 〉	통과 (1.11ms, 75.2MB)
 * 테스트 8 〉	통과 (0.45ms, 73.9MB)
 * 테스트 9 〉	통과 (3.88ms, 76.9MB)
 * 테스트 10 〉	통과 (0.83ms, 77.8MB)
 * 테스트 11 〉	통과 (0.13ms, 72.7MB)
 * 테스트 12 〉	통과 (0.83ms, 73.2MB)
 * 테스트 13 〉	통과 (1.20ms, 73.6MB)
 * 테스트 14 〉	통과 (0.18ms, 79.5MB)
 *
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */
import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
        int sum = 0;
        int time = 0;

        for (int i = 0; i < truck_weights.length; i++) { // 향상된 for문을 쓰는게 좋을 것
            int truck = truck_weights[i];

            while (true) {
                // 큐에 아무것도 없는 경우 = 어떠한 트럭도 다리위에 없음
                if (queue.isEmpty()) {
                    queue.add(truck);
                    sum += truck;
                    time++; // 다리에 오를 때만 시간 추가
                    break;
                } else if (queue.size() == bridge_length) { // 큐에 다리 길이만큼 트럭이 다 찬 경우
                    sum -= queue.poll();
                } else { // 다리 길이만큼 큐가 차지않았음
                    // weight 값을 넘지 않는 선에서 새로운 트럭을 다리에 올려줌
                    if (sum + truck <= weight) {
                        queue.add(truck);
                        sum += truck;
                        time++;
                        break;
                    } else {
                        // 넘는다면 0을 넣어 이미 큐에 있는 트럭이 다리를 건너게 만듬
                        queue.add(0);
                        time++;
                    }
                }
            }
        }

        // 마지막 트럭에서 반복문이 끝나는데, 마지막 역시 다리 길이만큼 지나가야하기에 + 다리 길이
        return time + bridge_length;
    }
}
