/*

- 파일명 : BOJ_Step14_2748.java
- 작성자 : KCM
- 작성일자 : 2019.06.23.
- 문제 : BOJ 14단계 피보나치 수
        2748번 피보나치 수2 (https://www.acmicpc.net/problem/2748)
- 난이도 : ★☆☆☆☆
- 후기 : 이미 2747번에서 재귀함수로 풀면 시간초과가 난다는 것을 알아서
        2728번부터는 무조건 반복문을 사용하여 풀었다.
        똑같은 코드로 될 줄 알았는데 숨은 복병이 있었다.
        2748번은 n이 90일 때도 고려해야된다는 것이다.
        int형으로 90값을 넣으면 -1581614984이 나온다.
        int값의 범위를 넘어섰기 때문에 틀렸습니다가 떴다.
        이 문제는 long형으로 형변환을 해주거나 long형으로 선언해야 한다.
        long형으로 90값을 넣으면 2880067194370816120이 나온다.
        
*/

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		long n = Integer.parseInt(scan.nextLine());
        
		long result = (long)fibonacci(n);
		
		System.out.println(result);
	}

	private static long fibonacci(long n) {
		
		long arr[] = new long[(int)n+1];		
		
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i=2; i<arr.length; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		
		return arr[(int)n];
		
	}
}