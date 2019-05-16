import java.util.Scanner;

public class ex_2455 {
	
	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		
//		int n = scan.nextInt();
//		int r = scan.nextInt();
//		int c = scan.nextInt();
		
		int n = 2;
		int r = 3;
		int c = 1;
		int result = 0;
		int median = (int) Math.pow(2, n-1);
		
		// 사분할 하는 행위: n회 시행
		for (int i=0; i<n; i++) {
			
		
			if (r >= median && c >= median) {
				
				// 4사분면
				// result 값 누적

				result += 3 * median * median;
				r -= median;
				c -= median;
				median = median/2;
								
			} else if (r >= median && c < median) {
				// 3사분면
				// result 값 누적
				
				result += 2 * median * median;
				r -= median;
				median = median/2;
				
			} else if (r < median && c >= median) {
				// 2사분면
				// result 값 누적
				
				result += median * median;
				c -= median;
				median = median/2;
					
			} else if (r < median && c < median) {
				// 1사분면
				// result 값 누적
				median = median/2;
			}
			
			// 남은 result 값 누적
			// median 치환
		}
		
	}// main
} //class
