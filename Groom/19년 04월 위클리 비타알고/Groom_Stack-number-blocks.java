// 04월 1주차: 숫자 블럭 쌓기 ★3
// 코드 수정중입니다.

import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> block = new ArrayList<Integer>();
		ArrayList<Integer> box = new ArrayList<Integer>();
		int count = 0;
			
		for (int i=0; i<2*N; i++){
			String input = br.readLine();
			String command = input.split(" ")[0];
			
			switch(command){
				case "add":
					int X = Integer.parseInt(input.split(" ")[1]);
					block.add(X);	
					break;
				case "remove":
					int popNum = block.get(block.size()-1);
					
					if (popNum == 1){
						box.add(block.get(0));
						block.remove(block.get(0));
					} else {
						int minNum = Collections.min(block);
						if (minNum != popNum){	
							Collections.reverse(block);
							System.out.println(minNum);
							count++;
						}
					}
					box.add(popNum);
					block.remove(block.size()-1);
					break;
			}
		}
		br.close();
		System.out.print(count);
	}
}