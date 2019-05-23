/*
- 파일명 : BOJ_Step06_1110.java
- 작성자 : YJY
- 작성일자 : 2019.05.23.
- 문제 : BOJ 6단계 if문 사용해보기
        1110 더하기 사이클 (https://www.acmicpc.net/problem/1110)
*/
import java.io.*;

public class Main {
    
    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
                                                 
        String input = br.readLine(); //입력값
        //입력값이 10보다 작은 경우 뒤에 0을 붙여줌
        if(input.length()==1) {
        	input += "0";
        }
        String n = input; //초기값
        int count = 0; //카운트
        Boolean loop = true;
        
        while(loop) {
            int a = Integer.parseInt(input.substring(0,1)); //입력값의 첫번째 자리
            int b = Integer.parseInt(input.substring(1)); //입력값의 두번째 자리
            
            //입력값의 첫번째 자리와 두번째 자리를 더해준 값
            input = a + b + "";
            
            //더해준 값이 두자릿수일 경우
            if(input.length()==2) {
            	input = input.substring(1);
            }
            
            input = b + input + ""; //새로운수
            
            count++; //회전수
            
            if (n.equals(input)) {
            	bw.write(count+"");
            	loop = false;
            }
        }
        bw.flush();
        bw.close();
    }
}
