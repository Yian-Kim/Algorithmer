/*

- 파일명 : BOJ_Step03_15552.java
- 작성자 : KCM
- 작성일자 : 2019.07.13.
- 문제 : BOJ 3단계 for문
        15552번  (https://www.acmicpc.net/problem/15552)
- 난이도 : ★★☆☆☆
- 후기 : 이 문제는 Scanner와 System.out.println 대신 
		BufferedReader와 BufferedWriter를 사용하는 것이 핵심이다.
        bw.newLine이 안 먹혀서 오류남.
        
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		int arr[] = new int[T];

		for (int i = 0; i < T; i++) {
			String str = br.readLine();
			int A = Integer.parseInt(str.split(" ")[0]);
			int B = Integer.parseInt(str.split(" ")[1]);
			arr[i] = A + B;
		}
		br.close();
		
		for (int i = 0; i < T; i++) {
			bw.write(arr[i] + "\n");
		}
		bw.flush();
	}
}