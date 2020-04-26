import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 
public class BackJoon_17140 {
 
    static int rSize = 101;
    static int cSize = 101;
    static int[] countInfo = new int[101];
    static int[][] map = new int[rSize][cSize];
    static int r;
    static int c;
    static int k;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        r = sc.nextInt();
        c = sc.nextInt();
        k = sc.nextInt();
         
        rSize = 3;
        cSize = 3;
        for(int i=0; i<rSize; i++){
            for(int j=0; j<cSize; j++){
                map[i][j] = sc.nextInt(); 
            }
        }
         
        int t;
        for(t=0; t<=100; t++){
            if(map[r-1][c-1] == k){
                break;
            }
             
            LinkedList<MyInfo> list = new LinkedList<>();
             
            if(cSize >= rSize){
                int tmpRsize = 0;
                for(int i=0; i<cSize; i++){
                    for(int j=0; j<rSize; j++){
                        countInfo[map[i][j]]++;
                        map[i][j] = 0;
                    }
                    for(int z=1; z<countInfo.length; z++){
                        if(countInfo[z] != 0){
                            list.add(new MyInfo(z, countInfo[z]));
                        }
                    }
                    Collections.sort(list);
                     
                    int index = 0;  
 
                    for(MyInfo m : list){
                        map[i][index++] = m.number;
                        map[i][index++] = m.count;
                    }
                     
                    if(tmpRsize <= index){
                        tmpRsize = index;
                    }
                     
                    list.clear();
                    Arrays.fill(countInfo, 0);
                }
                rSize = tmpRsize;
         
            }else{

                int tmpCsize = 0;
                for(int i=0; i<rSize; i++){
                    for(int j=0; j<cSize; j++){
                        countInfo[map[j][i]]++;
                        map[j][i] = 0;
                    }
                    for(int z=1; z<countInfo.length; z++){
                        if(countInfo[z] != 0){
                            list.add(new MyInfo(z, countInfo[z]));
                        }
                    }
                    Collections.sort(list);
                     
                    int index = 0;
                                 
                    for(MyInfo m : list){
                        map[index++][i] = m.number;
                        map[index++][i] = m.count;
                    }
                     
                    if(tmpCsize <= index){
                        tmpCsize = index;
                    }
                     
                    list.clear();
                    Arrays.fill(countInfo, 0);
                }
                cSize = tmpCsize;
            }
 
        }
         
        if(t==101) t = -1;
        System.out.println(t);
         
         
    }
 
    static class MyInfo implements Comparable<MyInfo>{
        int number;
        int count;
         
        MyInfo(int number, int count){
            this.number = number;
            this.count = count;
        }
         
        @Override
        public int compareTo(MyInfo o) {
            if(this.count < o.count){
                return -1;
            }else if(this.count > o.count){
                return 1;   
            }else{
                if(this.number < o.number){
                    return -1;
                }else if(this.number > o.number){
                    return 1;
                }
            }
            return 0;
        }
         
    }
}
 
