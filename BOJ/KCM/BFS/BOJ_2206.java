import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    
    static class Place {
        int y;
        int x;
        int distance;
        int drill;
        
        public Place(int y, int x, int distance, int drill) {
            this.y = y;
            this.x = x;
            this.distance = distance;
            this.drill = drill;
        }
    }
    
    static int N, M, ans;
    static int[][] map, visit;
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};
    
    public static void bfs(int y, int x) {
        Queue<Place> queue = new LinkedList<>();
    
        queue.add(new Place(y, x, 1, 0));
        visit[y][x] = 0;
        
        while (!queue.isEmpty()) {
            Place place = queue.poll();
            
            if (place.y == N-1 && place.x == M-1) {
                ans = place.distance;
                break;
            }
            
            for (int i=0; i<4; i++) {
                int ny = place.y + dy[i];
                int nx = place.x + dx[i];
                
                if (ny < 0 || nx < 0 || ny >= N || nx >= M) { continue; }
                
                if (visit[ny][nx] <= place.drill) { continue; }
                
                if (map[ny][nx] == 0) {
                    visit[ny][nx] = place.drill;
                    queue.add(new Place(ny, nx, place.distance + 1, place.drill));
                } else {
                    if (place.drill == 0) {
                        visit[ny][nx] = place.drill + 1;
                        queue.add(new Place(ny, nx, place.distance + 1, place.drill + 1));
                    }
                }
            }
        }
    }
    
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");
        
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        
        map = new int[N][M];
        visit = new int[N][M];
        
        for (int i=0; i<N; i++) {
            str = br.readLine().split("");
            for (int j=0; j<M; j++) {
                map[i][j] = Integer.parseInt(str[j]);
                visit[i][j] = Integer.MAX_VALUE;
            }
        }
        
        ans = Integer.MAX_VALUE;
        
        bfs(0,0);
        
        if (ans == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}
