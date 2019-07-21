/*

Data Structure : Queue
- 개요 : Queue는 컴퓨터의 기본적인 자료 구조의 한가지로, 먼저 집어 넣은 데이터가 먼저 나오는 FIFO (First In First Out)구조로 저장하는 형식을 말한다.
- 예시문제 : 주어진 N(2<= N <=100)개의 수를 순서대로 Queue에 넣은 후 하나씩 꺼내 화면에 출력하시오.

입력]

2 // 테스트 케이스 수 
5 // 데이터 크기 
1 2 3 4 5 
5 
5 4 2 3 1

출력]

#1 1 2 3 4 5 
#2 5 4 2 3 1

*/

import java.util.Scanner;
 
class Solution {
 
    static final int MAX_N = 100;
 
    static int front;
    static int rear;
    static int queue[] = new int[MAX_N];
 
    static void queueInit()
    {
        front = 0;
        rear = 0;
    }
 
    static boolean queueIsEmpty()
    {
        return (front == rear);
    }
 
    static boolean queueIsFull()
    {
        if ((rear + 1) % MAX_N == front)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
 
    static boolean queueEnqueue(int value)
    {
        if (queueIsFull())
        {
            System.out.print("queue is full!");
            return false;
        }
        queue[rear] = value;
        rear++;
        if (rear == MAX_N)
        {
            rear = 0;
        }
 
        return true;
    }
 
    static Integer queueDequeue()
    {
        if (queueIsEmpty()) 
        {
            System.out.print("queue is empty!");
            return null;
        }
         
        Integer value = new Integer(queue[front]);
 
        front++;
        if (front == MAX_N)
        {
            front = 0;
        }
        return value;
    }
 
    public static void main(String arg[]) throws Exception {
        Scanner sc = new Scanner(System.in);
         
        int T = sc.nextInt();
 
        for (int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt();
 
            queueInit();
            for (int i = 0; i < N; i++)
            {
                int value = sc.nextInt();
                queueEnqueue(value);
            }
 
            System.out.print("#" + test_case + " ");
             
            while (!queueIsEmpty())
            {
                Integer value = queueDequeue();
                if (value != null)
                {
                    System.out.print(value.intValue() + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}