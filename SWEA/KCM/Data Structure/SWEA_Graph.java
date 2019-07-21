/*

Data Structure : Graph
- 개요 : 컴퓨터 시스템에 그래프는 연결되어 있는 객체간의 관계를 표현할 수 있는 자료구조다.
- 예시문제 : 첫째 줄에는 V와 E의 갯수, 정점의 정보를 묻는 쿼리의 갯수가 주어지고 
            둘째 줄부터 간선의 정보(연결된 정점의 번호쌍)가 주어진다.
            그 다음 줄에는 정점의 인접정점들이 무엇인지 묻는 쿼리가 정점번호로 주어진다.
            정점의 번호는 0~V-1까지 이며, 간선정보는 오름차순으로 나열되어 주어진다. 또한 중복 간선은 존재하지 않는다. 
            입력으로 주어지는 쿼리의 정점에 인접한 정점들을 각 줄에 출력하라. 
            (2<=V<=100, 1<=E<=1000)

입력]

2 
6 7 3 // 정점갯수, 간선갯수 쿼리(질문)갯수 
0 1 // 간선정보 0 - 1 
0 2 
0 3 
1 2 
1 4 
3 4 
4 5 
0 // 쿼리(질문): 정점 번호 
2 
4 
9 10 3 
0 1 
0 2 
0 6 
1 3 
1 4 
1 7 
2 4 
4 5 
6 7 
7 8 
0 
1 
7

출력]

#1 
1 2 3 // 정점0에 인접한 정점리스트 
0 1 // 정점2에 인접한 정점리스트 
1 3 5 // 정점4에 인접한 정점리스트 
#2 
1 2 6 
0 3 4 7 
1 6 8

*/

import java.util.Scanner;
 
 
class Graph
{
     
    class AdjlistNode
    {
        int vertex;
        AdjlistNode next;
         
        public AdjlistNode(int v)
        {
            vertex = v;
            next = null;
        }
    }
     
    class AdjList
    {
        int num_members;
        AdjlistNode head;
        AdjlistNode tail;
         
        public AdjList()
        {
            num_members = 0;
            head = tail = null;
        }
    }
     
    int num_vertices;
    AdjList []adjListArr;
     
    public Graph(int n)
    {
        num_vertices = n;
        adjListArr = new AdjList[n];
        for (int i = 0; i < n; i++)
        {
            adjListArr[i] = new AdjList();
        }
    }
     
    void addEdge(int src, int dest)
    {
        AdjlistNode newNode = new AdjlistNode(dest);
        if (adjListArr[src].tail != null)
        {
            adjListArr[src].tail.next = newNode;
            adjListArr[src].tail = newNode;
        }
        else
        {
            adjListArr[src].head = adjListArr[src].tail = newNode;
        }
        adjListArr[src].num_members++;
         
        newNode = new AdjlistNode(src);
        if (adjListArr[dest].tail != null)
        {
            adjListArr[dest].tail.next = newNode;
            adjListArr[dest].tail = newNode;
        }
        else
        {
            adjListArr[dest].head = adjListArr[dest].tail = newNode;
        }
        adjListArr[dest].num_members++;
    }
     
    void display(int i)
    {
        AdjlistNode adjList = adjListArr[i].head;
        while (adjList != null)
        {
            System.out.printf("%d ", adjList.vertex);
            adjList = adjList.next;
        }
        System.out.printf("\n");
    }
}
     
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++)
        {
            int V = sc.nextInt();
            int E = sc.nextInt();
            int Q = sc.nextInt();
            Graph graph = new Graph(V);
            for (int i = 0; i < E; i++)
            {
                int sv = sc.nextInt();
                int ev = sc.nextInt();
                graph.addEdge(sv, ev);
            }
            System.out.printf("#%d\n", test_case);
            for (int i = 0; i < Q; i++)
            {
                int sv = sc.nextInt();
                graph.display(sv);
            }
        }
        sc.close();
    }
}