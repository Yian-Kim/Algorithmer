/*

- 파일명 : BOJ_Step05_10818.java
- 작성자 : KCM
- 작성일자 : 2019.07.22.
- 문제 : BOJ 5단계 1차원 배열
        10818번 최소, 최대 (https://www.acmicpc.net/problem/10818)
- 난이도 : ★★★☆☆
- 후기 : 시간초과가 4번이나 났는데, 초기에 짰던 코드는 1중 포문이 2번이나 도는 구조였다.
        BufferedReader와 StringTokenizer를 자주 이용하는 습관을 길러야겠다고 느낀 문제였음.
        
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());

		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

		for (int i = 0; i < N; i++) {

			int temp = sc.nextInt();

			if (max < temp) {
				max = temp;
			}

			if (min > temp) {
				min = temp;
			}
		}

		System.out.printf("%d %d", min, max);
		sc.close();
	}
}