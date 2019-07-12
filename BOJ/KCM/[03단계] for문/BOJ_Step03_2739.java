/*

- 파일명 : BOJ_Step03_2739.java
- 작성자 : KCM
- 작성일자 : 2019.04.14.
- 문제 : BOJ 3단계 for문
		2739번 구구단 (https://www.acmicpc.net/problem/2739)	
- 난이도 : ★☆☆☆☆
- 후기 : 매우 쉬운 문제!
        
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}

	}
}