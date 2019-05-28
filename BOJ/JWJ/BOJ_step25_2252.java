import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;

//class Node {
//	
//	int data;
//	ArrayList<Integer> nextNodes;
//	
//	public Node(int d) {
//		this.data = d;
//		this.nextNodes = new ArrayList<Integer>();
//	}
//}

public class ex_2252 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		
		String head = scan.nextLine();
		int n = Integer.parseInt(head.split(" ")[0]);
		int m = Integer.parseInt(head.split(" ")[1]);
		
		// 최종 정렬할 배열
		int[] sorted = new int[n];
		Node[] nodes = new Node[n+1];
		int[] nodesCount = new int[n+1];
		
		// graph 그리기: nodes 배열에 node 추가하기
		for (int i=0; i<m; i++) {
			String s = scan.nextLine();
			int p = Integer.parseInt(s.split(" ")[0]);
			int c = Integer.parseInt(s.split(" ")[1]);
			
			// 부모노드가 없을 때는 새로 만든다.
			if (nodes[p] == null) {
				
				Node node = new Node(p);
				nodes[p] = node;

				if (nodes[c] == null) {
					Node cNode = new Node(c);
					nodes[c] = cNode;
				}
				
				node.nextNodes.add(c);
			
			// 부모노드가 이미 있을 때는 새로 생성하면 안된다. 
			} else {
				
				if (nodes[c] == null) {
					Node cNode = new Node(c);
					nodes[c] = cNode;
				}
				
				nodes[p].nextNodes.add(c);
			}
			
			nodesCount[c] ++;
		}
		
//		for(int i=1; i<nodes.length; i++) {
//			System.out.print(i+":"+nodes[i].data);
//			
//			for (int j=0; j<nodes[i].nextNodes.size(); j++) {
//				System.out.print(" [" + nodes[i].nextNodes.get(j) + " ");
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<nodesCount.length; i++) {
//			
//			System.out.print(i + "," + nodesCount[i]);
//			System.out.println();
//		}
		
		
		LinkedList<Integer> que = new LinkedList<Integer>();

		for (int i=1; i<nodesCount.length; i++) {
			if (nodesCount[i] == 0) {
				que.add(i);
				
//				System.out.println("----------------------------");
//				System.out.println(i);
			}
		}
		

//		for (Node no : nodes) {
//			System.out.println("node.data node.nextnode");
//			System.out.print(no.data + ":");
//			for(int i=0; i<no.nextNodes.size(); i++) {
//				
//				System.out.print(no.nextNodes.get(i) + " ");
//			}
//			System.out.println();
//		}
//		System.out.println("---------while--------");
		int index = 0;
		while(!que.isEmpty()) {
			
			// 큐에서 꺼낸 노드를 최종 배열에 쌓는다
			Node node = nodes[que.poll()]; 
			sorted[index] = node.data;
//			System.out.println("poll(): " + node.data);
			index++;
			
			// 노드가 가리키는 자식 노드들의 count--;
			// 자식 노드들의 count == 0일 때 큐에 담는다
			for (int i=0; i<node.nextNodes.size(); i++) {
				int c = node.nextNodes.get(i);
				nodesCount[c] --;
				
				if (nodesCount[c] == 0) {
					que.add(c);
//					System.out.println("que.add(" + c + ")");
				}
			}
		}
		
		for (int i=0; i<sorted.length; i++) {
			System.out.print(sorted[i] + " ");
		}
		
		System.out.println();
		
	}
}


