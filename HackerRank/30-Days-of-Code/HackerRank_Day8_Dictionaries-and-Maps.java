import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (map.containsKey(s)) {
                String key = map.getKey();
                int value = map.getValue();
                System.out.println(key + "=" + value);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
