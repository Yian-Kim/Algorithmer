/**
 * 프로그래머스 Level 2 Lesson 42586 기능개발
 * 코딩테스트 연습 > 코딩테스트 고득점 Kit > 스택/큐 > 기능개발
 * 문제 URL: https://programmers.co.kr/learn/courses/30/lessons/42586
 *
 */
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            double temp = (double) (100 - progresses[i]) / speeds[i];
            int day = (int) Math.ceil(temp);

            if (!queue.isEmpty() && queue.peek() < day) {
                answer[i] = queue.size();
                queue.clear();
            }

            queue.offer(day);
        }

        return answer;
    }
}