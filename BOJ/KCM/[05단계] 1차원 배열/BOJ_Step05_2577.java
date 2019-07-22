/*

- 파일명 : BOJ_Step05_2577.java
- 작성자 : KCM
- 작성일자 : 2019.07.23.
- 문제 : BOJ 5단계 1차원 배열
        2577번 숫자의 개수 (https://www.acmicpc.net/problem/2562)
- 난이도 : ★★★☆☆
- 후기 : 예전에 한 번 풀어본 적 있는 문제였는데 각 자리의 숫자를 어떻게 연산을 해야할지가 어려운 문제였다.
        예전 코드를 보고 금방 이해했다. 사고의 폭을 넓혀야 할 필요가 있다고 사료된다.
        향상된 for문(for each) 사용하는 방법이 항상 헷갈렸는데, 이번 기회에 확실히 알게 되었다.
        
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());

		int number = A * B * C;
		int arr[] = new int[10];

		while (number > 0) {
			arr[number % 10]++;
			number /= 10;
		}

		for (int count : arr) {
			System.out.println(count);
		}
		br.close();
	}
}