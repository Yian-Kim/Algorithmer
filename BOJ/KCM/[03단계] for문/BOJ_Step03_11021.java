/*

- 파일명 : BOJ_Step03_11021.java
- 작성자 : KCM
- 작성일자 : 2019.07.13.
- 문제 : BOJ 3단계 for문
        11021번 A+B - 7 (https://www.acmicpc.net/problem/11021)
- 난이도 : ★☆☆☆☆
- 후기 : A와 B를 형변환시킬 때 입력도 동시에 해보려고 했으나 런타임 에러가 생김. 
		그 외에는 어려울 것이 없는 문제!
        
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
			System.out.printf("Case #%d: %d\n", i + 1, arr[i]);
		}
	}
}