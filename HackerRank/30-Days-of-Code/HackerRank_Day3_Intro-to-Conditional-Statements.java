import java.util.*;

public class Solution {

    static String solve(int N) {
        String result = "";

        if (N >= 6 && N <= 20) {
            result = "Weird";
        }

        if (N >= 2 && N <= 5) {
            result = "Not Weird";
        }

        if (N > 20) {
            result = "Not Weird";
        }

        if (N % 2 != 0) {
            result = "Weird";
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(solve(N));

        scanner.close();
    }
}
