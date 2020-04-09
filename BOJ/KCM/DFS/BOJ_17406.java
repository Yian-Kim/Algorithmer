import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, m, k, answer = Integer.MAX_VALUE;
    static int map[][], copy_map[][], switching[][];
    static boolean visit[];

    public static void DFS(int count) {
        if (count + 1 == k) {
            for (int y=1; y<n; y++) {
                int res =0;
                for (int x=1; x<m; x++) {
                    res += copy_map[y][x];
                }
                answer = Math.min(answer, res);
            }
            return;
        }

        for (int index=1; index<k; index++) {
            if (!visit[index]) {
                visit[index] = true;
                make_copy_spares(index, 0);
                DFS(count+1);
                make_copy_spares(index, 1);
                visit[index] = false;
            }
        }
    }

    public static void make_copy_spares(int index , int back) {
        int starty = switching[index][0] - switching[index][2];
        int startx = switching[index][1] - switching[index][2];
        int endy = switching[index][0] + switching[index][2];
        int endx = switching[index][1] + switching[index][2];

        if (back == 1) {
            copy();
            int window_size = endx - startx;
            while (window_size >0) {
                int x = endx ; int y= starty;
                for(;x > startx; x--) copy_map[y][x-1] = map[y][x];
                for(;y < endy; y++ ) copy_map[y+1][x] = map[y][x];
                for(;x < endx; x++) copy_map[y][x+1] = map[y][x];
                for(;y > starty; y--) copy_map[y-1][x] = map[y][x];
                startx++ ; starty++ ;endx-- ; endy--;
                window_size -=2;
            }
            return;
        } else {
            copy();
            int window_size = endx - startx;
            while(window_size >0) {
                int x = startx ; int y= starty;
                for(;x < endx; x++) copy_map[y][x+1] = map[y][x];
                for(;y < endy; y++ ) copy_map[y+1][x] = map[y][x];
                for(;x > startx; x--) copy_map[y][x-1] = map[y][x];
                for(;y > starty; y--) copy_map[y-1][x] = map[y][x];
                startx++ ; starty++ ;endx-- ; endy--;
                window_size -=2;
            }
            return;
        }
    }

    public static void copy() {
        for(int y = 1 ; y < n ; y++) {
            for(int x = 1 ;x < m ; x++) {
                map[y][x] = copy_map[y][x];
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken())+1;
        m = Integer.parseInt(st.nextToken())+1;
        k = Integer.parseInt(st.nextToken())+1;
        map = new int[n][m];
        copy_map = new int[n][m];
        for(int y = 1 ;y < n ; y++) {
            st = new StringTokenizer(br.readLine());
            for(int x= 1 ; x< m ; x++) {
                map[y][x] = Integer.parseInt(st.nextToken());
                copy_map[y][x] = map[y][x];
            }
        }
        switching = new int[k][3]; // r c s 좌표저장
        for(int index = 1 ; index < k ; index++) {
            st = new StringTokenizer(br.readLine());
            switching[index][0] = Integer.parseInt(st.nextToken());
            switching[index][1] = Integer.parseInt(st.nextToken());
            switching[index][2] = Integer.parseInt(st.nextToken());
        }
        visit = new boolean[k];
        DFS(0);
        System.out.println(answer);

    }
}
