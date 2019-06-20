package queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class ex_11866 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		int n = Integer.parseInt(line.split(" ")[0]);
		int hop = Integer.parseInt(line.split(" ")[1]);
		
		Queue<Integer> deque = new ArrayDeque<Integer>();
		
		for (int i=1; i<=n; i++) {
			deque.add(i);
		}
		
		System.out.print("<");
		while(!deque.isEmpty()) {
			
			for(int j=0; j<hop-1; j++) {
				deque.add(deque.poll());
			}
			
			int toPrint = deque.poll();
			
			if (!deque.isEmpty()) {
				
				System.out.print(toPrint + ", ");
			} else {
				System.out.print(toPrint + ">");
				
			}
			
		}
		
	}
}
