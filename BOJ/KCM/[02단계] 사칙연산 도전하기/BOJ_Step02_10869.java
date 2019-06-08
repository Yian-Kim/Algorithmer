/*

- 파일명 : BOJ_Step02_10869.java
- 작성자 : KCM
- 작성일자 : 2019.04.13.
- 문제 : BOJ 2단계 사칙연산 도전하기
        10869번 사칙연산 (https://www.acmicpc.net/problem/10869)
- 난이도 : ★★☆☆☆
- 후기 : substring으로 int 변수에 담으려고 했으나,
        10회 가량 실패가 떠서 split을 사용함.
        
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
        
       System.out.println(A + B);
       System.out.println(A - B);
       System.out.println(A * B);
       System.out.println(A / B);
       System.out.println(A % B);
    }
}
