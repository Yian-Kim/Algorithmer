/*

- 파일명 : BOJ_Step03_2741.java
- 작성자 : KCM
- 작성일자 : 2019.04.14.
- 문제 : BOJ 3단계 for문 사용해보기
        2741번 N 찍기 (https://www.acmicpc.net/problem/2741)
- 난이도 : ★☆☆☆☆
- 후기 : for문 하나 사용하는 문제라 매우 쉬운 편.
        
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
 
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int num = Integer.parseInt(br.readLine());
      
       for (int i=1; i<=num; i++) {
    	   System.out.println(i);
       }
    }
}