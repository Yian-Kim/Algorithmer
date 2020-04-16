import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N, M, ans;
    static int[][] map, copyMap;
    static ArrayList<int[]> virus;
    static boolean[] visit;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        map = new int[N][N];
        copyMap = new int[N][N];
        virus = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
                if (map[i][j] == 2)
                    virus.add(new int[] { i, j });
            }
        }
        ans = Integer.MAX_VALUE;
        visit = new boolean[virus.size()];
        combination(virus.size(), M, 0, 0);

        System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
    }

    static void combination(int n, int r, int start, int depth) {
        if (r == depth) {

            BFS();
            return;
        }
        for (int i = start; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                combination(n, r, i, depth + 1);
                visit[i] = false;
            }
        }
    }

    private static void BFS() {

        for (int i = 0; i < N; i++) {
            copyMap[i] = map[i].clone();
        }

        int[] dr = { 1, -1, 0, 0 };
        int[] dc = { 0, 0, 1, -1 };
        int time = 0;
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < visit.length; i++) {
            if (visit[i]) {
                copyMap[virus.get(i)[0]][virus.get(i)[1]] = 3;
                q.offer(new int[] { virus.get(i)[0], virus.get(i)[1], 0 });
            }
        }

        while (!q.isEmpty()) {
            int[] cur = q.poll();

            for (int k = 0; k < 4; k++) {
                int r = cur[0] + dr[k];
                int c = cur[1] + dc[k];

                if (range(r, c)) {
                    if (copyMap[r][c] == 0) {
                        if (time < cur[2] + 1)
                            time = cur[2] + 1;
                        copyMap[r][c] = 3;
                        q.offer(new int[] { r, c, cur[2] + 1 });
                    } else if (copyMap[r][c] == 2) {
                        copyMap[r][c] = 3;
                        q.offer(new int[] { r, c, cur[2] + 1 });
                    }
                }
            }

        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (copyMap[i][j] == 0)
                    return;
            }
        }

        if (ans > time) {
            ans = time;
        }
    }

    private static boolean range(int r, int c) {
        if (0 <= r && r < N && 0 <= c && c < N)
            return true;
        return false;
    }
}
