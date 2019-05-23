/*
- 파일명 : BOJ_Step01_9498.java
- 작성자 : YJY
- 작성일자 : 2019.05.23.
- 문제 : BOJ 1단계 if문 사용해보기
        9498 시험 성적 (https://www.acmicpc.net/problem/9498)
*/
import java.io.*;

public class Main {
    
    public static void main(String args[])throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int p = Integer.parseInt(br.readLine());
        
        if(p>=90 && p<=100) { bw.write("A"); }
        else if(p>=80 && p<90) { bw.write("B"); }
        else if(p>=70 && p<80) { bw.write("C"); }
        else if(p>=60 && p<70) { bw.write("D"); }
        else { bw.write("F"); }
        
        bw.flush();
        bw.close();
    }
}
