/*
- 파일명 : BOJ_Step03_10998.java
- 작성자 : YJY
- 작성일자 : 2019.05.23.
- 문제 : BOJ 3단계 입/출력 받아보기 
        10998번 등록 (https://www.acmicpc.net/problem/10998)
*/
import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        System.out.println(a*b);
    }
}
