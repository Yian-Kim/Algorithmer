/*

- 파일명 : BOJ_Step02_1008.java
- 작성자 : KCM
- 작성일자 : 2019.04.13.
- 문제 : BOJ 2단계 사칙연산 도전하기
        1008번 A/B (https://www.acmicpc.net/problem/1008)
- 난이도 : ★☆☆☆☆
- 후기 : 나눗셈은 소수점이 발생할 수 있으므로 double형을 사용해야함.
        int형 한 번 썼다가 실패한 적 있음.
        
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String str = br.readLine();
    	
    	double A = Integer.parseInt(str.substring(0,1));
    	double B = Integer.parseInt(str.substring(2,3));
    	
    	System.out.println(A / B);
    }
}