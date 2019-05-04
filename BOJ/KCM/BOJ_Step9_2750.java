/*

- 파일명 : BOJ_Step9_2750.java
- 작성자 : KCM
- 작성일자 : 2019.05.04.
- 문제 : BOJ 9단계 정렬해보기 
        2750번 수 정렬하기 (https://www.acmicpc.net/problem/2750)
- 난이도 : ★☆☆☆☆
- 후기 : 정렬 시 임시변수를 선언할지 임시배열을 선언할지 기억이 나지 않아 구글링함

*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); // 수의 개수 입력
		int[] arr = new int[N]; // 숫자를 저장하고 출력할 배열 선언

		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt(); // 입력한 숫자를 배열에 저장
		}

		for (int i = 0; i < N; i++) {
			int temp = 0; // 임시변수 선언

			for (int j = i + 1; j < N; j++) { // 오름차순 정렬
				if (arr[i] > arr[j]) { // 앞에 있는 숫자가 뒤에 있는 숫자보다 크면,
					temp = arr[i]; // 임시변수에 큰 숫자 저장
					arr[i] = arr[j]; // 앞에는 보다 작은 숫자로,
					arr[j] = temp; // 뒤에는 보다 큰 숫자로 자리바꿈 
				}
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.println(arr[i]); // 바뀐 배열 출력
		}

	}
}
