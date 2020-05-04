import java.io.*;

public class Solution {

    public static String solve(String s) {
        int length = s.length();
        String temp = "";
        String odd = "";
        String even = "";

        for (int i = 0; i < length; i++) {
            String str = s.split("")[i];

            if (i % 2 == 0) {
                odd += str;
            } else {
                even += str;
            }
        }
        temp = odd + " " + even;

        return temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine());
        String[] result = new String[T];

        for (int i = 0; i < T; i++) {
            String strings = bufferedReader.readLine();
            result[i] = solve(strings);
            System.out.println(result[i]);
        }
        bufferedReader.close();
    }
}
