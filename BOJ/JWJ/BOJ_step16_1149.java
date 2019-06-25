package recur;

import java.util.Scanner;

public class ex_1149_test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
        
		int[][] price = new int[n+1][3];
		
		// i번째 방을 0(빨강), 1(초록), 2(파랑)으로 칠할 때의 비용
		for(int i=0; i<n; i++) {
			String[] line = scan.nextLine().split(" ");
			
			price [i][0] = Integer.parseInt(line[0]);
			price [i][1] = Integer.parseInt(line[1]);
			price [i][2] = Integer.parseInt(line[2]);
			
		}
		
		
		
		// 첫 번째 집만 각각의 색으로 칠할 경우 최소 비용 초기화
		int[][] dp = new int[n+1][3];
		
		dp[0][0] = price[0][0];
		dp[0][1] = price[0][1];
		dp[0][2] = price[0][2];
		
		// dp[i][0] = i번째 집을 빨강으로 칠하는 최소 비용
		// dp[i][1] = i번째 집을 초록으로 칠하는 최소 비용
		// dp[i][2] = i번째 집을 파랑으로 칠하는 최소 비용
		
		for (int i=1; i<=n; i++) {
			dp[i][0] = price[i][0] + min(dp[i-1][1], dp[i-1][2]); 
			dp[i][1] = price[i][1] + min(dp[i-1][0], dp[i-1][2]);
			dp[i][2] = price[i][2] + min(dp[i-1][0], dp[i-1][1]);
		}
		
		System.out.println(min(dp[n][0], dp[n][1], dp[n][2]));
	}

	// 3개의 정수 중 min을 반환하는 메소드
	private static int min(int i, int j, int k) {
		int min = 1000000;
		
		int[] array = new int[3];
		array[0] = i;
		array[1] = j;
		array[2] = k;
		
		for (int n=0; n<3; n++) {
			if (array[n] < min) min = array[n];
		}
		return min;
	}

	// 2개의 정수 중 min을 반환하는 메소드
	private static int min(int i, int j) {
		if (i-j >0) return j;
		else return i;
	}
}
