/*
- 파일명 : BOJ_Step06_10430.java
- 작성자 : YJY
- 작성일자 : 2019.05.23.
- 문제 : BOJ 6단계 사칙연산 도전하기 
        10430번 나머지 (https://www.acmicpc.net/problem/10430)
*/
import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        System.out.printf("%d\n%d\n%d\n%d\n", (a+b)%c, (a%c + b%c)%c, (a*b)%c, (a%c * b%c)%c);
    }
}
