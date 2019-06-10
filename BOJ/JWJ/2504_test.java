import java.util.Scanner;
import java.util.Stack;

public class ex_2504 {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		String[] list = scan.nextLine().split("");
		Stack<String> stack = new Stack<String>();
		
		int result = 0;
		 
		boolean legit = true;
		for (int i=0; i<list.length; i++) {
			String top = stack.peek(); 
			if (list[i].equals("(") || list[i].equals("[")) {
				
				stack.push(list[i]);
			} else if (top.equals("(") && list[i].equals(")")) {
				stack.pop();
				stack.push("2");
			} else if (top.equals("[") && list[i].equals("]")) {
				stack.pop();
				stack.push("3");
			} else {
				System.out.println(0);
				legit = false;
				break;
			}
		}
		
		if (legit) {
			
			boolean hasparam = true;
			
			while (hasparam) {
				
			}
		}
		
		
	}
}
