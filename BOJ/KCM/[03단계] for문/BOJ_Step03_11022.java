/*

- 파일명 : BOJ_Step03_11022.java
- 작성자 : KCM
- 작성일자 : 2019.07.13.
- 문제 : BOJ 3단계 for문
   11022번 A+B - 8 (https://www.acmicpc.net/problem/11022)
- 난이도 : ★☆☆☆☆
- 후기 : 이 소스코드는 반드시 한 줄씩 입력해야 원하는 출력을 얻을 수 있다.
   BOJ 사이트에 있는 입력값을 그대로 복사하면 마지막 배열이 출력되지 않지만,
   한 줄씩 입력하면 한 줄씩 올바르게 출력됨!
		        
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

			System.out.printf("Case #%d: %d + %d = %d\n", i + 1, A, B, arr[i]);
		}
	}
}