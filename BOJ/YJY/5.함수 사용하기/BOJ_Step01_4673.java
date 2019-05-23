/*
- 파일명 : BOJ_Step01_4673.java
- 작성자 : YJY
- 작성일자 : 2019.05.23.
- 문제 : BOJ 1단계 함수 사용하기
        4673 셀프 넘버 (https://www.acmicpc.net/problem/4673)
*/
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String args[]) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//d(n)배열
		ArrayList<Integer> li = new ArrayList<Integer>();
		
		boolean loop = true;

		int cnt=1;
		
		//생성자 구하기
		while(loop) {

			//n
			String n = cnt + "";
			//d(n)
			int sum = 0;
			
			//d(n) 자기 자신 더해주기
			sum += cnt;
			
			//생성자가 있는 d(n) 구하기(각 자릿수 더해주기)
			for (int i=0; i<n.length(); i++) {
				sum += Integer.parseInt(n.substring(i, i+1)); 
			}
			
			//d(n)배열
			li.add(sum);
			
			//생성자가 없는 셀프 넘버 출력
			if(!li.contains(cnt)) {
				bw.write(cnt+"");
				bw.newLine();
			}
			//10000이 초과될 경우 루프탈출
			if(cnt>10000) {
				loop = false;
			}
			cnt++;
		}
		
		bw.flush();
		bw.close();
		
	}
}
