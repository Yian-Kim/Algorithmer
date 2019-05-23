import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex_11478 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		Set<String> set = new HashSet<String>();
		
		for(int i=0; i<input.length(); i++) {
			for (int j=i; j<input.length(); j++) {
				
				set.add(input.substring(i, j+1));
			}
		}
		System.out.println(set.size());
	}
}
http://blog.naver.com/PostView.nhn?blogId=ssarang8649&logNo=220988436553
