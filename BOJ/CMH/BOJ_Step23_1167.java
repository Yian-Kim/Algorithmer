import java.io.*;
import java.math.BigInteger;
import java.util.*;
 
public class Main {
 
	private static ArrayList<ArrayList<Vertex>> list = new ArrayList<ArrayList<Vertex>>();
    private static boolean[] visited = null;
    private static int d = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int V = Integer.parseInt(br.readLine());
        visited = new boolean[V+1];
        
        for(int i = 0; i <= V; i++)
            list.add(new ArrayList<Vertex>());
        
        for(int i = 1; i < V; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int sv = Integer.parseInt(st.nextToken());
            int ev = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            
            list.get(sv).add(new Vertex(ev, cost));
        }// input
        
        visited[1] = true;
        dfs(1);
        
        bw.write(d + "\n");
//        bw.flush();//남아있는 데이터를 모두 출력시킴
        bw.close();
        br.close();
    }
    
    // (1) 루트로부터 가장 멀리 떨어진 subTree 각각 두 개의 거리
    // (2) 같은 subTree 내에서의 두 개의 거리
    // sv와 가장 먼 정점의 dist 획득
    private static int dfs(int sv){
        
        int max1 = 0;    // 가장 먼
        int max2 = 0;    // 두번째로 먼
        
        for(int eIndex = 0; eIndex < list.get(sv).size(); eIndex++){
            Vertex vertex = list.get(sv).get(eIndex);
            
            // 방문
            if(visited[vertex.ev]) continue;
            
            visited[vertex.ev] = true;
            
            int dist = dfs(vertex.ev) + vertex.cost;
            
            // dist 가 제일 크면
            if (dist > max1) {
                max2 = max1;
                max1 = dist;
            }
            
            // dist 가 두번째로 크면
            else if (dist > max2) {
                max2 = dist;
            }
        }
        
        // 루트로부터 떨어진 두 개의 간선 합 => d
        d = Math.max(d, max1 + max2);
 
        return max1;
    }
}
 
class Vertex{
    int ev;
    int cost;
    
    public Vertex(int ev, int cost){
        this.ev = ev;
        this.cost = cost;
    }
}


