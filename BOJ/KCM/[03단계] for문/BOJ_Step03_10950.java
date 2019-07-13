/*

- 파일명 : BOJ_Step03_10950.java
- 작성자 : KCM
- 작성일자 : 2019.07.13.
- 문제 : BOJ 3단계 for문
        10950번 A+B - 3 (https://www.acmicpc.net/problem/10950)
- 난이도 : ★☆☆☆☆
- 후기 : 입력받는 문자열을 반복적으로 저장하는 방법만 알면 금방 푸는 문제입니다!
        
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.nextLine());
		int arr[] = new int[T];

		for (int i = 0; i < T; i++) {
			String str = scan.nextLine();
			int A = Integer.parseInt(str.split(" ")[0]);
			int B = Integer.parseInt(str.split(" ")[1]);
			arr[i] = A + B;
		}

		for (int i = 0; i < T; i++) {
			System.out.println(arr[i]);
		}
	}
}