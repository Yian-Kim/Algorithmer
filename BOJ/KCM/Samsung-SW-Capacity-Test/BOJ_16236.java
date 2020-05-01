import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class Main {
    static int N, ans;
    static int[][] map;
    static int[] dy = { -1, 1, 0, 0 };
    static int[] dx = { 0, 0, -1, 1 };
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        int sy = -1, sx = -1;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 9) {
                    sy = i;
                    sx = j;
                }
            }
        } 
        bfs(sy, sx);
        System.out.println(ans);
    }
    
    
    public static void bfs(int sy, int sx) {
        int sharksize = 2;  
        int sharkeat = 0;
        Queue<pair> q = new LinkedList<>();
        ArrayList<pair> fish = new ArrayList<>();
        boolean[][] visit = new boolean[N][N];
        q.add(new pair(sy, sx));
        visit[sy][sx]=true;
 
        int time = 0;
        while (!q.isEmpty()) {
            
            int qSize = q.size();
            int y=-1, x=-1;
            for (int s = 0; s < qSize; s++) {
                
                pair p = q.poll();
                y = p.y;
                x = p.x;
                for (int i = 0; i < 4; i++) {
                    int ny = y + dy[i];
                    int nx = x + dx[i];
 
                    if (ny < 0 || ny > N - 1 || nx < 0 || nx > N - 1 || visit[ny][nx] || map[ny][nx]>sharksize)
                        continue;
                    
                    q.add(new pair(ny, nx));
                    visit[ny][nx] = true;
                    if(map[ny][nx]!=0 && map[ny][nx]<sharksize) { 
                        fish.add(new pair(ny,nx));
                    }
                }
            } 
            time++;
            
            if(fish.size()!=0) { 
                Collections.sort(fish); 
                pair meal = fish.get(0);
                fish.clear(); 
                sharkeat++;
                if(sharksize==sharkeat) {
                    sharksize++;
                    sharkeat=0;
                }
                
                map[sy][sx]=0; 
                sy=meal.y;
                sx=meal.x; 
                map[sy][sx] = 9;
                
                q.clear(); 
                q.add(meal);
                ans+=time; 
                time = 0; 
                for(int i=0;i<N;i++) { //visit initialize
                    Arrays.fill(visit[i], false);
                }
                visit[meal.y][meal.x]=true;
            }
            
        }
    }
 
 
    static class pair implements Comparable<pair> {
        int y;
        int x;
 
        public pair(int y, int x) {
            super();
            this.y = y;
            this.x = x;
        }
 
        @Override
        public int compareTo(pair o) {
            if (this.y == o.y) {
                return this.x - o.x;
            } else {
                return this.y - o.y;
            }
        }
    }
}
