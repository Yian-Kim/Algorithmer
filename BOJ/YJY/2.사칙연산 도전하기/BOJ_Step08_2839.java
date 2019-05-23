/*
- 파일명 : BOJ_Step08_2839.java
- 작성자 : YJY
- 작성일자 : 2019.05.23.
- 문제 : BOJ 8단계 사칙연산 도전하기 
        2839번 설탕 배달 (https://www.acmicpc.net/problem/2839)
*/
import java.io.*;

public class Main {
	
	static String sum;
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		if (n>4 && n%5==0) { 
			sum = n/5+"";
		} else if (n>7 && (n-3)%5==0) {
			sum = n/5+1+"";
		} else if (n>10 && (n-6)%5==0) {
			sum = n/5+1+"";
		} else if (n>13 && (n-9)%5==0) {
			sum = n/5+2+"";
		} else if (n>16 && (n-12)%5==0) {
			sum = n/5+2+"";
		} else if (n%3==0) {
			sum = n/3+"";
		} else {
			sum = "-1";
		}

		bw.write(sum);
		bw.flush();
		bw.close();
	}
}
