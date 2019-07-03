/*

- 파일명 : BOJ_Step02_10998.java
- 작성자 : KCM
- 작성일자 : 2019.04.13.
- 문제 : BOJ 2단계 사칙연산 도전하기
        10998번 A×B (https://www.acmicpc.net/problem/10998)
- 난이도 : ★☆☆☆☆
- 후기 : substring 함수만 기억하면 쉬운 문제
        
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String str = br.readLine();
    	
    	int A = Integer.parseInt(str.substring(0,1));
    	int B = Integer.parseInt(str.substring(2,3));
    	
    	System.out.println(A * B);
    	
    }
}