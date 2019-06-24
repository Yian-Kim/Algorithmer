import java.util.Scanner;

public class Lv14_fibonacci_number_1003_fibonacci_function_dp {// 재귀는 시간초과 > DP로 풀기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for (int i=0; i<T; i++) {
			c0 = 0;
			c1 = 0;
			int N = scan.nextInt();
			fibonacci(N);
			System.out.println(c0 + " " + c1);
		}
		
	}
	
	public static int fibonacci(int n) {
	    if (n == 0) {
	    	c0++;
	        return 0;
	    } else if (n == 1) {
	    	 c1++;
	        return 1;
	    } else {
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }
	}

}
