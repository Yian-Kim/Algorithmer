/**
 * 프로그래머스 Level 3 Lesson 42579 베스트앨범
 * 코딩테스트 연습 > 코딩테스트 고득점 Kit > 해시 > 베스트앨범
 * 문제 URL: https://programmers.co.kr/learn/courses/30/lessons/42579
 *
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.64ms, 83.8MB)
 * 테스트 2 〉	통과 (0.82ms, 78.5MB)
 * 테스트 3 〉	통과 (0.80ms, 81.8MB)
 * 테스트 4 〉	통과 (0.76ms, 86.7MB)
 * 테스트 5 〉	통과 (1.04ms, 75.5MB)
 * 테스트 6 〉	통과 (0.71ms, 72.1MB)
 * 테스트 7 〉	통과 (0.73ms, 75.6MB)
 * 테스트 8 〉	통과 (0.90ms, 76.4MB)
 * 테스트 9 〉	통과 (0.64ms, 77.4MB)
 * 테스트 10 〉 통과 (0.84ms, 73.4MB)
 * 테스트 11 〉 통과 (0.66ms, 76.2MB)
 * 테스트 12 〉 통과 (1.06ms, 82.6MB)
 * 테스트 13 〉 통과 (0.84ms, 79.8MB)
 * 테스트 14 〉 통과 (0.79ms, 76.9MB)
 * 테스트 15 〉 통과 (0.62ms, 73.7MB)
 *
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */
import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        // key값만 가져와서 genre에 넣어준다
        ArrayList<String> genre = new ArrayList<>();
        for (String key : map.keySet()) {
            genre.add(key);
        }
        Collections.sort(genre, (o1, o2) -> map.get(o2) - map.get(o1)); // key값에 해당하는 value를 내림차순으로 정렬한다.

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < genre.size(); i++) {
            String g = genre.get(i);

            // 해당 장르의 음악 중에서 play횟수가 가장 큰 인덱스를 찾는다
            int max = 0;
            int firstIdx = -1;
            for (int j = 0; j < genres.length; j++) {
                if (g.equals(genres[j]) && max < plays[j]) {
                    max = plays[j];
                    firstIdx = j;
                }
            }

            // 해당 장르의 음악 중에서 play횟수가 두번째로 큰 인덱스를 찾는다.
            max = 0;
            int secondIdx = -1;
            for (int j = 0; j < genres.length; j++) {
                if (g.equals(genres[j]) && max < plays[j] && j != firstIdx) {
                    max = plays[j];
                    secondIdx = j;
                }
            }

            list.add(firstIdx);
            if (secondIdx >= 0) list.add(secondIdx); // secondIdx는 존재 할수도, 안할수도 있다.
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}