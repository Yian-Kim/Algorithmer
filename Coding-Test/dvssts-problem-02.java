import java.util.*;

class Solution {
    public int[] solution(int[] snowballs) {
        int[] answer = {};
        List<Integer> leftSnowBalls = new ArrayList<>();
        List<Integer> rightSnowBalls = new ArrayList<>();
        int count = snowballs.length;
        
        for (int i = 0; i < count; i++) {
            if (snowballs[i] > 0) {
                leftSnowBalls.add(snowballs[i]);
            } else {
                rightSnowBalls.add(snowballs[i]);
            }
        }
        
        Collections.reverse(leftSnowBalls);
        count += 1;
        
        while (count > 0) {
            if (leftSnowBalls.size() == 0 || rightSnowBalls.size() == 0) {
                break;
            }
            
            if (leftSnowBalls.get(0) == Math.abs(rightSnowBalls.get(0))) {
                leftSnowBalls.remove(0);
                rightSnowBalls.remove(0);
                count -= 2;
            } else if (leftSnowBalls.get(0) > Math.abs(rightSnowBalls.get(0))) {
                rightSnowBalls.remove(0);
                count--;
            } else if (leftSnowBalls.get(0) < Math.abs(rightSnowBalls.get(0))) {
                leftSnowBalls.remove(0);
                count--;
            }
        }
        
        if (leftSnowBalls.size() > 0) {
            Collections.reverse(leftSnowBalls);
            answer = new int[leftSnowBalls.size()];
            answer = leftSnowBalls.stream().mapToInt(i->i).toArray(); 
        } else if (rightSnowBalls.size() > 0) {
            answer = new int[rightSnowBalls.size()];
            answer = rightSnowBalls.stream().mapToInt(i->i).toArray();
        }
    
        return answer;
    }
}
