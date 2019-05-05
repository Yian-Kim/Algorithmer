/*

- 파일명 : BOJ_Step1_1000.java
- 작성자 : KCM
- 작성일자 : 2019.04.14.
- 문제 : BOJ 1단계 입/출력 받아보기 
        1000번 A+B (https://www.acmicpc.net/problem/1000)
- 난이도 : ★☆☆☆☆
- 후기 : substring 함수 부분이 생각나지 않아 구글링함

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
    	
    	System.out.println(A + B);
    }
}
