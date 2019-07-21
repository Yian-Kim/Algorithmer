/*

Algorithm : Insertion Sort
- 개요 : 삽입 정렬은 자료 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여, 
        자신의 위치를 찾아 삽입함으로써 정렬을 완성하는 알고리즘이다.
- 예시문제 : 주어진 데이터를 Insertion Sort를 사용하여 정렬 하시오. 
            데이터의 최대 크기는 100이다.

입력]

1 // 전체 Test case 수 
5 // 데이터 크기 
1 4 5 2 3

출력]

#1 1 2 3 4 5

*/

import java.util.Scanner;
 
class Solution {
 
    static int input[];
    static int num;
 
    static void insertionSort()
    {
        for (int i = 1; i < num; i++)
        {
            int temp = input[i];
            int j = i - 1;
 
            while ((j >= 0) && (temp < input[j]))
            {
                input[j + 1] = input[j];
                j = j - 1;
            }
            input[j + 1] = temp;
        }
    }
 
    static void printResult()
    {
        int i;
 
        for (i = 0; i < num; ++i)
        {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }
 
    public static void main(String arg[]) throws Exception {
        Scanner sc = new Scanner(System.in);
 
        int T = sc.nextInt();
 
        for (int test_case = 1; test_case <= T; test_case++)
        {
            num = sc.nextInt();
             
            input = new int[num];           
            for (int i = 0; i < num; i++)
            {
                input[i] = sc.nextInt();
            }
 
            insertionSort();
 
            System.out.print("#" + test_case + " ");
            printResult();
        }
 
        sc.close();
    }
}