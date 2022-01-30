/**
 * 프로그래머스 Level 2 Lesson 42578 위장
 * 코딩테스트 연습 > 코딩테스트 고득점 Kit > 해시 > 위장
 * 문제 URL: https://programmers.co.kr/learn/courses/30/lessons/42578
 *
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.06ms, 74.9MB)
 * 테스트 2 〉	통과 (0.04ms, 72.9MB)
 * 테스트 3 〉	통과 (0.08ms, 73.2MB)
 * 테스트 4 〉	통과 (0.07ms, 78.7MB)
 * 테스트 5 〉	통과 (0.04ms, 72.2MB)
 * 테스트 6 〉	통과 (0.06ms, 77.4MB)
 * 테스트 7 〉	통과 (0.09ms, 78.3MB)
 * 테스트 8 〉	통과 (0.08ms, 79.3MB)
 * 테스트 9 〉	통과 (0.03ms, 72.3MB)
 * 테스트 10 〉 통과 (0.03ms, 80.4MB)
 * 테스트 11 〉 통과 (0.05ms, 83.3MB)
 * 테스트 12 〉 통과 (0.07ms, 76.5MB)
 * 테스트 13 〉 통과 (0.10ms, 73.2MB)
 * 테스트 14 〉 통과 (0.05ms, 77.9MB)
 * 테스트 15 〉 통과 (0.04ms, 76.3MB)
 * 테스트 16 〉 통과 (0.03ms, 73.9MB)
 * 테스트 17 〉 통과 (0.07ms, 74.9MB)
 * 테스트 18 〉 통과 (0.06ms, 68.4MB)
 * 테스트 19 〉 통과 (0.03ms, 75.5MB)
 * 테스트 20 〉 통과 (0.04ms, 71.3MB)
 * 테스트 21 〉 통과 (0.05ms, 74.8MB)
 * 테스트 22 〉 통과 (0.05ms, 77.7MB)
 * 테스트 23 〉 통과 (0.04ms, 75.3MB)
 * 테스트 24 〉 통과 (0.05ms, 71.2MB)
 * 테스트 25 〉 통과 (0.05ms, 75.4MB)
 * 테스트 26 〉 통과 (0.07ms, 74.2MB)
 * 테스트 27 〉 통과 (0.04ms, 76.9MB)
 * 테스트 28 〉 통과 (0.07ms, 77.2MB)
 *
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */
import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }

        for (String keys : map.keySet()) {
            answer *= (map.get(keys) + 1);
        }

        answer -= 1;

        return answer;
    }
}