/**
 * 서로 다른 부분 문자열의 개수
 * https://www.acmicpc.net/problem/11478
 *
 * 메모리 초과
 */

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String name = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                name += s.substring(j, j + 1);
                set.add(name);
            }
        }

        System.out.println(set.size());
    }
}