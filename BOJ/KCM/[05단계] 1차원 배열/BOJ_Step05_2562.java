/*

- 파일명 : BOJ_Step05_2562.java
- 작성자 : KCM
- 작성일자 : 2019.07.23.
- 문제 : BOJ 5단계 1차원 배열
        2562번 최댓값 (https://www.acmicpc.net/problem/2562)
- 난이도 : ★☆☆☆☆
- 후기 : 문제 자체는 어렵지 않으나, 오랜만에 BufferedReader를 사용하니 헷갈렸음.
        StringTokenizer를 사용해서 푸는 방법은 잘 모르겠음.
        지금은 빠르게 단계별로 풀어보기를 한 바퀴 돌리는 것이 목적이므로, 추후 사용해볼 예정.
        
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[9];
		int max = 0, count = 0;

		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());

			if (max < arr[i]) {
				max = arr[i];
				count = i + 1;
			}
		}
		System.out.printf("%d\n%d", max, count);
		br.close();
	}
}