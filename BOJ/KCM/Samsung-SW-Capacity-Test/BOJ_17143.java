import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;

public class Main17143 {
	static class Shark{
		int i, j, speed, dir, size;
		public Shark(int i, int j, int speed, int dir, int size) {
			this.i = i;
			this.j = j;
			this.speed = speed;
			this.dir = dir;
			this.size = size;
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = br.readLine().split(" ");
		int r = Integer.parseInt(str[0]);
		int c = Integer.parseInt(str[1]);
		int m = Integer.parseInt(str[2]);
		ArrayList<Shark> list = new ArrayList<Shark>();
		HashSet<Integer> hs = new HashSet<Integer>();
		int[] dx = {-1, 1, 1, -1};
		int di = 0;
		int dj = 0;
		int size = 0;
		int dir = 0;
		int speed = 0;
		int sumSize = 0;
		int[] sizeMap = new int[r*c];
		int[] dirMap = new int[r*c];
		int[] speedMap = new int[r*c];
		for(int i=0; i<m; ++i) {
			str = br.readLine().split(" ");
			di = Integer.parseInt(str[0])-1;
			dj = Integer.parseInt(str[1])-1;
			speed = Integer.parseInt(str[2]);
			dir = Integer.parseInt(str[3]);
			size = Integer.parseInt(str[4]);
			list.add(new Shark(di, dj, speed, dir, size));
		}
		int idx = 0;
		int minI = Integer.MAX_VALUE;
		Shark s = null;
		for(int j=0; j<c; ++j) {			
			hs.clear();
			idx = -1;
			minI = Integer.MAX_VALUE;
			
			for(int i=0; i<list.size(); ++i) {
				s = list.get(i);
				di = s.i;
				dj = s.j;
				speed = s.speed;
				dir = s.dir;
				size = s.size;
				if(dj == j && di < minI) {
					minI = di;
					idx = i;
				}

				if(dir == 1) {
					for(int k=0; k<speed; ++k) {
						di += dx[dir-1];
						if(di < 0 ) {
							dir = 2;
							di = 1;
						}else if(di >= r) {
							dir = 1;
							di = r-2;
						}
					}
				}else if(dir == 2){
					for(int k=0; k<speed; ++k) {
						di += dx[dir-1];
						if(di < 0 ) {
							dir = 2;
							di = 1;
						}else if(di >= r) {
							dir = 1;
							di = r-2;
						}
					}
				}else if(dir == 3) {
					for(int k=0; k<speed; ++k) {
						dj += dx[dir-1];
						if(dj < 0 ) {
							dir = 3;
							dj = 1;
						}else if(dj >= c) {
							dir = 4;
							dj = c-2;
						}
					}
				}else if(dir == 4) {
					for(int k=0; k<speed; ++k) {
						dj += dx[dir-1];
						if(dj < 0 ) {
							dir = 3;
							dj = 1;
						}else if(dj >= c) {
							dir = 4;
							dj = c-2;
						}
					}
				}
				s.i = di;
				s.j = dj;
				s.dir = dir;
				
			}
			for(int i=0; i<list.size(); ++i) {
				if(i == idx) {
					sumSize += list.get(i).size;
					continue;
				}
				s = list.get(i);
				di = s.i;
				dj = s.j;
				speed = s.speed;
				dir = s.dir;
				size = s.size;
				if(sizeMap[di*c+dj] < size) {
					sizeMap[di*c+dj] = size;
					dirMap[di*c+dj] = dir;
					speedMap[di*c+dj] = speed;
				}
				hs.add(di*c+dj);
			}
			list.clear();
			for(int value : hs) {
				di = value/c;
				dj = value%c;
				list.add(new Shark(di, dj, speedMap[di*c+dj], dirMap[di*c+dj], sizeMap[di*c+dj]));
				speedMap[di*c+dj] = 0;
				dirMap[di*c+dj] = 0;
				sizeMap[di*c+dj] = 0;
			}
		}
		bw.write(""+sumSize);
		bw.close();
		br.close();
	}

}
