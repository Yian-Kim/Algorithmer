/*

- 파일명 : BOJ_Step01_11718.java
- 작성자 : KCM
- 작성일자 : 2019.05.04.
- 문제 : BOJ 1단계 입/출력 받아보기
        11718번 그대로 출력하기 (https://www.acmicpc.net/problem/11718)
- 난이도 : ★★☆☆☆
- 후기 : EOF에 대한 개념이 필요한 문제. 
        입력 시 엔터값의 영향을 받지 않으므로, 출력하려면 Ctrl+Z를 눌러야 함.
        이 사실을 몰라서 문제 푸는 데 헤맴.
        
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
 
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	ArrayList<String> list = new ArrayList<>();
    	String str = "";
    	
    	while((str = br.readLine()) != null) {

    			list.add(str);
    		
    	}
    	
    	for (int i=0; i<list.size(); i++) {
    		System.out.println(list.get(i));
    	}

    }
}