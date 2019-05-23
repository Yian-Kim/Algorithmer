/*
- 파일명 : BOJ_Step07_2558.java
- 작성자 : YJY
- 작성일자 : 2019.05.23.
- 문제 : BOJ 7단계 사칙연산 도전하기 
        2558번 A+B-2 (https://www.acmicpc.net/problem/2558)
*/
import java.io.*;

public class Main {
    
    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        String c = Integer.toString(a+b);
        
        bw.write(c);
        bw.flush();
        bw.close();
    }
}
