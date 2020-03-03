
public class Main {

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int[][] map = new int [n][m];
        for(int i=0; i<n; i++) {
            String d[] = br.readLine().split(" ");
            for(int j=0; j<m; j++) {
                map[i][j] = Integer.parseInt(d[j]);
            }
        }

        int cnt = 0;
        int confirm = 0;
        while((confirm = count(map)) <= 1) {
            if(confirm == 0) {
                cnt = 0;
                break;
            }
            cnt++;
            minus(map);
        }

        System.out.println(cnt);
    }

    private static int count(int[][] map) {
        int cnt = 0;

        boolean[][] visit = new boolean[map.length][map[0].length];
        for(int i=0; i<map.length; i++) {
            for(int j=0; j<map[0].length; j++) {
                if(!visit[i][j] && map[i][j] != 0) {
                    dfs(map, visit, i, j);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private static void dfs(int[][] map, boolean[][] visit, int x, int y) {
        visit[x][y] = true;
        for(int k=0; k<4; k++) {
            int rx = x + dx[k];
            int ry = y + dy[k];
            if(rx >= 0 && rx < map.length && ry >= 0 && ry < map[0].length && !visit[rx][ry] && map[rx][ry] != 0) {
                dfs(map, visit, rx, ry);
            }
        }
    }

    private static void minus(int[][] map) {
        boolean[][] visit = new boolean[map.length][map[0].length];
        for(int i=0; i<map.length; i++) {
            for(int j=0; j<map[0].length; j++) {
                if(map[i][j] == 0) continue;
                visit[i][j] = true;
                int cnt = 0;
                for(int k=0; k<4; k++) {
                    int rx = i+dx[k];
                    int ry = j+dy[k];
                    if(rx >= 0 && rx < map.length && ry >= 0 && ry < map[0].length && !visit[rx][ry]) {
                        if(map[rx][ry] == 0) cnt++;
                    }
                }
                if(map[i][j]-cnt <= 0) map[i][j] = 0;
                else map[i][j] -= cnt;
            }
        }
    }
}