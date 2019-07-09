/*

- 파일명 : BOJ_Step01_2588.java
- 작성자 : KCM
- 작성일자 : 2019.07.09.
- 문제 : BOJ 1단계 입출력과 사칙연산 
        2588번 곱셈 (https://www.acmicpc.net/problem/2588)
- 난이도 : ★☆☆☆☆
- 후기 : 굉장히 쉬운 문제!

*/

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		String number1 = scan.nextLine();
		String number2 = scan.nextLine();
		
		int three_digit = Integer.parseInt(number1);
    
		// 각 자리대로 나눠서 출력해줘야 하므로, 문자열 분리시킴
		int hundreds_place = Integer.parseInt(number2.split("")[0]);
		int decimal_place = Integer.parseInt(number2.split("")[1]);
		int one_place = Integer.parseInt(number2.split("")[2]);

		System.out.println(three_digit * one_place);
		System.out.println(three_digit * decimal_place);
		System.out.println(three_digit * hundreds_place);
		System.out.println(three_digit * Integer.parseInt(number2));
	}
}
