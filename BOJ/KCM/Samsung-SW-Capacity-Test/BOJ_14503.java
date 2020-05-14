import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
 
public class Main {
 
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, 1, 0, -1 };
    static int N;
    static int M;
    static int count = 0;
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
 
        String[] str = br.readLine().split(" ");
 
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        str = br.readLine().split(" ");
        int start_x = Integer.parseInt(str[0]);
        int start_y = Integer.parseInt(str[1]);
        int start_dir = Integer.parseInt(str[2]);
 
        int[][] arr = new int[N][M];
 
        for (int i = 0; i < N; i++) {
            str = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }
        
        Search(arr, start_x, start_y, start_dir); 
        Check(arr);    
        System.out.println(count);
    }
 
    public static void Search(int[][] arr, int start_x, int start_y, int start_dir) {
        Queue<Dot> q = new LinkedList<Dot>();
        arr[start_x][start_y] = 9;
        q.add(new Dot(start_x, start_y, start_dir));
        while (!q.isEmpty()) {
            Dot d = q.poll();
            int currentX = d.x;    
            int currentY = d.y;   
            int currentD = d.dir;    
            Boolean flags = false;    
            int nextX;
            int nextY;
            int nextD;
 
            for (int i = 0; i < 4; i++) {
                currentD = (currentD + 3) % 4;
                nextX = currentX + (dx[currentD]); 
                nextY = currentY + (dy[currentD]);
 
                Dot nextDot = new Dot(nextX, nextY, currentD);
                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
                    continue;
                }

                if (arr[nextX][nextY] == 0) {
                    q.add(nextDot);
                    arr[nextX][nextY] = 9;
                    flags = true;
                    break;
                }
            }

            if (!flags) {
                nextD = (currentD + 2) % 4;
                nextX = currentX + dx[nextD];
                nextY = currentY + dy[nextD];

                if (arr[nextX][nextY] != 1) {
                    arr[nextX][nextY] = 9;
                    q.add(new Dot(nextX, nextY, currentD));
                }
            }
        }
    }

    public static void Check(int[][] arr) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 9)
                    count++;

            }
        }
    }
}
 
class Dot {
    int x;
    int y;
    int dir;
 
    Dot(int x, int y, int dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }
}
