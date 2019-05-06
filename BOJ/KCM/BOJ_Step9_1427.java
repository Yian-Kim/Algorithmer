/*

- 파일명 : BOJ_Step9_1427.java
- 작성자 : KCM
- 작성일자 : 2019.05.06.
- 문제 : BOJ 9단계 정렬해보기 
	1427번 소트인사이드 (https://www.acmicpc.net/problem/1427)
- 난이도 : ★☆☆☆☆
- 후기 : 입력할 숫자 개수 없이 입력하는 방법이 헷갈려서 소스코드 구글링함

*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] str = scan.nextLine().split(""); // 입력값 숫자 하나씩 문자열 배열에 저장
		int size = str.length; // 문자열 배열 길이
		int[] arr = new int[size]; // 숫자를 저장하고 출력할 배열 선언
		

		for (int i = 0; i < str.length; i++) {
			arr[i] = Integer.parseInt(str[i]); // 입력받은 문자열 변환하여 숫자형 배열에 저장
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) { // 내림차순 정렬
				int temp = 0; // 임시변수
      
				if (arr[i] < arr[j]) { // 앞에 있는 숫자가 뒤에 있는 숫자보다 작으면,
					temp = arr[i]; // 임시변수에 작은 숫자 저장
					arr[i] = arr[j]; // 앞에는 보다 큰 숫자로,
					arr[j] = temp; // 뒤에는 보다 작은 숫자로 자리바꿈
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]); // 정렬된 배열 출력
		}
	}
}
