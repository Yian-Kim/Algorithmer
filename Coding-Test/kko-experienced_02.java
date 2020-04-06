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

    public static int maxHeight(List<Integer> wallPositions, List<Integer> wallHeights) {
        int n = wallPositions.size();
        int max = 0;

        for (int i=0; i<n-1; i++) {
            if (wallPositions.get(i) < wallPositions.get(i+1)-1) {
                int heightGap = Math.abs(wallHeights.get(i+1) - wallHeights.get(i));
                int gapLength = wallPositions.get(i+1) - wallPositions.get(i) - 1;
                int gapMax = 0;
                if (gapLength > heightGap) {
                    int low = Math.max(wallHeights.get(i+1), wallHeights.get(i)) + 1;
                    int presentGap = gapLength - heightGap - 1;
                    gapMax = low + presentGap/2;
                } else {
                    gapMax = Math.min(wallHeights.get(i+1), wallHeights.get(i)) + gapLength;
                }
                max = Math.max(max, gapMax);
            }
        }
        return max;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int wallPositionsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> wallPositions = IntStream.range(0, wallPositionsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int wallHeightsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> wallHeights = IntStream.range(0, wallHeightsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.maxHeight(wallPositions, wallHeights);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
