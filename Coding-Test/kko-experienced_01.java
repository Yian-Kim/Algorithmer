import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    public static int getMin(String s) {
        char temp;
        int leftBracket = 0;
        int rightBracket = 0;
        int result = 0;

        for (int i=0; i<s.length(); i++) {
            temp = s.charAt(i);

            if (temp == '(') {
                leftBracket++;
            }
            
            if (temp == ')') {
                rightBracket++;
            }
        }
        result = Math.abs(rightBracket - leftBracket);
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.getMin(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
