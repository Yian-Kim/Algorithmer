/**
 * 시리얼 번호
 * Silver III
 * https://www.acmicpc.net/problem/1431
 *
 * 메모리 > 14296 KB
 * 시간 > 136 ms
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> answerList = new ArrayList<>();

        String str = br.readLine();
        int n = Integer.parseInt(str);

        for (int i = 0; i < n; i++) {
            String serialNumber = br.readLine();
            answerList.add(serialNumber);
        }

        answerList.sort((o1, o2) -> {
            if (o1.length() < o2.length()) {
                return -1;
            } else if (o1.length() == o2.length()) {
                int sum1 = 0, sum2 = 0;

                for (int i = 0; i < o1.length(); i++) {
                    if (o1.charAt(i) <= '9' && o1.charAt(i) >= '1') {
                        sum1 += o1.charAt(i) - '0';
                    }
                }

                for (int i = 0; i < o2.length(); i++) {
                    if (o2.charAt(i) <= '9' && o2.charAt(i) >= '1') {
                        sum2 += o2.charAt(i) - '0';
                    }
                }

                if (sum1 == sum2) {
                    return o1.compareTo(o2);
                } else {
                    return Integer.compare(sum1, sum2);
                }
            }
            return 1;
        });

        for (String answer : answerList) {
            System.out.println(answer);
        }
    }
}