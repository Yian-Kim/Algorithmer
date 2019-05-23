/*
- 파일명 : BOJ_Step03_10871.java
- 작성자 : YJY
- 작성일자 : 2019.05.23.
- 문제 : BOJ 3단계 if문 사용해보기
        10871 X보다 작은 수 (https://www.acmicpc.net/problem/10871)
*/
import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a<x) {
                bw.write(a+" ");
            }
        }
        bw.flush();
        bw.close();
    }
}
