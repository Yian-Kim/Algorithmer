/*

- 파일명 : BOJ_Step16_2156.java
- 작성자 : KCM
- 작성일자 : 2019.05.14.
- 문제 : BOJ 16단계 동적 계획법 기초
        2156번 포도주 시식 (https://www.acmicpc.net/problem/2156)
---

- 점화식

d[1] = a[1];
d[2] = d[1] + a[2];
	for (int i = 3; i <= n; i++){
    d[i] = Max(d[i - 3] + a[i - 1] + a[i], d[i - 1], d[i - 2] + a[i]);
}//

- 출처 : https://bit.ly/2JjBDN0

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    static int a[]=new int[10001];
    static int d[][]=new int[10001][3];
    static int n;
    public static void main(String args[]) throws NumberFormatException, IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        
        for(int i = 1 ; i<= n; i++){
            a[i]=Integer.parseInt(br.readLine());
        }
        
        d[1][1]=a[1];
        
        for(int i = 2 ; i<= n ;i++){
            d[i][0]=Math.max(d[i-1][0], Math.max(d[i-1][1], d[i-1][2]));
            d[i][1]=a[i]+d[i-1][0];
            d[i][2]=a[i]+d[i-1][1];
        }
        
        System.out.println(Math.max(d[n][0], Math.max(d[n][1], d[n][2])));
    }
}
