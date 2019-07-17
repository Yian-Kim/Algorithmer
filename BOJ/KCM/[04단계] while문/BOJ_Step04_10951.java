/*

- 파일명 : BOJ_Step04_10951.java
- 작성자 : KCM
- 작성일자 : 2019.07.17.
- 문제 : BOJ 4단계 while문
        10951번 A+B - 4 (https://www.acmicpc.net/problem/10951)
- 난이도 : ★★☆☆☆
- 후기 : EOF에 대한 개념이 필요한 문제!
        C와 C++에는 EOF가 있지만, Java에서는 Scanner 클래스의 hasNext를 사용해야함!
        예전에 비슷한 문제를 풀었으나 다시 한 번 헷갈려서 구글링 해봄.
        
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {

			int A = scan.nextInt();
			int B = scan.nextInt();
			System.out.println(A + B);
		}
	}
}