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

    public static int countBalancingElements(List<Integer> arr) {
        int evenSum = 0;
        int oddSum = 0;
        int result = 0;
        int n = arr.size();

        for (int i=0; i<n; i++) {
            if (i % 2 == 0) {
                evenSum += arr.get(i);
            } else {
                oddSum += arr.get(i);
            }
        }

        int prevOddSum = 0;
        int prevEvenSum = 0;

        for (int i=0; i<n; i++) {
            int tempEven = evenSum - prevEvenSum;
            int tempOdd = oddSum - prevOddSum;

            if (i % 2 == 0) {
                tempEven -= arr.get(i);
            } else {
                tempOdd -= arr.get(i);
            }

            if (prevOddSum + tempEven == prevEvenSum + tempOdd) {
                result++;
            }

            if (i % 2 == 0) {
                prevEvenSum += arr.get(i);
            } else {
                prevOddSum += arr.get(i);
            }
        }
        return result;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.countBalancingElements(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
