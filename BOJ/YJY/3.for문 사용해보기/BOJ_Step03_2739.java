/*
- 파일명 : BOJ_Step03_2739.java
- 작성자 : YJY
- 작성일자 : 2019.05.23.
- 문제 : BOJ 3단계 for문 사용해보기
        2739번 구구단 (https://www.acmicpc.net/problem/2739)
*/
import java.io.*;

public class Main {
    
    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String a;
        int n  = Integer.parseInt(br.readLine());
    	for(int i=1; i<10; i++) {
            a = n + " * " + i + " = " + n*i;
            bw.write(a);
            bw.newLine();
    	}
        bw.flush();
        bw.close();
    }
}
