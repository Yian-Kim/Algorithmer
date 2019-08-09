/*

- 파일명 : BOJ_Step06_1065.java
- 작성자 : KCM
- 작성일자 : 2019.08.09.
- 문제 : BOJ 6단계 함수
        1065번 한수 (https://www.acmicpc.net/problem/1065)
- 난이도 : ★★★☆☆
- 후기 : 풀이를 보지 않고 푸느라 이 문제는 일 주일을 고민했다.
        짧은 지문의 문제였지만 문제를 이해하고 코드로 옮기는게 어려웠다.
        문제에 제시된 한수에 대한 개념을 이해한다면 쉽게 풀 수 있을 것이다.
        결국 코드를 보고 해결했으며, 다시 여러 번 풀어봐야하는 문제다.
        
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		if (N < 100) {
			System.out.println(N);
		} else {
			int result = 99;

			for (int i = 100; i <= N; i++) {
				result += isHanNumber(i);
			}

			if (N == 1000) {
				result--;
			}
			
			System.out.println(result);
		}
		
		br.close();
	}

	private static int isHanNumber(int N) {

		int num1 = N / 100 % 10;
		int num2 = N / 10 % 10;
		int num3 = N % 10;

		if (num2 * 2 == num1 + num3) {
			return 1;
		}
		
		return 0;
	}
}