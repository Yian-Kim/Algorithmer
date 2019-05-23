/*
- 파일명 : BOJ_Step12_15552.java
- 작성자 : YJY
- 작성일자 : 2019.05.23.
- 문제 : BOJ 12단계 for문 사용해보기
        15552 빠른 A+B (https://www.acmicpc.net/problem/15552)
*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        
        for(int i=0; i<num; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	
        	String sum = a + b + "";
        	bw.write(sum);
        	bw.newLine();
        }
        
        bw.flush();
        bw.close();
    }
}
