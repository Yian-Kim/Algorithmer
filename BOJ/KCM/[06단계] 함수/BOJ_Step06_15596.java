/*

- 파일명 : BOJ_Step06_15596.java
- 작성자 : KCM
- 작성일자 : 2019.07.30.
- 문제 : BOJ 6단계 함수
        15596번 정수 N개의 합 (https://www.acmicpc.net/problem/15596)
- 난이도 : ★☆☆☆☆
- 후기 : 제출 버튼을 누르면 제출 형식이 미리 주어져있다.
        코딜리티를 미리 접해본 덕분인지 함수형 문제를 작성하는데 큰 어려움이 풀었다.
        
*/

public class Test {
	long sum(int[] a) {
		long ans = 0;

		for (int i = 0; i < a.length; i++) {
			ans += a[i];
		}

		return ans;
	}
}