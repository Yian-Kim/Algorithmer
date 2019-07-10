/*

- 파일명 : BOJ_Step02_2884.java
- 작성자 : KCM
- 작성일자 : 2019.07.11.
- 문제 : BOJ 2단계 if문
        2884번 알람 시계 (https://www.acmicpc.net/problem/2884)
- 난이도 : ★☆☆☆☆
- 후기 : 조금만 생각해보면 쉽게 풀 수 있는 문제!
        
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		int hour = Integer.parseInt(str.split(" ")[0]);
		int minute = Integer.parseInt(str.split(" ")[1]);

		if (minute < 45) {
			hour -= 1;
			minute += 60;
		}

		if (hour < 0) {
			hour += 24;
		}

		System.out.println(hour + " " + (minute - 45));
	}
}
