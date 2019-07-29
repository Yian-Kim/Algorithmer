/*

- 파일명 : BOJ_Step05_3052.java
- 작성자 : KCM
- 작성일자 : 2019.07.29.
- 문제 : BOJ 5단계 1차원 배열
        3052번 나머지 (https://www.acmicpc.net/problem/3052)
- 난이도 : ★★☆☆☆
- 후기 : 결론부터 말하자면, 생각보다 쉬운 문제였다.
        이틀동안 꼬박 고민했던 점은 '서로 다른 값이 몇 개 있는지'를 계산하는 방법이었다.
        Arrays.sort(배열명)를 사용하여 현재의 값과 다음 값을 비교하면 되는 거였는데,
        고민 끝에 서칭해보고 정답을 쓱 본 후에 바로 맞췄다. 
        다음에 같은 문제를 만난다면 풀 수 있을 것 같다.
        
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[10];
		int num = 0, count = 1;

		for (int i = 0; i < 10; i++) {
			num = Integer.parseInt(br.readLine());
			arr[i] = num % 42;
		}

		Arrays.sort(arr);

		for (int i = 0; i < 9; i++) {

			if (arr[i] != arr[i + 1]) {
				count++;
			}
		}

		System.out.println(count);
		br.close();
	}
}