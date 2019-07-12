/*

- 파일명 : BOJ_Step03_10871.java
- 작성자 : KCM
- 작성일자 : 2019.04.25.
- 문제 : BOJ 3단계 for문
		10871번 X보다 작은 수 (https://www.acmicpc.net/problem/10871)	
- 난이도 : ★☆☆☆☆
- 후기 : for와 if를 같이 쓰는 문제입니다.
        
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		String arr[] = br.readLine().split(" ");

		int N = Integer.parseInt(str[0]);
		int X = Integer.parseInt(str[1]);

		for (int i = 0; i < N; i++) {
			if (Integer.parseInt(arr[i]) < X) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}