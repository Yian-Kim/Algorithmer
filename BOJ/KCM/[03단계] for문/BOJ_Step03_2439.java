/*

- 파일명 : BOJ_Step03_2439.java
- 작성자 : KCM
- 작성일자 : 2019.04.14.
- 문제 : BOJ 3단계 for문
		2439번 별 찍기 - 2 (https://www.acmicpc.net/problem/2439)	
- 난이도 : ★☆☆☆☆
- 후기 : 2438번과 반대로 별 찍는 문제입니다.
        
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {
			for (int j = num - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}