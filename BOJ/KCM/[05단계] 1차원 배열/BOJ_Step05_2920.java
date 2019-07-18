/*

- 파일명 : BOJ_Step05_2920.java
- 작성자 : KCM
- 작성일자 : 2019.04.20.
- 문제 : BOJ 5단계 1차원 배열
        2920번 음계 (https://www.acmicpc.net/problem/2920)
- 난이도 : ★☆☆☆☆
- 후기 : for문을 적절히 잘 사용하면 쉬운 문제입니다.
        else문에서 break를 해주지 않으면 원하는 결과가 나오지 않습니다!
        
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int[] arr = new int[8];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(temp[i]);
		}

		String str = "";

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1] - 1) {
				str = "ascending";
			} else if (arr[i] == arr[i + 1] + 1) {
				str = "descending";
			} else {
				str = "mixed";
				break;
			}
		}
		System.out.println(str);
	}
}