import java.util.ArrayList;
import java.util.Scanner;

public class Level27_UseString {
	public static void main(String[] args) {
		m6_11478_diffrent_part_string_num();
	}

	private static void m6_11478_diffrent_part_string_num() {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
//		ArrayList<String> list = new ArrayList<>();
		int cnt = 0;
		for (int i=0; i<word.length(); i++) {
			ArrayList<String> ss = new ArrayList<>();
			for (int j=0; j<word.length()-i; j++) {
				String s = word.substring(j, j+i+1);
				//s와 같은 단어가 있는지 확인
				boolean flag = true;
				for (int k=0; k<ss.size(); k++) {
					if (ss.get(k).equals(s)) {
						flag = false;
						break;
					}
				}
				if (flag == true) {
					ss.add(s);
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
