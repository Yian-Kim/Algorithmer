/*

- 파일명 : BOJ_Step07_11720.java
- 작성자 : KCM
- 작성일자 : 2019.08.09.
- 문제 : BOJ 7단계 문자열
        11720번 숫자의 합 (https://www.acmicpc.net/problem/11720)
- 난이도 : ★☆☆☆☆
- 후기 : 3개월 전에는 substring으로 풀었는데, 이번에는 split으로 풀었다.
        이제 입력받는 방법에 대해서는 어려운 점이 없어서 매우 쉬웠다.
        
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int sum = 0;

		for (int i = 0; i < N; i++) {

			int num = Integer.parseInt(str.split("")[i]);
			sum += num;
		}

		System.out.println(sum);

		br.close();
	}
}