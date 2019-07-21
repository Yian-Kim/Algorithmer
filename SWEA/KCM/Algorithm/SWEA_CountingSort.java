/*

Algorithm : Counting Sort
- 개요 : 계수정렬(counting sort)는 항목들의 순서를 결정하기 위해 집합에 각 항목이 몇 개씩 있는지 세는 작업을 하면서 정렬하는 알고리즘이다
- 예시문제 : 주어진 정수들을 Counting Sort를 이용하여 정렬하고 오름차순으로 출력하라. (주어진 정수들은 중복가능)

입력]

2 // # of test case 
10 // # of data set 
0 2 9 4 5 1 0 7 3 9 
5 
4 9 5 1 3

출력]

#1 0 0 1 2 3 4 5 7 9 9 
#2 1 3 4 5 9

*/

import java.util.Scanner;
 
class Solution {
 
    static final int MAX_N = 100;
    static final int MAX_DIGIT = 10;
 
    static int N;  // # of data set
    static int arr[];
    static int cnt[] = new int[MAX_DIGIT];
    static int sortedArr[];
 
    static void calculateDigitNumber()
    {
        for (int i = 0; i < N; i++)
        {
            cnt[arr[i]]++;
        }
 
        for (int i = 1; i < MAX_DIGIT; i++)
        {
            cnt[i] = cnt[i-1] + cnt[i];
        }
    }
 
    static void executeCountingSort()
    {
        for (int i = N-1; i >= 0; i--)
        {
            sortedArr[--cnt[arr[i]]] = arr[i];
        }
    }
 
    public static void main(String arg[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
         
        int T = sc.nextInt();
 
        for (int test_case = 1; test_case <= T; test_case++) 
        {
            N = sc.nextInt();
             
            arr = new int[N];
            sortedArr = new int[N];
 
            for (int i = 0; i < N; i++)
            {
                arr[i] = sc.nextInt();
            }
 
            // initialize
            for (int i = 1; i < MAX_DIGIT; i++)
            {
                cnt[i] = 0;
            }
 
            calculateDigitNumber();
            executeCountingSort();
 
            //print the sorted digits
            System.out.print("#" + test_case + " ");
            for (int i = 0; i < N; i++) 
            {
                System.out.print(sortedArr[i] + " ");
            }
            System.out.println();
        }
         
        sc.close();
    }
}