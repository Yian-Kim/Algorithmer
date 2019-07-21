/*

Data Structure : Hash
- 개요 : Hash table은 키를 값에 매핑할 수 있는 구조인, 연관 배열 추가에 사용되는 자료 구조이다. 
        Hash table은 Hash 함수를 사용하여 색인(index, Key)을 버킷(bucket)이나 슬롯(slot)의 배열로 계산한다.
- 예시문제 : 주어진 N개의 key, data쌍을 Hash table에 입력한 후, Q개의 key를 입력 받아 key에 해당하는 data를 각 줄에 출력하시오. 
            (1<=N, Q<=4096) 
            * Key : 최대 64개의 문자열 
            * Data : 최대 128개의 문자열

입력]

123123
123
23
4
serf

출력]

234
sdf
df
gd
cvb

*/

import java.util.Scanner;
 
 
class Hashtable
{
    class Hash {
        String key;
        String data;
    }
 
    int capacity;
    Hash tb[];
     
    public Hashtable(int capacity){
        this.capacity = capacity;
        tb = new Hash[capacity];
        for (int i = 0; i < capacity; i++){
            tb[i] = new Hash();
        }
    }
     
    private int hash(String str)
    {
        int hash = 5381;
         
        for (int i = 0; i < str.length(); i++)
        {
            int c = (int)str.charAt(i);
            hash = ((hash << 5) + hash) + c;
        }
        if (hash < 0) hash *= -1;
        return hash % capacity;
    }
     
    public String find(String key){
        int h = hash(key);
        int cnt = capacity;
        while(tb[h].key != null && (--cnt) != 0)
        {
            if (tb[h].key.equals(key)){
                return tb[h].data;
            }
            h = (h + 1) % capacity;
        }
        return null;
    }
     
    boolean add(String key, String data)
    {
        int h = hash(key);
        while(tb[h].key != null)
        {
            if (tb[h].key.equals(key)){
                return false;
            }
            h = (h + 1) % capacity;
        }
        tb[h].key = key;
        tb[h].data = data;
        return true;
    }
}
     
 
class Solution
{
    final static int MAX_TABLE = 4096;
     
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++)
        {
            Hashtable tb = new Hashtable(MAX_TABLE);
            int N = sc.nextInt();
            for (int i = 0; i < N; i++)
            {
                String k = sc.next();
                String d = sc.next();
                tb.add(k, d);
            }
            System.out.printf("#%d\n", test_case);
            int Q = sc.nextInt();
            for (int i = 0; i < Q; i++)
            {
                String k = sc.next();
                String d = tb.find(k);
                if (d != null)
                {
                    System.out.printf("%s\n", d);
                }
                else
                {
                    System.out.printf("not find\n");
                }
            }
        }
        sc.close();
    }
}