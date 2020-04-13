import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    static int[][] map = new int[101][101];
    static int[][] dist = new int[101][101];

    static final int[] dRow = {0, -1, 0, 1};
    static final int[] dCol = {-1, 0, 1, 0};

    static final int INF = 1000000;

    static {
        for (int i = 0; i < 101; i++) {
            Arrays.fill(dist[i], INF);
        }
    }

    public static void solve(int n, int m) {
        PriorityQueue<Node> queue = new PriorityQueue<>();

        queue.add(new Node(1, 1, 0));
        dist[1][1] = 0;

        while (!queue.isEmpty()) {
            Node u = queue.poll();

            if (u.row == n && u.col == m) {
                System.out.println(u.cost);
                break;
            }

            if (dist[u.row][u.col] < u.cost) {
                continue;
            }

            for (int i = 0; i < 4; i++) {
                int nextRow = u.row + dRow[i];
                int nextCol = u.col + dCol[i];

                if (nextRow <= 0 || nextRow > n || nextCol <= 0 || nextCol > m) {
                    continue;
                }

                if (dist[nextRow][nextCol] > dist[u.row][u.col] + map[nextRow][nextCol]) {
                    dist[nextRow][nextCol] = dist[u.row][u.col] + map[nextRow][nextCol];
                    queue.add(new Node(nextRow, nextCol, dist[nextRow][nextCol]));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        int N, M;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            String lineInfo = br.readLine();

            for (int j = 1; j <= M; j++) {
                map[i][j] = lineInfo.charAt(j - 1) - '0';
            }
        }

        solve(N, M);
    }
}

class Node implements Comparable<Node> {
    int row;
    int col;
    int cost;

    Node(int row, int col, int cost) {
        this.row = row;
        this.col = col;
        this.cost = cost;
    }

    @Override
    public int compareTo(Node o) {
        return this.cost < o.cost ? -1 : 1;
    }
}
