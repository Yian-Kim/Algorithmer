/*

- 파일명 : BOJ_Step07_10809.java
- 작성자 : KCM
- 작성일자 : 2019.08.09.
- 문제 : BOJ 7단계 문자열
        10809번 알파벳 찾기 (https://www.acmicpc.net/problem/10809)
- 난이도 : ★☆☆☆☆
- 후기 : indexOf 함수를 까먹었다니, 소름돋고 괴로워······.
        직접 구현하려다가 예전에 배운 자료를 보니 매 단원마다 배웠고······.
        여기서 indexOf 함수는 해당 문자가 있으면 위치값, 없으면 -1을 반환한다.
        indexOf 함수를 응용하는 방법에 대해 숙지해야될 것 같다.
        
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		for (int i = 'a'; i <= 'z'; i++) {
			System.out.print(str.indexOf(i) + " ");
		}

		br.close();
	}
}