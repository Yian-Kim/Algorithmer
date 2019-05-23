/*
- 파일명 : BOJ_Step11_11721.java
- 작성자 : YJY
- 작성일자 : 2019.05.23.
- 문제 : BOJ 11단계 for문 사용해보기
        11721 열 개씩 끊어 출력하기 (https://www.acmicpc.net/problem/11721)
*/
import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String line = br.readLine();
        for(int i=0; i<line.length(); i++){
            char a = line.charAt(i);
            if(i%10==0 && i>0){
            	bw.newLine();
            }
            bw.write(a);
        }
        bw.flush();
        bw.close();
    }
}
