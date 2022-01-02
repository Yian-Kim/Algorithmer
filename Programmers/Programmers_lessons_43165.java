class Solution {
    static int answer;

    // 3. dfs(numbers, target, idx:몇 번째 인덱스인지, sum: idx까지 누적된 값).
    public void dfs(int[] numbers,int target,int idx,int sum){
        // 4. 모든 정수를 탐색했을 때,
        if(idx == numbers.length){
            // 5. 누적합이 target과 동일하면 answer++ 후 메소드 종료.
            if(sum == target) answer++;
            return;
        }

        // 6. 현재 인덱스의 정수를 +로 합해준다.
        sum+=numbers[idx];
        // 7. 다음 인덱스 dfs 수행.
        dfs(numbers,target,idx+1,sum);
        // 8. 6.의 값을 다시 빼준 뒤,
        sum-=numbers[idx];
        // 9. 현재 인덱스의 정수를 -로 합해준다.
        sum+=(-1 * numbers[idx]);
        // 10. 다시 다음 인덱스 dfs 수행.
        dfs(numbers,target,idx+1,sum);

    }

    public int solution(int[] numbers, int target) {
        // 1. answer은 전역변수로 선언.
        answer = 0;

        // 2. dfs수행.
        dfs(numbers,target,0,0);

        return answer;
    }
}