/*
- 파일명 : BOJ_Step07_2441.java
- 작성자 : YJY
- 작성일자 : 2019.05.23.
- 문제 : BOJ 7단계 for문 사용해보기
        2441 별 찍기 - 4 (https://www.acmicpc.net/problem/2441)
*/
import java.io.*;

public class Main {
    
    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String a = "*";
        String b = " ";
        
        int n  = Integer.parseInt(br.readLine());
    	for(int i=0; i<n; i++) {
    		for(int k=0; k<i; k++) {
    			bw.write(b);
    		}
    		for(int j=i; j<n; j++) {
    			bw.write(a);
    		}
    		bw.newLine();
    	}
        bw.flush();
        bw.close();
    }
}
