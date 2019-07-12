/*

- 파일명 : BOJ_Step03_8393.java
- 작성자 : KCM
- 작성일자 : 2019.04.22.
- 문제 : BOJ 3단계 for문
		8393번 구구단 (https://www.acmicpc.net/problem/8393)	
- 난이도 : ★☆☆☆☆
- 후기 : 매우 쉬운 문제입니다.
        
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 0;

		for (int i = 1; i <= N; i++) {
			sum += i;
		}
		System.out.print(sum);
	}
}