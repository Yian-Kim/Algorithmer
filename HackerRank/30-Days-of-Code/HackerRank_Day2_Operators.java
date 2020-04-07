import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double total_cost = 0;

        double d_tip_percent = Double.valueOf(tip_percent);
        double d_tax_percent = Double.valueOf(tax_percent);

        d_tip_percent = meal_cost * tip_percent * 0.01;
        d_tax_percent = meal_cost * tax_percent * 0.01;

        total_cost = meal_cost + d_tip_percent + d_tax_percent;
        total_cost = Math.round(total_cost);

        System.out.println((int) i_total_cost);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
