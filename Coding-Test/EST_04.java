import java.util.*;

public class Main {
    public static void main(String args[]) {
        String A = "John Doe; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker";
        String C = "Example";
        Solution s = new Solution();
        System.out.println(s.solution(A, C));
    }
}

class Solution {
    public String solution(String S, String C) {
        List<String> names = Arrays.asList(S.split("; "));
        String[] id = new String[names.size()];
        String result = "";
        C = C.toLowerCase();

        for (int i=0; i<names.size(); i++) {
            String str = names.get(i);

            int index = str.indexOf(" ");
            String firstName = str.substring(0,index).toLowerCase();

            index = str.lastIndexOf(" ");
            String lastName = str.substring(index+1).toLowerCase();

            id[i] = lastName+"_"+firstName;
            id[i] = id[i].replaceAll("-", "");
        }

        Map<String, Integer> ids = new HashMap<String, Integer>();

        for (int i=0; i<id.length; i++) {
            if (ids.containsKey(id[i])) {
                ids.put(id[i], ids.get(id[i]) + 1);
            } else {
                ids.put(id[i], 1);
            }
        }

        for (int i=0; i<id.length; i++) {
            if (ids.get(id[i]) > 1) {
                ids.put(id[i], ids.get(id[i]) - 1);
                String num = Integer.toString(ids.get(id[i]) - (ids.get(id[i]) - 1));

                if (!num.equals("1")) { id[i] += num; }
            }

            result += names.get(i) + " <" + id[i] + "@" + C + ".com>; ";
        }

        return result;
    }
}
