/*

- 파일명 : BOJ_Step06_10872.java
- 작성자 : KCM
- 작성일자 : 2019.07.30.
- 문제 : BOJ 6단계 함수
        10872번 팩토리얼 (https://www.acmicpc.net/problem/10872)
- 난이도 : ★☆☆☆☆
- 후기 : 팩토리얼을 한 번 출력하는 문제는 어렵지않다.
        이 문제는 bw.write()으로 출력해보기로 했는데, 출력값이 이상하게 나와서 찾아봄.
        그냥 bw.wirte()는 String값이 default인 모양이다. 
        String.valueOf()를 사용해서 int형 변수를 출력했다.
        
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());

		int result = factorial(N);
		bw.write(String.valueOf(result));

		br.close();
		bw.flush();
	}

	private static int factorial(int n) {
		int result = 1;

		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}