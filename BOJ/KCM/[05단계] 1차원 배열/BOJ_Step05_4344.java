/*

- 파일명 : BOJ_Step05_4344.java
- 작성자 : KCM
- 작성일자 : 2019.07.30.
- 문제 : BOJ 5단계 1차원 배열
        4344번 평균은 넘겠지 (https://www.acmicpc.net/problem/4344)
- 난이도 : ★☆☆☆☆
- 후기 : 생각보다 어려워서 원하는 결과가 나오지 않아서 5일을 고민한 문제였다.
        시간초과, 런타임 에러, 출력 형식이 잘못되었습니다 등 다양하게 틀리고 나서야
        BOJ에서 질문을 검색해보았다. 나와 비슷한 flow로 작성한 코드를 보며 고쳤는데
        어디가 틀려서 내 코드는 원하는 결과가 나오지 않았는지 아직도 파악하지 못했다.
        오류 메시지는 다음과 같으며, BOJ에 제출기록이 남아있으므로 추후 다시 찾아볼 예정이다.

        Error Message :
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5 at Main.main(Main.java:20)
        
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
		int C = Integer.parseInt(br.readLine());

		for (int i = 0; i < C; i++) {
			String[] str = br.readLine().split(" ");
			int N = Integer.parseInt(str[0]);

			int arr[] = new int[N];
			double sum = 0;

			for (int j = 1; j <= N; j++) {
				arr[j - 1] = Integer.parseInt(str[j]);
				sum += arr[j - 1];
			}

			double avg = sum / (double) N;
			int count = 0;

			for (int j = 0; j < N; j++) {
				if (arr[j] > avg) {
					count++;
				}
			}

			double result = (double) count / (double) N * 100;
			String result2 = String.format("%.3f", result);
			bw.write(result2 + "%\n");
		}
		br.close();
		bw.flush();
	}
}