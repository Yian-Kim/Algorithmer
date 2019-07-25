/*

- 파일명 : BOJ_Step05_1546.java
- 작성자 : KCM
- 작성일자 : 2019.07.25.
- 문제 : BOJ 5단계 1차원 배열
        1546번 평균 (https://www.acmicpc.net/problem/1546)
- 난이도 : ★☆☆☆☆
- 후기 : 예전에 한 번 풀었던 문제인데 기억이 나지 않아 한 번 더 풀어봤다.
        sum을 계산하는 과정에서 한 번 틀렸음.      
        
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int M = 0;
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(str[i]);

			if (arr[i] > M) {
				M = arr[i];
			}
		}

		double sum = 0;

		for (int i = 0; i < N; i++) {
			sum += 100.0 * arr[i] / M;
		}
		System.out.printf("%.6f", sum / N);
	}
}