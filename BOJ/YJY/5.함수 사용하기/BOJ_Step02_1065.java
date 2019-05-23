/*
- 파일명 : BOJ_Step02_1065.java
- 작성자 : YJY
- 작성일자 : 2019.05.24.
- 문제 : BOJ 2단계 함수 사용하기
        1065 한수 (https://www.acmicpc.net/problem/1065)
*/
import java.io.*;

public class Main{
    
    public static void main(String args[])throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        //자연수 N
        int n = Integer.parseInt(br.readLine());
        //한수의 개수
        int cnt = 0;
        //각자릿수 비교 결과
        boolean b;
        
        //1보다 크거나 같고, N보다 작거나 같은수
        for(int i=1; i<=n; i++) {
            
        	//100 이하일때는 무조건 누적
            if(i<100) { cnt++; }
            
            //100 이상일 경우
            if(i>=100) {

            	b = true;
	            
            	//한수일 경우 카운트 누적
	            for(int j=0; j<(i+"").length()-2; j++){

	            	if(i/(int)Math.pow(10, j)%10-i/(int)Math.pow(10, j+1)%10 !=
	            	i/(int)Math.pow(10, j+1)%10-i/(int)Math.pow(10, j+2)%10) {
	            		b = false;
	            	}
	            }
	            if(b) { cnt++; }
            }
        }
        bw.write(cnt+"");
        bw.flush();
        bw.close();
    }
}
