/*

- 파일명 : BOJ_Step07_11654.java
- 작성자 : KCM
- 작성일자 : 2019.05.01.
- 문제 : 11654번 아스키코드 (https://www.acmicpc.net/problem/11654)
- 난이도 : ★☆☆☆☆
- 후기 : 쉬운 편에 속했으나 charAt 함수가 생각나지 않아 구글링함

*/

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		char alpha = scan.nextLine().charAt(0); // 알파벳 입력
		System.out.println((int)alpha); // 알파벳 int형 변환 후 출력
	}
}
