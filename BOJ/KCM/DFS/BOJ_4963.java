import java.util.Scanner;

public class Main {
    static int dx[] = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int dy[] = {-1, 0, 1, -1, 1, -1, 0, 1};

    static void dfs(int i, int j, int[][] square, boolean[][] check, int h, int w) {
        check[i][j] = true;

        for (int k=0; k<8; k++) {
            int x = i + dx[k];
            int y = j + dy[k];

            if (x >= 0 && y >= 0 && x < h && y < w) {
                if (square[x][y] == 1 && check[x][y] == false) {
                    dfs(x, y, square, check, h, w);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int w = sc.nextInt();
            int h = sc.nextInt();

            if (w ==0 && h ==0) { break; }

            int count = 0;
            int square[][] = new int[h][w];
            boolean check[][] = new boolean[h][w];

            for (int i=0; i<h; i++) {
                for (int j=0; j<w; j++) {
                    square[i][j] = sc.nextInt();
                }
            }

            for (int i=0; i<h; i++) {
                for (int j=0; j<w; j++) {
                    if (square[i][j] == 1 && check[i][j] == false) {
                        dfs(i, j, square, check, h, w);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
