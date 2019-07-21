/*

- 파일명 : BOJ_Step04_10952.java
- 작성자 : KCM
- 작성일자 : 2019.07.21.
- 문제 : BOJ 4단계 while문
        10952번 A+B - 5 (https://www.acmicpc.net/problem/10952)
- 난이도 : ★☆☆☆☆
- 후기 : Scanner 사용 후 close 함수를 처음 써보았다.
        이제까지는 메모리 용량이 많이 잡아먹지 않으므로 필요성을 못 느꼈지만,
        문제풀 때 Scanner를 사용하게 될 때 꼭 써줘야 할 듯 싶음!
        
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean isZeroInput = false;

		while (isZeroInput != true) {

			String str = sc.nextLine();
			int A = Integer.parseInt(str.split(" ")[0]);
			int B = Integer.parseInt(str.split(" ")[1]);

			if (A == 0 && B == 0) {
				isZeroInput = true;
			} else {
				System.out.println(A + B);
			}
		}

		sc.close();
	}
}