/*

- 파일명 : BOJ_Step04_9498.java
- 작성자 : KCM
- 작성일자 : 2019.04.25.
- 문제 : BOJ 4단계 if문 사용해보기
        9498번 시험 성적 (https://www.acmicpc.net/problem/9498)
- 난이도 : ★☆☆☆☆
- 후기 : 어려움없이 풀 수 있는 문제. 매우 쉬움.
        
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
 
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int grade = Integer.parseInt(br.readLine());

       if(grade >= 90 && grade <=100) {
    	   System.out.println("A");
       } else if(grade >= 80 && grade < 90) {
    	   System.out.println("B");
       } else if(grade >= 70 && grade < 80) {
    	   System.out.println("C");
       } else if(grade >=60 && grade < 70) {
    	   System.out.println("D");
       } else {
    	   System.out.println("F");
       }
    }
}