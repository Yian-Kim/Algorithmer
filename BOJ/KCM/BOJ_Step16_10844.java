/*

- 파일명 : BOJ_Step16_10844.java
- 작성자 : KCM
- 작성일자 : 2019.05.14.
- 문제 : BOJ 16단계 동적 계획법 기초
        10844번 쉬운 계단 수 (https://www.acmicpc.net/problem/10844)
        
---

- 점화식
D[N][L] = D[N-1][L-1] + D[N-1][L+1]

- 출처 : https://eddyplusit.tistory.com/21

*/

import java.util.Scanner;
 
public class Main {
    static int[][] d = new int[101][10];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i=1;i<=9;i++) d[1][i] = 1;
        //d[1][0] = 0;
        for(int i=2;i<=n;i++) {
            for(int j=0;j<=9;j++) {
                if(j-1>=0) d[i][j] += d[i-1][j-1];
                if(j+1<=9) d[i][j] += d[i-1][j+1];
                d[i][j] %= 1000000000;
            }
        }
 
        long sum = 0;
        for(int i=0;i<=9;i++) {
            sum += d[n][i];
        }
        System.out.println(sum%1000000000);
        scan.close();
    }
}
