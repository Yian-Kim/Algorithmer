/**
 * 프로그래머스 Level 2 Lesson 42860 조이스틱
 * 코딩테스트 연습 > 코딩테스트 고득점 Kit > 탐욕법(Greedy) > 조이스틱
 * 문제 URL: https://programmers.co.kr/learn/courses/30/lessons/42860
 *
 * 정확성 테스트
 * 테스트 1 〉	통과 (0.05ms, 79.9MB)
 * 테스트 2 〉	통과 (0.05ms, 74.9MB)
 * 테스트 3 〉	통과 (0.04ms, 75MB)
 * 테스트 4 〉	통과 (0.04ms, 77.6MB)
 * 테스트 5 〉	통과 (0.04ms, 73MB)
 * 테스트 6 〉	통과 (0.04ms, 74.3MB)
 * 테스트 7 〉	통과 (0.03ms, 74.1MB)
 * 테스트 8 〉	통과 (0.05ms, 83.3MB)
 * 테스트 9 〉	통과 (0.03ms, 72MB)
 * 테스트 10 〉	통과 (0.06ms, 73.3MB)
 * 테스트 11 〉	통과 (0.03ms, 74.6MB)
 * 테스트 12 〉	통과 (0.03ms, 76MB)
 * 테스트 13 〉	통과 (0.03ms, 73MB)
 * 테스트 14 〉	통과 (0.03ms, 73.2MB)
 * 테스트 15 〉	통과 (0.03ms, 74.9MB)
 * 테스트 16 〉	통과 (0.02ms, 76.9MB)
 * 테스트 17 〉	통과 (0.03ms, 70.6MB)
 * 테스트 18 〉	통과 (0.04ms, 77.3MB)
 * 테스트 19 〉	통과 (0.02ms, 76.1MB)
 * 테스트 20 〉	통과 (0.04ms, 76.2MB)
 * 테스트 21 〉	통과 (0.04ms, 73.5MB)
 * 테스트 22 〉	통과 (0.03ms, 71.6MB)
 * 테스트 23 〉	통과 (0.03ms, 73.5MB)
 * 테스트 24 〉	통과 (0.04ms, 69.1MB)
 * 테스트 25 〉	통과 (0.08ms, 73.5MB)
 * 테스트 26 〉	통과 (0.03ms, 77MB)
 * 테스트 27 〉	통과 (0.05ms, 83.3MB)
 *
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */
class Solution {
    public int solution(String name) {
        int answer = 0;
        int length = name.length();

        int index; // 다음 값들을 확인할 때 사용
        int move = length - 1; // 좌우 움직임 수를 체크

        for (int i = 0; i < name.length(); i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            index = i + 1;
            // 연속되는 A 갯수 확인
            while (index < length && name.charAt(index) == 'A') {
                index++;
            }

            // 순서대로 가는 것과, 뒤로 돌아가는 것 중 이동수가 적은 것을 선택
            move = Math.min(move, i * 2 + length - index);

            // 2022년 이전 테스트 케이스만 확인하면 여기까지해도 정답처리가 되기 때문에, 이전 정답들에는 여기까지만 정리되어 있지만,
            // BBBBAAAAAAAB 와 같이, 처음부터 뒷부분을 먼저 입력하는 것이 더 빠른 경우까지 고려하려면 아래의 코드가 필요합니다.
            move = Math.min(move, (length - index) * 2 + i);
        }
        return answer + move;
    }
}