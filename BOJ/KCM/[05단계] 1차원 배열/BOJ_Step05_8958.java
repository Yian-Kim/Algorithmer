/*

- 파일명 : BOJ_Step05_8958.java
- 작성자 : KCM
- 작성일자 : 2019.07.29.
- 문제 : BOJ 5단계 1차원 배열
        8958번 OX퀴즈 (https://www.acmicpc.net/problem/8958)
- 난이도 : ★☆☆☆☆
- 후기 : 이 문제도 이틀동안 꼬박 고민했던 문제였다.
        처음에는 이중 for문을 사용하면 시간초과가 날까봐 while문을 사용했는데,
        for문의 변수를 잘못 다뤄서 계속 55, 105 이런 식으로 결과값이 나왔다.
        어디가 틀렸는지 20분 정도 고민했다. 그러나 이 문제는 잘 생각해보면 쉬운 문제다!
        참고로 문자열(String)을 문자(Char)로 바꾸는 방법을 몰랐는데,
        str.charAt(0)을 잊어버리기 쉬우니 이번 기회에 꼭 기억해둬야겠다.
        
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int result[] = new int[T];

		for (int i = 0; i < T; i++) {
			String str = br.readLine();
			String arr[] = str.split("");
			int count = 0, sum = 0;

			for (int j = 0; j < arr.length; j++) {

				char ch = arr[j].charAt(0);

				if (ch == 'O') {
					count++;
					sum += count;
				}

				if (ch == 'X') {
					count = 0;
				}
			}
			result[i] = sum;
		}

		for (int i = 0; i < T; i++) {
			System.out.println(result[i]);
		}
		br.close();
	}
}