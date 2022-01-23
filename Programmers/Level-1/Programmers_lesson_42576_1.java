/**
 * 프로그래머스 Level 1 Lesson 42576 완주하지 못한 선수
 * 코딩테스트 연습 > 코딩테스트 고득점 Kit > 해시 > 완주하지 못한 선수
 * 문제 URL: https://programmers.co.kr/learn/courses/30/lessons/42576
 *
 * 정확성 테스트
 * 테스트 1 〉 통과 (0.05ms, 72.2MB)
 * 테스트 2 〉 통과 (0.07ms, 78.2MB)
 * 테스트 3 〉 통과 (0.46ms, 78.3MB)
 * 테스트 4 〉 통과 (0.68ms, 74.3MB)
 * 테스트 5 〉 통과 (0.60ms, 79.4MB)
 *
 * 효율성 테스트
 * 테스트 1 〉 통과 (41.69ms, 81.3MB)
 * 테스트 2 〉 통과 (87.51ms, 89.2MB)
 * 테스트 3 〉 통과 (73.30ms, 94.9MB)
 * 테스트 4 〉 통과 (89.37ms, 112MB)
 * 테스트 5 〉 통과 (75.69ms, 95MB)
 *
 * 채점 결과
 * 정확성: 50.0
 * 효율성: 50.0
 * 합계: 100.0 / 100.0
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for (String key : participant) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (String key : completion) {
            map.put(key, map.get(key) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
                break;
            }
        }

        return answer;
    }
}