
/*

- 파일명 : BOJ_Step14_2747.java
- 작성자 : KCM
- 작성일자 : 2019.06.22.
- 문제 : BOJ 14단계 피보나치 수
        2747번 피보나치 수 (https://www.acmicpc.net/problem/2747)
- 난이도 : ★☆☆☆☆
- 후기 : 손코딩 후 이클립스를 통해 코드를 돌려보았다.
        처음에 재귀함수로 풀었으나 시간초과로 인식되어
        반복문으로 다시 풀었다. 코드는 아래 첨부한다.
        
*/

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());

		// 방법1) 반복문으로 푸는 방법
		int result = fibonacci(n);

		// 방법2) 재귀함수로 푸는 방법
		// int result = fibonacciR(n);

		System.out.println(result);
	}

	// 방법1) 반복문으로 푸는 방법
	private static int fibonacci(int n) {

		int arr[] = new int[n + 1];

		arr[0] = 0;
		arr[1] = 1;

		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}

		return arr[n];

	}

	// 방법2) 재귀함수로 푸는 방법
	public static int fibonacciR(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fibonacciR(n - 1) + fibonacciR(n - 2);
	}

}