import java.util.*;

class Solution {
    public int[] solution(int[] A, int K) {
        int size = A.length;
        int[] result = new int[size];
        
        while (K-- > 0) {
            for (int i = 0; i < size-1; i++) {
                result[i+1] = A[i];
            }
            result[0] = A[size-1];
            System.arraycopy(result, 0, A, 0, size);
        }
        
        return result;
    }
}
