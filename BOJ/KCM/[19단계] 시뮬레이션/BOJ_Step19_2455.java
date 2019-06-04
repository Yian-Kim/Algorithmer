/*

- 파일명 : BOJ_Step19_2455.java
- 작성자 : KCM
- 작성일자 : 2019.05.16.
- 문제 : BOJ 19단계 시뮬레이션
        2455번 지능형 기차 (https://www.acmicpc.net/problem/2455)
- 난이도 : ★☆☆☆☆
- 후기 : 입력값을 스플릿할지, 배열로 저장할지 고민하다가 구글링함.
        쉬운 문제였지만 nextInt() 함수에 대해 다시 한 번 생각해보게 됨.

*/

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int max = 0; // 최대 사람 수
		int sum = 0; // 기차 안에 있는 사람 수
		
		for(int i=0; i<4; i++) {
		
			int getout = scan.nextInt(); // 내린 사람 수
			int geton = scan.nextInt(); // 탄 사람 수
			
			// 조건에 내릴 사람이 모두 내린 후에 기차에 탄다고 했으므로, 
			sum -= getout; // 내린 사람 수 연산 후에
			sum += geton; // 탄 사람 수 연산
			
			if(max < sum) { // 가장 큰 값 찾기
				max = sum;
			}
		}
		
		System.out.println(max); // 최대 사람 수 출력
	}
}
