/*
- 파일명 : BOJ_Step02_10817.java
- 작성자 : YJY
- 작성일자 : 2019.05.23.
- 문제 : BOJ 2단계 if문 사용해보기
        10817 세 수 (https://www.acmicpc.net/problem/10817)
*/
import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        if ((a>=b || a>=c) && (a<=b || a<=c)){
            bw.write(a+"");
        } else if ((b>=a || b>=c) && (b<=a || b<=c)) {
            bw.write(b+"");
        } else {
            bw.write(c+"");
        }
        bw.flush();
        bw.close();
    }
}
