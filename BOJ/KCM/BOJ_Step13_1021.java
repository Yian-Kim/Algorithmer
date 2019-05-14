
/*

- 파일명 : BOJ_Step13_1021.java
- 작성자 : KCM
- 작성일자 : 2019.05.14.
- 문제 : BOJ 13단계 덱 사용하기
        1021번 회전하는 큐 (https://www.acmicpc.net/problem/1021)
        
---

- 출처 : https://mygumi.tistory.com/59

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] nm = bf.readLine().split(" ");
		String[] seq = bf.readLine().split(" ");
		int N = Integer.parseInt(nm[0]);
		CircleQueue q = new CircleQueue(N, seq);
		System.out.println(q.getCount());
		bf.close();
	}
}

class CircleQueue {
	private LinkedList<Integer> list = new LinkedList<Integer>();
	private int count = 0;
	private String[] seq;

	CircleQueue(int size, String[] seq) {
		for (int i = 1; i <= size; i++) {
			list.add(i);
		}
		this.seq = seq;
		start();
	}

	private void start() {
		int length = seq.length;
		for (int i = 0; i < length; i++) {
			int n = Integer.parseInt(seq[i]);
			operate(n);
		}
	}

	private void operate(int num) {
		while (true) {
			int pos = list.indexOf(num);
			int size = list.size();
			int left = pos;
			int right = size - pos - 1;
			if (left == 0) {
				list.remove(pos);
				break;
			}
			if (left <= right) { // 2번 연산 왼쪽으로 한칸 이동
				list.addLast(list.removeFirst());
				++count;
			} else { // 3번 연산 오른쪽으로 한칸 이동
				list.addFirst(list.removeLast());
				++count;
			}
		}
	}

	public int getCount() {
		return count;
	}
}
