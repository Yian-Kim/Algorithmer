package queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class ex_10845 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = Integer.parseInt(scan.nextLine());
		Queue<Integer> deque = new ArrayDeque<Integer>();
		String command = "";
		int prev = 0;
		for (int i=0; i<n; i++) {
			command = scan.nextLine();
			
			if (command.startsWith("push")) {
				prev = Integer.parseInt(command.split(" ")[1]);
				deque.add(prev);
			} else if (command.equals("front")) {
				if (!deque.isEmpty()) {
					
					System.out.println(deque.peek());
				} else {
					System.out.println(-1);
				}
			} else if (command.equals("pop")) {
				if (!deque.isEmpty()) {
					
					System.out.println(deque.poll());
				} else {
					System.out.println(-1);
				}
			} else if (command.equals("empty")) {
				if (deque.isEmpty()) { 
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			} else if (command.equals("back")) {
				if (!deque.isEmpty()) {
					System.out.println(prev);
				} else {
					System.out.println(-1);
				}
			} else if (command.equals("size")) {
				System.out.println(deque.size());
			}
		}
	}
}
