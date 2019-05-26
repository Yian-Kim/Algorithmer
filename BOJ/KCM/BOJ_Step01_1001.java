/*

- 파일명 : BOJ_Step01_1001.java
- 작성자 : KCM
- 작성일자 : 2019.04.26.
- 문제 : BOJ 1단계 입/출력 받아보기
        1001번 A-B (https://www.acmicpc.net/problem/1001)
- 난이도 : ★☆☆☆☆
- 후기 : 1001번에 이어 손쉽게 풀 수 있었던 문제

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

    	System.out.println(A - B);

    }
}
