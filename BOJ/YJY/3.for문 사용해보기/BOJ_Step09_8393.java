/*
- 파일명 : BOJ_Step09_8393.java
- 작성자 : YJY
- 작성일자 : 2019.05.23.
- 문제 : BOJ 9단계 for문 사용해보기
        8393 합 (https://www.acmicpc.net/problem/8393)
*/
import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int sum=0;
        
        for (int i=1; i<=n; i++){
            sum += i;
            if(i==n){
                String a = sum + "";
                bw.write(a);
            }
        }
        bw.flush();
        bw.close();
    }
}
