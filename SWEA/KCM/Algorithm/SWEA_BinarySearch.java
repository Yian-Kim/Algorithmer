/*

Algorithm : Binary Search
- 개요 : 이진 검색 알고리즘(binary search algorithm)은 오름차순으로 정렬된 리스트에서 특정한 값의 위치를 찾는 알고리즘이며, 
        처음 중간의 값을 임의의 값으로 선택하여, 그 값과 찾고자 하는 값의 크고 작음을 비교하는 방식을 채택하고 있다. 
        처음 선택한 중앙값이 만약 찾는 값보다 크면 그 값은 새로운 최고값이 되며, 작으면 그 값은 새로운 최하값이 된다.
- 예시문제 : 정렬된 정수배열에서 Binary Search를 이용하여 제시된 숫자들을 찾아라.
            있으면 해당 인덱스를 출력하고, 없으면 -1 를 출력하라. (2 ≤ M ≤ 100)

입력]

2 // # of test case T 
12 // # of element in array M 
5 // # of numbers to search N 
3 7 28 29 43 49 55 58 69 77 79 99 // sorted integer array 
8 49 58 44 7 // numbers to search 
7 
3 
3 4 5 6 7 8 9 
1 2 3

출력]

#1 -1 5 7 -1 1 
#2 -1 -1 0

*/

import java.util.Scanner;
 
class Solution {
     
    static final int MAX_M = 100;
 
    static int T;    // # of test case
    static int M;    // # of element in array
    static int N;    // # of numbers to search
    static int arr[];
 
    static void binarySearch(int[] arr, int low, int high, int target)
    {
        int mid;
        if (low > high) 
        {
            System.out.print("-1 ");
            return;
        }
 
        mid = (low + high) / 2;
 
        if (target < arr[mid])
        {
            binarySearch(arr, low, mid - 1, target);
        }
        else if (arr[mid] < target)
        {
            binarySearch(arr, mid + 1, high, target);
        }
        else
        {
            System.out.print(mid + " ");
            return;
        }
    }
 
    public static void main(String arg[]) throws Exception {
        Scanner sc = new Scanner(System.in);
         
        int T = sc.nextInt();
 
        for (int test_case = 1; test_case <= T; test_case++) 
        {
            System.out.print("#" + test_case + " ");
             
            M = sc.nextInt();
            N = sc.nextInt();
 
            arr = new int[M];
            for (int i = 0; i < M; i++)
            {
                arr[i] = sc.nextInt();
            }
 
            for (int i = 0; i < N; i++) 
            {
                int targetValue = sc.nextInt();
                binarySearch(arr, 0, M-1, targetValue);
            }
             
            System.out.println();
        }
         
        sc.close();
    }
}