

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");
		
		int n = Integer.parseInt(input[0]);
		int[][] a = new int[n+1][n+1];

		// 인접행렬 그리기
		int l = Integer.parseInt(input[1]);
		for (int i=1; i<=l; i++) {
			String[] line = scan.nextLine().split(" ");
			int x = Integer.parseInt(line[0]);
			int y = Integer.parseInt(line[1]);
			
			a[x][y] = 1;
			a[y][x] = 1;
		}
		
		
		// visited
		boolean[] visited = new boolean[n+1];
		boolean[] visited2 = new boolean[n+1];
		
		int node = Integer.parseInt(input[2]);
		
		// dfs, bfs 호출
		dfs(a, visited, node);
		System.out.println();
		bfs(a, visited2, node);
		
	}
	
	public static void dfs(int[][] a, boolean[] visited, int node) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(node);
		visited[node] = true;
		System.out.print(node + " ");
		
		while (!stack.isEmpty()) {

			int v = stack.peek();
			
			boolean isNone = true;
			
			for (int i=1; i<a.length; i++) {
				
				if (a[v][i] == 1 && !visited[i]) {
					stack.push(i);
					visited[i] = true;
					System.out.print(i + " ");
					isNone = false;
					break;
				}
			}
			
			if (isNone) stack.pop();
		}
	}
	
	public static void bfs(int[][] a, boolean[] visited, int node) {

		Queue<Integer> deque = new ArrayDeque<Integer>();
		
		deque.add(node);
		visited[node] = true;

		while (!deque.isEmpty()) {
			
			int v = deque.poll();
//			System.out.println("peek: " + deque.peek());
			visited[v] = true;
			System.out.print(v + " ");
			
			for (int i=1; i<a.length; i++) {
				
				if (a[v][i] == 1 && !visited[i]) {
					deque.add(i);
					visited[i] = true;
//					System.out.println();
//					System.out.println("add " + i );
				}
			}
		}

	}
}
