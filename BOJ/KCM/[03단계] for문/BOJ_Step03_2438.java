/*

- 파일명 : BOJ_Step03_2438.java
- 작성자 : KCM
- 작성일자 : 2019.04.14.
- 문제 : BOJ 3단계 for문
		2438번 별 찍기 - 1 (https://www.acmicpc.net/problem/2438)	
- 난이도 : ★☆☆☆☆
- 후기 : 별 찍는 문제 중 쉬운 문제입니다.
        
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}