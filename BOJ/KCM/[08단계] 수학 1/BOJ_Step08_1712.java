/*

- 파일명 : BOJ_Step08_1712.java
- 작성자 : KCM
- 작성일자 : 2019.07.04.
- 문제 : BOJ 8단계 수학 1 
        1712번 손익분기점 (https://www.acmicpc.net/problem/1712)
- 난이도 : ★★☆☆☆
- 후기 : 원래 생각대로 풀었더니 시간초과가 6번이나 나옴...
        [고정비용/(판매비용-가변비용) < 판매량]으로 계산하고,
        판매량이 소수점이 나오면 끝없는 결과가 나올 수 있어, 1을 기본으로 생각하고 풀어야 함.

*/

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		int fixedCosts = Integer.parseInt(str.split(" ")[0]); // 고정비용 A
		int variableCosts = Integer.parseInt(str.split(" ")[1]); // 가변비용 B
		int sellingExpenses = Integer.parseInt(str.split(" ")[2]); // 판매비용 C

		if (variableCosts >= sellingExpenses) { // 손익분기점이 생길 수 없는 경우 -1 출력
			System.out.println(-1);
		} else {
			// 고정비용 + 가변비용 * 판매량 < 판매비용 * 판매량
			// 고정비용 < (판매비용-가변비용) * 판매량
			// 고정비용/(판매비용-가변비용) < 판매량
			// 판매량이 소수점이 될 수 없으므로, +1 처리하여 출력
			System.out.println(fixedCosts / (sellingExpenses - variableCosts) + 1);
		}
	}
}