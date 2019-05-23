/*
- 파일명 : BOJ_Step05_4344.java
- 작성자 : YJY
- 작성일자 : 2019.05.23.
- 문제 : BOJ 5단계 if문 사용해보기
        4344 평균은 넘겠지 (https://www.acmicpc.net/problem/4344)
*/
import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int c = Integer.parseInt(br.readLine());//케이스의 개수
        
        //모든 케이스 회전
        for (int i=0; i<c; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(st.nextToken()); //케이스 내의 학생 수
            int[] point = new int[n]; //학생들의 점수 배열
            int sum = 0; //학생들의 점수 합
            double avg = 0; //평균 점수
            int pass = 0; //평균보다 높은 학생 수
            double per = 0; //평균을 넘는 학생의 비율
            
            //각 케이스 학생들의 점수 저장 및 합 구하기
            for (int j=0; j<n; j++) {
            	int input = Integer.parseInt(st.nextToken());
            	point[j] = input;
                sum += input;
            }
            avg = (double)sum/n;
            
            //평균 점수가 넘는 학생 수 구하기
            for (int j=0; j<n; j++) {
            	if(point[j]>avg) {
            		pass++;
            	}
            }            
            per = (double)pass/(double)n*100;
            
            String result = String.format("%.3f%%\n", per);
            bw.write(result);
        }
        bw.flush();
        bw.close();
    }
}
