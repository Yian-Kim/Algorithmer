/*

Algorithm : Quick Sort
- 개요 : 퀵 정렬은 기준키(pivot)를 기준으로 작거나 같은 값을 지닌 데이터는 앞으로, 
        큰 값을 지닌 데이터는 뒤로 가도록 하여 작은 값을 갖는 데이터와 큰 값을 갖는 데이터로 분리해가며 정렬하는 방법이다.
- 예시문제 : 주어진 데이터를 Quick Sort를 사용하여 정렬 하시오. 데이터의 최대 크기는 100이다.

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
 
    static void quickSort(int first, int last)
    {
        int temp;       
        if (first < last)
        {
            int pivot = first;
            int i = first;
            int j = last;
 
            while (i < j)
            {
                while (input[i] <= input[pivot] && i < last)
                {
                    i++;
                }
                while (input[j] > input[pivot])
                {
                    j--;
                }
                if (i < j)
                {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
 
            temp = input[pivot];
            input[pivot] = input[j];
            input[j] = temp;
 
            quickSort(first, j - 1);
            quickSort(j + 1, last);
        }
    }
 
    static void printResult()
    {
        for (int i = 0; i < num; ++i)
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
 
            quickSort(0, num - 1);
             
            System.out.print("#" + test_case + " ");
            printResult();
        }
 
        sc.close();
    }
}