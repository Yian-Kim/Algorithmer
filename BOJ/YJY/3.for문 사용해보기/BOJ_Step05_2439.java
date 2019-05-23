/*
- 파일명 : BOJ_Step05_2439.java
- 작성자 : YJY
- 작성일자 : 2019.05.23.
- 문제 : BOJ 5단계 for문 사용해보기
        2439 별 찍기 - 2 (https://www.acmicpc.net/problem/2439)
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
    		for(int k=i; k<n-1; k++) {
    			bw.write(b);
    		}
    		for(int j=0; j<=i; j++) {
    			bw.write(a);
    		}
    		bw.newLine();
    	}
        bw.flush();
        bw.close();
    }
}
