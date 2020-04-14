import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static class Marker {
        int id, r, c, d;

        Marker(int id, int r, int c, int d){
            this.id = id;
            this.r = r;
            this.c = c;
            this.d = d;
        }
    }

    static final int WHITE = 0;
    static final int RED = 1;
    static final int BLUE = 2;

    static Marker[] markers;
    static ArrayList<Integer>[][] map;
    static int[][] color;
    static int[][] dir = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};

    static int N, K;

    private static void game() {
        int times = 0;

        while(times <= 1000) {
            times++;

            for(int i = 1 ; i <= K ; ++i) {
                if(move(i)) {
                    System.out.println(times);
                    return;
                };
            }
        }
        System.out.println(-1);
    }

    private static boolean move(int i) {
        Marker now = markers[i];

        int nr = now.r + dir[now.d][0];
        int nc = now.c + dir[now.d][1];
        
        if(nr > N || nr < 1 || nc > N || nc < 1 || color[nr][nc] == 2) {
            changeDirection(now);
            nr = now.r + dir[now.d][0];
            nc = now.c + dir[now.d][1];
        }
        
        if(nr <= N && nr >= 1 && nc <= N && nc >= 1 && color[nr][nc] != 2) {
            actionByColor(now, nr, nc);
            if(map[nr][nc].size() >= 4) return true;
        }

        return false;
    }

    private static void actionByColor(Marker now, int nr, int nc) {
        ArrayList<Integer> from = map[now.r][now.c];
        ArrayList<Integer> to = map[nr][nc];
        
        int cpt = from.indexOf(now.id);

        int fromSize = from.size();
        int toSize = to.size();

        switch(color[nr][nc]) {
            case WHITE:
                for(int i = cpt ; i < fromSize ; ++i) {
                    int marker = from.get(i);
                    updateList(marker, nr, nc);
                    to.add(marker);
                }
                removeMarkers(from, fromSize - 1, cpt);

                break;
            case RED:
                for(int i = fromSize - 1 ; i >= cpt ; --i) {
                    int marker = from.get(i);
                    updateList(marker, nr, nc);
                    to.add(marker);
                }
                removeMarkers(from, fromSize - 1, cpt);
                break;
        }
    }

    private static void changeDirection(Marker marker) {
        if(marker.d % 2 == 0) {
            updateList(marker.id, marker.r, marker.c, marker.d + 1);
        } else {
            updateList(marker.id, marker.r, marker.c, marker.d - 1);
        }
    }

    private static void removeMarkers(ArrayList<Integer> list, int top, int bottom) {
        for(int i = top ; i >= bottom ; --i) {
            list.remove(i);
        }
    }

    private static void updateList(int marker, int nr, int nc) {
        markers[marker].r = nr;
        markers[marker].c = nc;
    }
    private static void updateList(int marker, int nr, int nc, int nd) {
        markers[marker].r = nr;
        markers[marker].c = nc;
        markers[marker].d = nd;
    }

    private static int stoi(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = stoi(st.nextToken());
        K = stoi(st.nextToken());

        color = new int[N + 1][N + 1];
        map = new ArrayList[N + 1][N + 1];
        markers = new Marker[K + 1];

        for(int r = 1 ; r <= N ; ++r) {
            st = new StringTokenizer(br.readLine());
            for(int c = 1 ; c <= N ; ++c) {
                color[r][c] = stoi(st.nextToken());
                map[r][c] = new ArrayList<>();
            }
        }

        for(int i = 1 ; i <= K ; ++i) {
            st = new StringTokenizer(br.readLine());
            int r = stoi(st.nextToken());
            int c = stoi(st.nextToken());
            int d = stoi(st.nextToken());
            markers[i] = new Marker(i, r, c, d - 1);
            map[r][c].add(i);
        }

        game();
    }
}
