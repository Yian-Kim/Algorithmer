import java.util.*;

public class Solution {

   public int solution(String p, String s) {
      int answer = 13;
        int size = s.length();
        int pNum = 0;
        int sNum = 0;
        int[] rotate_arr = new int[s.length()];
        
        for (int i = 0; i < size; i++) {
            pNum = Integer.parseInt(p.split("")[i]);
            sNum = Integer.parseInt(p.split("")[i]);
            
            if (Math.abs(pNum - sNum) > 5) {
                if (pNum > 6 && sNum == 0) {
                    rotate_arr[i] = 10 - pNum;
                } else {  
                    rotate_arr[i] = 11 - pNum + sNum;
                }
            } else {
                rotate_arr[i] = Math.abs(pNum - sNum);
            }
        }
        
        for (int i = 0; i < size; i++) {
            answer += rotate_arr[i];
        }
        
      return answer;
   }
}
