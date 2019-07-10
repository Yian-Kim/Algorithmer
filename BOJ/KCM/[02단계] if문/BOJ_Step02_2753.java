/*

- 파일명 : BOJ_Step02_2753.java
- 작성자 : KCM
- 작성일자 : 2019.07.11.
- 문제 : BOJ 2단계 if문
        2753번 윤년 (https://www.acmicpc.net/problem/2753)
- 난이도 : ★☆☆☆☆
- 후기 : 문제에 주어진 조건대로 입력하면 풀 수 있는 문제입니다.
        
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int year = Integer.parseInt(scan.nextLine());

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
