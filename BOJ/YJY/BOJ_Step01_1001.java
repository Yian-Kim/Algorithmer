/*
- 파일명 : BOJ_Step01_1001.java
- 작성자 : YJY
- 작성일자 : 2019.05.23.
- 문제 : BOJ 1단계 입/출력 받아보기 
        1001번 A-B (https://www.acmicpc.net/problem/1001)
*/

import java.util.*;

public class Main{
    
    public static void main(String args[]) throws Exception{
        
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a-b);
    }
}
