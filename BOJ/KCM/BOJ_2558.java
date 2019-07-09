/*

- 파일명 : BOJ_2558.java
- 작성자 : KCM
- 작성일자 : 2019.04.13.
- 문제 : BOJ 2단계 사칙연산 도전하기
        2558번 A+B - 2 (https://www.acmicpc.net/problem/2558)
- 난이도 : ★☆☆☆☆
- 후기 : 매우 쉬웠던 문제
        
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
 
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int A = Integer.parseInt(br.readLine());
    	int B = Integer.parseInt(br.readLine());
    	 	
    	System.out.println(A + B);

    }
}
