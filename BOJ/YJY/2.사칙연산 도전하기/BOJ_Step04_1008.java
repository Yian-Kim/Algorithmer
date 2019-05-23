/*
- 파일명 : BOJ_Step04_1008.java
- 작성자 : YJY
- 작성일자 : 2019.05.23.
- 문제 : BOJ 4단계 사칙연산 도전하기 
        1008번 A/B (https://www.acmicpc.net/problem/1008)
*/
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		String c = Double.toString(a/b);
		
		bw.write(c);
		bw.flush();
		bw.close();
		
		
	}
}
