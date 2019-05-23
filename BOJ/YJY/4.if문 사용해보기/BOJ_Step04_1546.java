/*
- 파일명 : BOJ_Step04_1546.java
- 작성자 : YJY
- 작성일자 : 2019.05.23.
- 문제 : BOJ 4단계 if문 사용해보기
        1546 평균 (https://www.acmicpc.net/problem/1546)
*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] grade = new int[n];
        int max = 0;
        double sum=0;
        double avg=0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i<n; i++){
            grade[i] = Integer.parseInt(st.nextToken());
            if (max < grade[i]) {
            	max = grade[i];
            }
        }
        for (int i=0; i<n; i++) {
        	sum += (double)grade[i]/(double)max*100;
        }
        avg = sum/(double)n;
        bw.write(avg+"");
        bw.flush();
        bw.close();
    }
}
