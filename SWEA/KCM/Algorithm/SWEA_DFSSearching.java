/*

Algorithm : DFS Searching
- 개요 : 깊이 우선 탐색은 맹목적 탐색방법의 하나로 한 노드를 시작으로 인접한 다른 노드를 재귀적으로 탐색해가고 
        끝까지 탐색하면 다시 위로 와서 다음을 탐색하여 검색한다.
- 예시문제 : 숫자가 있는 원은 정점(Vertex)라고 하고, 정점과 정점을 잇는 연결선을 간선(Edge)이라고 한다. 
            정점의 최대 개수는 30개이다. 정점과 정점의 연결관계가 인접행렬로 주어졌을 때, 
            DFS를 이용하여 시작 정점으로부터 모든 정점을 탐색한 결과를 순서대로 화면에 출력하시오.

입력]

1 //test case 개수 
8 1 // 정점의 개수, 시작 정점 
1 2 // 정점 간 연결 관계. 1과 2가 연결 
1 3 
2 4 
2 5 
4 8 
5 8 
3 6 
3 7 
6 8 
7 8 
-1 -1 // 입력 끝

출력]

#1 1 2 4 8 5 6 3 7 // 방문한 정점 순서

*/

import java.util.Scanner;
 
class Solution {
 
    static final int MAX_VERTEX = 30;
 
    static int vertex;
    static int map[][] = new int[MAX_VERTEX][MAX_VERTEX];
    static int visit[] = new int[MAX_VERTEX];
 
    static void depthFirstSearch(int v)
    {
        visit[v] = 1;
        for (int i = 1; i <= vertex; i++)
        {
            if (map[v][i] == 1 && visit[i] == 0)
            {
                System.out.printf("%d ", i);
                depthFirstSearch(i);
            }
        }
    }
 
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
         
        int T = sc.nextInt();
 
        for (int test_case = 1; test_case <= T; test_case++)
        {
            vertex = sc.nextInt();
            int start = sc.nextInt();
 
            map = new int[MAX_VERTEX][MAX_VERTEX];
            visit = new int[MAX_VERTEX];
             
            while (true)
            {
                int v1 = sc.nextInt();
                int v2 = sc.nextInt();
                if (v1 == -1 && v2 == -1)
                {
                    break;
                }
                map[v1][v2] = map[v2][v1] = 1;
            }
            System.out.printf("#%d ", test_case);
            System.out.printf("%d ", start);
            depthFirstSearch(start);
            System.out.printf("\n");
        }
 
        sc.close();
    }
}