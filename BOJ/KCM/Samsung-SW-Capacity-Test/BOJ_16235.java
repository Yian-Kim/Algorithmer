import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

 
public class Main {
    private static int[][] A;
    private static int N,K;
    private static PriorityQueue<pair> trees;
    private static int[][] Y;
    private static int[] dy = {-1,-1,-1,0,0,1,1,1};
    private static int[] dx = {-1,0,1,-1,1,-1,0,1};
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        A = new int[N + 1][N + 1];
        Y = new int[N + 1][N + 1];
 
        trees = new PriorityQueue<>();
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
                Arrays.fill(Y[i], 5); 
            }
        }
 
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken()); 
            trees.add(new pair(y, x, z));
        }

 
        treeInvestment();
        
        System.out.println(trees.size());
    }
 
    public static void treeInvestment() {
        ArrayList<pair> die = new ArrayList<>();
        ArrayList<pair> breed = new ArrayList<>();
        for (int year = 0; year < K; year++) {

            int tsize = trees.size();
            PriorityQueue<pair> newpq = new PriorityQueue<>();
            for (int i = 0; i < tsize; i++) {
            
                pair p = trees.poll();
                int py = p.y;
                int px = p.x;
 
                if (Y[py][px] < p.age) {
                    die.add(new pair(py,px,p.age));
                    continue;
                }
                
                Y[py][px] -= p.age; 
                newpq.add(new pair(py, px, p.age+1));
                
                if((p.age+1)%5==0) {
                    breed.add(new pair(py,px,p.age+1));
                }
            }
            trees = new PriorityQueue<>(newpq);
 

            for(pair p : die) {
                int py = p.y;
                int px = p.x;
                
                Y[py][px] += p.age/2;
            }
            die.clear();
        
            for(pair p : breed) {
                int py = p.y;
                int px=p.x;
                for(int i=0;i<8;i++) {
                    int ny = py+dy[i];
                    int nx = px+dx[i];
                    
                    if(ny<1 || ny>N || nx<1 || nx>N) continue;
                    
                    trees.add(new pair(ny,nx,1));
                }
            }
            breed.clear();

            for(int i=1;i<=N;i++) {
                for(int j=1;j<=N;j++) {
                    Y[i][j] += A[i][j];
                }
            }
        
        }
    
        return;
 
    }
 
    static class pair implements Comparable<pair> {
        int y;
        int x;
        int age;
        public pair(int y, int x, int age) {
            super();
            this.y = y;
            this.x = x;
            this.age = age;
        }
        @Override
        public int compareTo(pair o) {
            return this.age - o.age;
        }
    }
}
 
