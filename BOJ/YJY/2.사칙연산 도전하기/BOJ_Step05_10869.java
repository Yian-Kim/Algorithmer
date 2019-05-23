/*
- 파일명 : BOJ_Step05_10869.java
- 작성자 : YJY
- 작성일자 : 2019.05.23.
- 문제 : BOJ 5단계 사칙연산 도전하기 
        10869번 사칙연산 (https://www.acmicpc.net/problem/10869)
*/

import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        System.out.printf("%s\n%s\n%s\n%s\n%s\n", a+b, a-b, a*b, a/b, a%b);
        
	}
}
