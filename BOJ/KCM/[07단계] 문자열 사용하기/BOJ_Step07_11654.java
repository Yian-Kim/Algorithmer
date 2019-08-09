/*

- 파일명 : BOJ_Step07_11654.java
- 작성자 : KCM
- 작성일자 : 2019.08.09.
- 문제 : BOJ 7단계 문자열
        11654번 셀프 넘버 (https://www.acmicpc.net/problem/11654)
- 난이도 : ★☆☆☆☆
- 후기 : 3개월 전에 풀었을 때는 아스키코드값으로 바꾸는게 헷갈렸는데,
        얼마 전에도 개념을 확실히 잡으니 헷갈리지 않고 풀 수 있었다.
		그때는 Scanner를 사용해서 char로 입력받았는데, 
		이번에는 BufferedReader를 사용하여 String으로 입력받았다.
        
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String ch = br.readLine();
		int asciiCodeValue = ch.charAt(0);
		System.out.println(asciiCodeValue);
		
		br.close();
	}
}
