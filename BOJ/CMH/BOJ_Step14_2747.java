import java.util.ArrayList;
import java.util.Scanner;

public class Lv14_fibonacci_number_2747_fibonacci_number {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		//초기화
		list.add(0);
		list.add(1);
		int index = 1;
		int f = 0;
		
		while (index < 10) {
			f = list.get(index) + list.get(index-1);
			list.add(f);
			index++;
		}
		System.out.println(list.get(index));
	}
}
