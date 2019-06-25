import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] array = new int[n+1];
		for (int i=1; i<=n; i++ ) {
			array[i] = scan.nextInt();
		}
		
		int[][] dp = new int[n+1][3];
		
		dp[1][0] = 0;
		dp[1][1] = array[1];
		dp[1][2] = array[1];
		
		for (int i=2; i<=n; i++) {
			dp[i][0] = max(dp[i-1][0], dp[i-1][1], dp[i-1][2]);
			dp[i][1] = array[i] + dp[i-1][0];
			dp[i][2] = array[i] + dp[i-1][1];
		}
		
		System.out.println(max(dp[n][0], dp[n][1], dp[n][2]));
	}

	private static int max(int i, int j, int k) {
		
		int[] array = new int[3];
		array[0] = i;
		array[1] = j;
		array[2] = k;
		
		int max = 0;
		
		for (int m=0; m<3; m++) {
			if (array[m] > max) {
				max = array[m];
			}
		}
		return max;
	}
}
