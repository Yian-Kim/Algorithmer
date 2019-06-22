// 수정중

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main{
   public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      
      int N = Integer.parseInt(str.split(" ")[0]); //정점의 개수
      int M = Integer.parseInt(str.split(" ")[1]); //간선의 개수
      int V = Integer.parseInt(str.split(" ")[2]); //탐색을 시작할 정점 노드
      
      Graph g = new Graph(N);
      
      for(int i=0; i<M; i++) {
         int i1 = Integer.parseInt(str.split(" ")[0]);
         int i2 = Integer.parseInt(str.split(" ")[1]);
         
         g.addEdge(i1, i2);
      }
      
      g.dfs(V);
      g.bfs(V);
      
   }

}

class Graph {
   class Node {
      int data;
      boolean marked;
      LinkedList<Node> adjacent;
      
      Node(int data) {
         this.data = data;
         marked = false;
         adjacent = new LinkedList<Node>();
      }
   }
   
   Node[] nodes;
   
   Graph(int size) {
      nodes = new Node[size];
      
      for(int i=0; i<size; i++) {
         nodes[i] = new Node(i);
      }
   }
   
   void addEdge(int i1, int i2) {
      Node n1 = nodes[i1];
      Node n2 = nodes[i2];
      
      if(!n1.adjacent.contains(n2))
         n1.adjacent.add(n2);
      if(!n2.adjacent.contains(n1))
         n2.adjacent.add(n1);
   }
   
   void dfs(int v) {
      
      Node root = nodes[v];
      Stack<Node> stack = new Stack<>();
      stack.push(v);
      root.marked = true;
      
      while(!stack.isEmpty()) {
         Node r = stack.pop();
         
         for(Node n : r.adjacent) {
            if(n.marked == false) {
               n.marked = true;
               stack.push(n);
            }
         }
      }
      
   }
   
   void bfs(int v) {
      Queue<Integer> queue = new LinkedList<>();
      
   }
}
