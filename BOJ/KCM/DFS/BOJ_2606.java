import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int node[][] = new int[102][102];
    static int visited[] = new int[102];
    static int count;

    public static void dfs(int n, int u) {
        count++;
        visited[u] = 1;

        for (int i=1; i<=n; i++) {
            if (visited[i] == 0 && node[u][i] == 1) {
                dfs(n, i);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        for (int i=0; i<k; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            node[a][b] = node[b][a] = 1;
        }
        dfs(n, 1);
        System.out.println(count - 1);
    }
}
