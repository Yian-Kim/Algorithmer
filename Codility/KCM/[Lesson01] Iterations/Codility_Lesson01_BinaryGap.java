/*

- 파일명 : Codility_Lesson01_BinaryGap.java
- 작성자 : KCM
- 작성일자 : 2019.06.26.
- 문제 : Codility Lesson01 Iterations
        BinaryGap (https://app.codility.com/demo/results/trainingDQ7VZC-FJ8)
- 난이도 : ★★☆☆☆
- 후기 : 링크로 들어가면 내가 푼 문제에 대해 볼 수 있다.
        처음 전략은 이러했다.

        1. 일단 입력받은 숫자를 2진수로 변환,
        2. 2진수로 만든 정수를 스택에 삽입
        3. 스택에서 하나씩 꺼내면서 시작지점과 끝지점에 1이 있는지 검사
        -> 1에서 다시 1을 만날 때까지 0을 만나면 카운트 증가
        4. 차이를 정수로 반환. 단, 스택의 크기만큼 돌렸을 때 다시 1을 만나지 못한다면 0을 반환

        결과는 시간초과 및 예외케이스 때문에 실패했다.
        전략을 다시 세워서, 진법변환 메소드를 사용하고, 1과 1사이의 거리계산에 좀더 집중했다.
        누락된 케이스는 10000처럼 1이 한 번만 등장한다든가 
        10010001처럼 가운데 1을 기준으로 거리가 2가지 이상 나올 경우였다.
        처음에는 새벽에 4시간 동안 끙끙거리며 풀리지 않았는데, 다시 도전해서 36분 만에 풀어냈다.
        Codility 사이트가  BOJ나 SWEA와 다르게 이질적으로 느껴져서 엄청 헤맸으나, 성공했다.

*/

class Solution {
	public int solution(int N) {

		String binaryString = Integer.toBinaryString(N); // 진법변환 : 10진수 -> 2진수
		String str[] = binaryString.split("");           // 숫자 하나씩 저장
		int array[] = new int[str.length];               // 형변환 시 사용할 Integer 배열
		int count = 0;                                   // 2진수의 1과 1사이 거리를 세기 위한 변수
		int max = 0;									 // 1과 1사이의 최대 거리
		
		for (int i = 0; i < str.length; i++) {           // 2진수 배열의 크기 만큼

			array[i] = Integer.parseInt(str[i]);		 // Integer 배열에 저장

			if (array[i] == 0) {						 // 0을 만나면 count 변수 증가 -> 1과 1사이 거리계산
				count++;
			}

			if (array[i] == 1) {						 // 1을 만나면 max값과 count값 비교
				if (max < count) {                       // !] 10010001인 경우
					max = count;						 // 가운데 1을 기준으로 앞보다 뒤의 길이가 길면 max에 저장
				}
				count = 0;                               // 1을 기준으로 거리계산을 위해 변수 초기화
			}

			if (count == array.length - 1)               // !] 100000인 경우, 거리계산이 배열의 길이만큼 되므로
				return 0;                                // 0을 리턴
		}
		return max;                                      // 최대거리 리턴
	}
}