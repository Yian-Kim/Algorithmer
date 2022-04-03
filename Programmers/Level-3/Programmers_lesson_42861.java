/**
 * 프로그래머스 Level 3 Lesson 42861 섬 연결하기
 * 코딩테스트 연습 > 코딩테스트 고득점 Kit > 탐욕법(Greedy) > 섬 연결하기
 * 문제 URL: https://programmers.co.kr/learn/courses/30/lessons/42861
 * <p>
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.33ms, 77.4MB)
 * 테스트 2 〉	통과 (0.34ms, 77.7MB)
 * 테스트 3 〉	통과 (0.35ms, 66.3MB)
 * 테스트 4 〉	통과 (0.35ms, 72.9MB)
 * 테스트 5 〉	통과 (0.64ms, 77.1MB)
 * 테스트 6 〉	통과 (0.44ms, 74.7MB)
 * 테스트 7 〉	통과 (0.71ms, 76.7MB)
 * 테스트 8 〉	통과 (1.21ms, 77.2MB)
 * <p>
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public int findParent(int[] parent, int node) {
        if (parent[node] == node)
            return node;
        return findParent(parent, parent[node]);
    }

    public void union(int[] parent, int node1, int node2) {
        int p1 = findParent(parent, node1);
        int p2 = findParent(parent, node2);

        if (p1 < p2)
            parent[p2] = p1;
        else
            parent[p1] = p2;
    }

    public int solution(int n, int[][] costs) {
        int answer = 0;
        int[] parent = new int[Math.max(n, costs.length)]; // n : 2 costs[0, 1, 1]인경우 대비

        for (int i = 0; i < parent.length; i++)
            parent[i] = i;
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });
        for (int i = 0; i < costs.length; i++) {
            if (findParent(parent, costs[i][0]) != findParent(parent, costs[i][1])) { // 사이클 판단
                answer += costs[i][2];
                union(parent, costs[i][0], costs[i][1]);
            }
        }
        return answer;
    }
}