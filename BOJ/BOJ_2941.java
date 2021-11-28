import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] array = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int count = result(str, 0, array);

        System.out.println(count);
    }

    public static int result(String str, int count, String[] array) {

        if (str.length() == 0) {
            return count;
        }

        int matchCount = Arrays.stream(array).filter(arr -> arr.length() <= str.length())
                .filter(str::startsWith).map(String::length).findFirst().orElse(1);

        return result(str.substring(matchCount), count + 1, array);
    }


}