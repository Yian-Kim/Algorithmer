/*

- 파일명 : BOJ_Step02_10817.java
- 작성자 : KCM
- 작성일자 : 2019.04.25.
- 문제 : BOJ 2단계 if문
        10817번 세 수 (https://www.acmicpc.net/problem/10817)
- 난이도 : ★☆☆☆☆
- 후기 : Arrays.sort(str)으로 해결할 수 있을 줄 알았는데, 직접 비교해야 함.
        
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
 
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String str[] = br.readLine().split(" ");

       int A = Integer.parseInt(str[0]);
       int B = Integer.parseInt(str[1]);
       int C = Integer.parseInt(str[2]);
       
       if(A>=B && B>=C || C>=B && B>=A) {
    	   System.out.println(B);
       } else if(A>=C && C>=B || B>=C && C>=A) {
    	   System.out.println(C);
       } else if(B>=A && A>=C || C>=A && A>=B) {
    	   System.out.println(A);
       }
    }
}