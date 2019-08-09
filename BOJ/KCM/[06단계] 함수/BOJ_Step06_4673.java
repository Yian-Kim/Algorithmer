/*

- 파일명 : BOJ_Step06_4673.java
- 작성자 : KCM
- 작성일자 : 2019.08.09.
- 문제 : BOJ 6단계 함수
        4673번 셀프 넘버 (https://www.acmicpc.net/problem/4673)
- 난이도 : ★★★★★
- 후기 : 이 문제 역시 풀이를 보지 않고 푸는 데 집중하여, 꼬박 열흘이 걸렸다.
        문제 자체를 이해하는데도 오래걸렸는데, 성공코드를 봐도 잘 모르겠다.
        이제까지 본 문제 중에 보고 또 봐도 이해 안되는 문제는 처음 봤다.
        셀프 넘버에 대한 개념이 확실히 잡히진 않았지만 
        성공코드는 d(n)이 아닌, n을 구하는 방법에 집중해서 푼 것 같다.
        
*/

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		boolean[] isNotSelfNumber = new boolean[10001];

		for (int n = 1; n <= 10000; n++) {
			int dn = getDn(n);

			if (dn <= 10000) {
				isNotSelfNumber[dn] = true;
			}
		}

		for (int n = 1; n < isNotSelfNumber.length; n++) {
			if (!isNotSelfNumber[n]) {
				System.out.println(n);
			}
		}
	}

	private static int getDn(int n) {

		int dn = n;

		while (n > 0) {
			dn += n % 10;
			n /= 10;
		}

		return dn;
	}
}