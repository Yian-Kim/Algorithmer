/*
- 파일명 : BOJ_Step10_11720.java
- 작성자 : YJY
- 작성일자 : 2019.05.23.
- 문제 : BOJ 10단계 for문 사용해보기
        11720 숫자의합 (https://www.acmicpc.net/problem/11720)
*/
import java.io.*;

public class Main {
    
    public static void main(String args[]) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int length = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int sum = 0;
        
        for(int i=0; i<length; i++){
            sum += Integer.parseInt(input.substring(i,i+1));
            if(i==length-1){
                String output = sum+"";
                bw.write(output);
            }
        }
        bw.flush();
        bw.close();
    }
}
