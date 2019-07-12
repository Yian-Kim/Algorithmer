/*

- 파일명 : BOJ_Step03_2742.java
- 작성자 : KCM
- 작성일자 : 2019.04.14.
- 문제 : BOJ 3단계 for문
		2742번 기찍 N (https://www.acmicpc.net/problem/2742)	
- 난이도 : ★☆☆☆☆
- 후기 : 매우 쉬운 문제입니다.
        
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		for (int i = num; i > 0; i--) {
			System.out.println(i);
		}
	}
}