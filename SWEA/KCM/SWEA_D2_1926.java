/*
 
- 파일명 : SWEA_D2_1926.java
- 작성자 : KCM
- 작성일자 : 2019.03.29.
- 문제 : D2 1926. 간단한 369게임 (https://bit.ly/2VtsSGx)
- 난이도 : ★☆☆☆☆
- 후기 : 제약사항을 포함하여, 문제를 잘 읽어봐야 한다는 것을 느꼈음. 
         N을 100이하의 정수로 착각하여 1회 Fail 발생. (N은 10이상 1,000이하의 정수이다.) 

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException {

		_369Game();
	}

	private static void _369Game() throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(reader.readLine()); // 출력할 최대 정수 N
		int _369Num = 0; // 3, 6, 9와 비교할 변수
		int clap = 0; // 박수 횟수를 카운트할 변수

		for (int i = 1; i <= n; i++) {

			_369Num = i % 10; // 일의 자리가 3, 6, 9로 떨어지는지 검증
			if (_369Num == 3 || _369Num == 6 || _369Num == 9) {
				clap++;
			}

			_369Num = (i % 100 - i % 10) / 10; // 십의 자리 숫자가 3, 6, 9에 해당하는지 검증
			if (_369Num == 3 || _369Num == 6 || _369Num == 9) {
				clap++;
			}

			_369Num = (i % 1000 - i % 100) / 100; // 백의 자리 숫자가 3, 6, 9에 해당하는지 검증
			if (_369Num == 3 || _369Num == 6 || _369Num == 9) {
				clap++;
			}

			switch (clap) {
			case 1: // 일의 자리가 3, 6, 9에 해당될 경우
				System.out.print("- "); // 박수 한 번 출력
				break;
			case 2: // 일, 십의 자리가 3, 6, 9에 해당될 경우
				System.out.print("-- "); // 박수 두 번 출력
				break;
			case 3: // 일, 십, 백의 자리가 3, 6, 9에 해당될 경우
				System.out.print("--- "); // 박수 세 번 출력
				break;
			default:
				System.out.printf("%d ", i); // 3, 6, 9에 해당되지 않는 정수 출력
				break;
			}
			clap = 0;
		}
	}
}
