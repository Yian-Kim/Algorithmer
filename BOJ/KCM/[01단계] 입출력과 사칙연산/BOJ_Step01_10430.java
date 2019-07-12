/*

- 파일명 : BOJ_Step01_10430.java
- 작성자 : KCM
- 작성일자 : 2019.04.13.
- 문제 : BOJ 1단계 입출력과 사칙연산
        10430번 나머지 (https://www.acmicpc.net/problem/10430)
- 난이도 : ★☆☆☆☆
- 후기 : substring으로 제출하니 런타임 에러와 틀렸습니다가 떠서 split을 사용함
  
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
 
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String str = br.readLine();
       
       int A = Integer.parseInt(str.split(" ")[0]);
       int B = Integer.parseInt(str.split(" ")[1]);
       int C = Integer.parseInt(str.split(" ")[2]);
       
       System.out.println((A+B)%C);
       System.out.println((A%C+B%C)%C);
       System.out.println((A*B)%C);
       System.out.println((A%C*B%C)%C);
    }
}
