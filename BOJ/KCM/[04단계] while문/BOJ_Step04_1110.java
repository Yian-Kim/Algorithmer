/*

- 파일명 : BOJ_Step04_1110.java
- 작성자 : KCM
- 작성일자 : 2019.07.21.
- 문제 : BOJ 4단계 while문
        1110번 더하기 사이클 (https://www.acmicpc.net/problem/1110)
- 난이도 : ★☆☆☆☆
- 후기 : result 변수를 어떻게 돌게 할지와 count 변수의 위치 때문에 오류가 나올 뻔했지만 가뿐하게 통과한 코드!
        문제 설명이 어려울 뿐 간단한 연산이었는데, 좀더 신박한 방법이 있다면 보고 싶다.
        
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());

		Boolean isSameNumber = false;
		int count = 0, result = N;

		while (isSameNumber != true) {

			int A = result / 10;
			int B = result % 10;
			int C = (A + B) % 10;
			result = B * 10 + C;

			count++;

			if (N == result) {

				System.out.print(count);
				isSameNumber = true;

			}
		}
		sc.close();
	}
}