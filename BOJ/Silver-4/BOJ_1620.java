/**
 * 나는야 포켓몬 마스터 이다솜
 * https://www.acmicpc.net/problem/1620
 *
 * 메모리 > 56008 KB
 * 시간 > 1284 ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, String> numberMap = new HashMap<>();
        Map<String, Integer> nameMap = new HashMap<>();
        List<String> answerList = new ArrayList<>();

        String str = br.readLine();
        int n = Integer.parseInt(str.split(" ")[0]);
        int m = Integer.parseInt(str.split(" ")[1]);

        for (int i = 1; i <= n; i++) {
            String pokemonName = br.readLine();
            numberMap.put(i, pokemonName);
            nameMap.put(pokemonName, i);
        }

        for (int i = 1; i <= m; i++) {
            String problem = br.readLine();

            if (Character.isDigit(problem.charAt(0))) {
                answerList.add(numberMap.get(Integer.parseInt(problem)));
            } else {
                answerList.add(Integer.toString(nameMap.get(problem)));
            }
        }

        for (Object obj : answerList) {
            System.out.println(obj);
        }
    }
}