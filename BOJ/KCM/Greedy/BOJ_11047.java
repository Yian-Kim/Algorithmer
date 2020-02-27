import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new InputStreamReader(System.in));

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int count =0;

        for(int i = N-1; i>=0; i--){
            if(M >= arr[i]){
                count += M / arr[i];
                M = M % arr[i];
            }
        }
        System.out.println(count);
    }
}