import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String str = "";
		int i, j;

		Set<String> hs = new HashSet<>();

		for(i=0; i<input.length(); i++){
			str = "";
			for(j=i; j<input.length(); j++){
				str += input.charAt(j);
				hs.add(str);
//				System.out.println("str: "+ str);
			}
//			System.out.println("-------------");
		}
		System.out.println(hs.size());
	}
}

// 참고 : https://blog.encrypted.gg/356
// - https://github.com/shfksekdrms2/BOJ/commit/55513450c52d06c0574e5fd8074c5e5310f64e70
// HashSet 개념 사용
