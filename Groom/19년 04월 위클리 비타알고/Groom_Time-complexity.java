/*
- 파일명 : Groom_Time-complexity.java
- 작성자 : KCM
- 작성일자 : 2019.09.17.
- 문제 : 구름EDU 19년 04월 위클리 비타알고
        04월 2주차: 시간복잡도 ★2 (https://bit.ly/2m7U4tn)
- 난이도 : ★★★☆☆
- 후기 : 이 문제를 풀기 위해 BigInteger로 연산하고,
        BigInteger를 Int형으로 변환하기 위해 먼 길을 돌아갔는데
		해설을 보니 허무해졌다. 구현 능력보다는 사고력을 요구하는 문제였다.
*/

import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		while (N != 0) {
			count += N /= 5;
		}
		System.out.print(count);
	}
}
