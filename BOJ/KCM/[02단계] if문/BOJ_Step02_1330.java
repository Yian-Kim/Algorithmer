/*

- 파일명 : BOJ_Step02_1330.java
- 작성자 : KCM
- 작성일자 : 2019.07.10.
- 문제 : BOJ 2단계 if문
        1330번 두 수 비교하기 (https://www.acmicpc.net/problem/1330)
- 난이도 : ★☆☆☆☆
- 후기 : 입력하는 방법을 모르면 런타임 에러가 날 수 있는 문제
        
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		int A = Integer.parseInt(str.split(" ")[0]);
		int B = Integer.parseInt(str.split(" ")[1]);

		if (A > B) {
			System.out.println(">");
		} else if (A < B) {
			System.out.println("<");
		} else if (A == B) {
			System.out.println("==");
		}
	}
}