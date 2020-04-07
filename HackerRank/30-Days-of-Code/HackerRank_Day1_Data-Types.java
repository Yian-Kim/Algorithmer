import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int inputInteger = scan.nextInt();
        double inputDouble = scan.nextDouble();
        scan.nextLine();
        String inputString = scan.nextLine();

        System.out.println(i + inputInteger);

        System.out.println(d + inputDouble);

        System.out.println(s + inputString);

        scan.close();
    }
}
