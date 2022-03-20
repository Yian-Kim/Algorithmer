/**
 * 프로그래머스 Level 3 Lesson 42862 체육복
 * 코딩테스트 연습 > 코딩테스트 고득점 Kit > 탐욕법(Greedy) > 체육복
 * 문제 URL: https://programmers.co.kr/learn/courses/30/lessons/42862
 *
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.46ms, 74.8MB)
 * 테스트 2 〉	통과 (0.36ms, 76.2MB)
 * 테스트 3 〉	통과 (0.40ms, 70.4MB)
 * 테스트 4 〉	통과 (0.51ms, 77.6MB)
 * 테스트 5 〉	통과 (0.34ms, 72.5MB)
 * 테스트 6 〉	통과 (0.56ms, 76.3MB)
 * 테스트 7 〉	통과 (0.40ms, 79.4MB)
 * 테스트 8 〉	통과 (0.39ms, 72MB)
 * 테스트 9 〉	통과 (0.45ms, 75.6MB)
 * 테스트 10 〉	통과 (0.54ms, 78.7MB)
 * 테스트 11 〉	통과 (0.34ms, 79.8MB)
 * 테스트 12 〉	통과 (0.37ms, 75.2MB)
 * 테스트 13 〉	통과 (0.45ms, 75.7MB)
 * 테스트 14 〉	통과 (0.33ms, 75.5MB)
 * 테스트 15 〉	통과 (0.40ms, 79.8MB)
 * 테스트 16 〉	통과 (0.37ms, 77.4MB)
 * 테스트 17 〉	통과 (0.36ms, 70.2MB)
 * 테스트 18 〉	통과 (0.38ms, 71.7MB)
 * 테스트 19 〉	통과 (0.36ms, 75.8MB)
 * 테스트 20 〉	통과 (0.49ms, 79.2MB)
 *
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */
import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여벌 체육복을 가져온 학생이 도난당한 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        // 도난당한 학생에게 체육복 빌려주는 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}