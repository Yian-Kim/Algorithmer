/**
 * 프로그래머스 Level 3 Lesson 42628 이중우선순위큐
 * 코딩테스트 연습 > 코딩테스트 고득점 Kit > 힙(Heap) > 이중우선순위큐
 * 문제 URL: https://programmers.co.kr/learn/courses/30/lessons/42628
 *
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.54ms, 66.8MB)
 * 테스트 2 〉	통과 (0.70ms, 75.9MB)
 * 테스트 3 〉	통과 (0.74ms, 85.9MB)
 * 테스트 4 〉	통과 (0.70ms, 65.9MB)
 * 테스트 5 〉	통과 (0.69ms, 74.1MB)
 * 테스트 6 〉	통과 (0.62ms, 79.7MB)
 *
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution_42628 {
    public static void main(String[] args) {
        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        solution(operations);
    }

    public static int[] solution(String[] operations) {
        int[] answer = new int[2];
        //최소 힙, 최대 힙
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());

        for (String op : operations) {
            StringTokenizer st = new StringTokenizer(op);
            String judge = st.nextToken();
            int value = Integer.parseInt(st.nextToken());

            //빈 큐에 데이터를 삭제 요청 경우 연산 무시
            if (pq.size() < 1 && judge.equals("D"))
                continue;

            //삽입 시 최소 힙, 최대 힙에 value 넣기
            if (judge.equals("I")) {
                pq.offer(value);
                maxPq.offer(value);
                continue;
            }

            //나머지 경우는 D이면서 value값이 1인지 -1인지 이므로
            //0보다 작은 경우 최소 힙에서 poll후 최대힙에서 해당 원소 삭제
            if(value < 0) {
                int min = pq.poll();
                maxPq.remove(min);
                continue;
            }

            //최대 힙에서 poll후 최소힙에서 해당 원소 삭제
            int max = maxPq.poll();
            pq.remove(max);
        }
        if(pq.size() > 0 ) {
            answer[0] = maxPq.poll();
            answer[1] = pq.poll();
        }
        return answer;
    }
}