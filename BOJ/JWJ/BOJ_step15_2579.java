import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = Integer.parseInt(scan.nextLine());
		
		int[] score = new int[n+1];
		
		for (int i=1; i<=n; i++) {
			score[i] = Integer.parseInt(scan.nextLine());
		}
		
		int[][] dp = new int[n+1][3];
		
		dp[0][0] = 0;
		dp[0][1] = score[0];
		dp[0][2] = score[0];
		
		for (int i=1; i<=n; i++) {
			
			dp[i][0] = max(dp[i-1][2], dp[i-1][1]);
			dp[i][1] = score[i] + dp[i-1][0];
			dp[i][2] = score[i] + dp[i-1][1];
		}
		
		System.out.println(max(dp[n][1], dp[n][2]) );
	}

	private static int max(int i, int j, int k) {
		int max = 0;
		
		int[] array = new int[3];
		array[0] = i;
		array[1] = j;
		array[2] = k;
		
		for (int n=0; n<3; n++) {
			
			if (array[n] > max) max = array[n];
		}
		return max;		
	}
	private static int max(int i, int j) {
		if (i-j < 0) return j;
		else return i;
	}
}
