/*

- 파일명 : BOJ_11719.java
- 작성자 : KCM
- 작성일자 : 2019.05.04.
- 문제 : BOJ 11719번 그대로 출력하기2 
		(https://www.acmicpc.net/problem/11719)
- 난이도 : ★★☆☆☆
- 후기 : 11718번과 코드가 똑같음. 출력하려면 Ctrl+Z를 눌러야 함.
        
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