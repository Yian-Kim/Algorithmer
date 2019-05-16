import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] str1 = scan.nextLine().split(" ");
		String[] str2 = scan.nextLine().split(" ");
		String[] str3 = scan.nextLine().split(" ");
		String[] str4 = scan.nextLine().split(" ");
		
		int out1 = Integer.parseInt(str1[0]);
		int in1 = Integer.parseInt(str1[1]);
		int out2 = Integer.parseInt(str2[0]);
		int in2 = Integer.parseInt(str2[1]);
		int out3 = Integer.parseInt(str3[0]);
		int in3 = Integer.parseInt(str3[1]);
		int out4 = Integer.parseInt(str4[0]);
		int in4 = Integer.parseInt(str4[1]);
		
		int[] nums = new int[4];
		nums[0] = in1;
		nums[1] = nums[0] - out2 + in2;
		nums[2] = nums[1] - out3 + in3;
		nums[3] = nums[2] - out4;
		
		Arrays.sort(nums);
		System.out.println(nums[3]);

	}
	
}

