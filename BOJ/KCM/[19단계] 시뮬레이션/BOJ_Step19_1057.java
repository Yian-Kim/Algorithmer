/*

- 파일명 : BOJ_Step19_1057.java
- 작성자 : KCM
- 작성일자 : 2019.05.16.
- 문제 : BOJ 19단계 시뮬레이션
        1057번 토너먼트 (https://www.acmicpc.net/problem/1057)
- 난이도 : ★☆☆☆☆
- 후기 : while문을 사용할지 for문을 사용할지에 대한 고민이 있었으나,
	참가자 수에 상관없이 매 라운드마다 두 사람이 배정받는 번호가 같으면 대결하게 된다는 것을 알게 됨.
	서로 대결하지 않는 경우가 없으므로 -1 처리는 안해줘도 됨.

*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt(); // 참가자 수
		int kim = scan.nextInt(); // 김지민의 번호
		int lim = scan.nextInt(); // 임한수의 번호
		int count = 0; // 김지민과 임한수가 대결하는 라운드 번호

		while (kim != lim) { // 김지민과 임한수가 대결하는 번호가 같을 때까지 반복

			kim = kim / 2 + kim % 2;
			lim = lim / 2 + lim % 2;

			count++;
		}

		System.out.println(count); // 라운드 번호 출력
	}
}
