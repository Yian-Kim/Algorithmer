/*
- 파일명 : BOJ_Step06_2440ava
- 작성자 : YJY
- 작성일자 : 2019.05.23.
- 문제 : BOJ 6단계 for문 사용해보기
        2440 별 찍기 - 3 (https://www.acmicpc.net/problem/2440)
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
    		for(int j=i; j<n; j++) {
    			bw.write(a);
    		}
    		bw.newLine();
    	}
        bw.flush();
        bw.close();
    }
}
