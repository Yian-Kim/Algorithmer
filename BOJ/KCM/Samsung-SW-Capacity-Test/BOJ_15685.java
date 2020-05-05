import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int[] dy = { 0, -1, 0, 1 };
    static int[] dx = { 1, 0, -1, 0 }; 
    private static boolean[][] map;
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        map = new boolean[103][103];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
 
            bfs(x, y, d, g);
        }
 
        
        int ans =0;
        for(int i=0;i<100;i++) {
            for(int j=0;j<100;j++) {
                if(map[i][j]&&map[i+1][j]&&map[i][j+1]&&map[i+1][j+1]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
 
    }
 
    public static void bfs(int x, int y, int d, int generation) {
        Deque<Integer> now = new LinkedList<>();
 
        Deque<Integer> next = new LinkedList<>();
        map[y][x]=true;
        int ny = y+dy[d];
        int nx = x+dx[d];
        if(ny<0 || ny>100 || nx<0 || ny>100) return;
        map[ny][nx]=true;
        y=ny;
        x=nx;
        now.add(getNextdir(d));
        if(generation==0) return;
        int g = 0;
        while (!now.isEmpty()) {
            g++;
            int size = now.size();
 
                for(int i=0;i<size;i++) {
                    int dir = now.pop();
                    ny = y+dy[dir];
                    nx = x+dx[dir];
                    if(ny<0 || ny>100 || nx<0 || ny>100) break;
                    
                    map[ny][nx] = true;
                    
                    int nd = getNextdir(dir);
                    
                    next.push(nd);
                    next.add(dir);
                    y=ny;
                    x=nx;
            }
 
            if(g==generation) return;
            now.clear();
            now = new LinkedList<>(next);
            next.clear();
        }
 
    }
    public static int getNextdir(int d) {
        if(d==3) return 0;
        else return d+1;
    }
 
    static class pair {
        int y;
        int x;
        int dir;
 
        public pair(int y, int x, int dir) {
            super();
            this.y = y;
            this.x = x;
            this.dir = dir;
        }
    }
}
