/*
- 파일명 : BOJ_Step01_2741.java
- 작성자 : YJY
- 작성일자 : 2019.05.23.
- 문제 : BOJ 1단계 for
        2741번 N 찍기 (https://www.acmicpc.net/problem/2741)
*/
import java.io.*;

public class Main {
    
    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String a;
        int n  = Integer.parseInt(br.readLine());
        for(int i=1; i<=n; i++) {
            a = i+"";
            bw.write(a);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
