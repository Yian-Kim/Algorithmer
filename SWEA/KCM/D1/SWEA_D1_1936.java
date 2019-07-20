/*
 
- 파일명 : SWEA_D1_1936.java
- 작성자 : KCM
- 작성일자 : 2019.03.28.
- 문제 : D1 1936. 1대1 가위바위보 (https://bit.ly/2WB23wp)
- 난이도 : ★☆☆☆☆
- 후기 : 간단한 로직이라 혼자 힘으로 풀 수 있음!

*/

import java.util.Scanner;

class Solution {
	public static void main(String[] args) {

		// 값을 입력받기 위해 scanner 선언
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		int a = Integer.parseInt(input.substring(0, 1)); // 맨 앞 숫자만 문자열 분리
		int b = Integer.parseInt(input.substring(2, 3)); // 맨 뒷 숫자만 문자열 분리

		// 비기는 경우는 없으므로, A가 이기는 경우만 if 문 설정
		if (a == 1 && b == 3) { // A가 가위를 내고 B가 보를 낼 경우
			System.out.println("A");
		}
		else if (a == 2 && b == 1) { // A가 바위를 내고 B가 가위를 낼 경우
			System.out.println("A");
		}
		else if (a == 3 && b == 2) { // A가 보를 내고 B가 바위를 낼 경우
			System.out.println("A");
		}
		else { // B가 이길 시 출력문
			System.out.println("B");
		}
	}
}
