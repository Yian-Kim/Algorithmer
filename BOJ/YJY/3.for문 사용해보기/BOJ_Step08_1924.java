/*
- 파일명 : BOJ_Step08_1924.java
- 작성자 : YJY
- 작성일자 : 2019.05.23.
- 문제 : BOJ 8단계 for문 사용해보기
        1924 2007년 (https://www.acmicpc.net/problem/1924)
*/
import java.io.*;
import java.util.*;

public class Main {
    
	static int day;
    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        
        int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for(int i=0; i<x-1; i++) {
        	day += month[i];
        }
        day += y;
        int num = day%7;
        
        String[] date = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
        bw.write(date[num]);
        
        bw.flush();
        bw.close();
    }
}
