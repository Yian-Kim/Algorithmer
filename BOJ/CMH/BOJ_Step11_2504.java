import java.util.Scanner;
import java.util.Stack;

public class Level11_stack_basic {
	
	static Scanner scan = new Scanner(System.in);
	static String[] temp = scan.nextLine().split("");
	static Stack<String> stack = new Stack<String>();
	
	public static void main(String[] args) {
		System.out.println(evaluate());
	}

	private static int evaluate() {
		
		int sum = 0, curr = 1;
		
		for (int i=0; i<temp.length; i++) {
			if (temp[i].equals("(")) {
				stack.push("(");
				curr  *= 2;
				System.out.println("case1");
			} else if (temp[i].equals("[")) {
				stack.push("[");
				curr  *= 3;
				System.out.println("case2");
			} else if (temp[i].equals(")")) {
				if (stack.empty() || !stack.peek().equals("(")) {
					System.out.println("case3_1");
					return 0;
				} else if (temp[i-1].equals("(")) {
					sum  += curr;
					stack.pop();
					curr /= 2;
					System.out.println("case3_2");
				}
			} else if (temp[i].equals("]")) {
				if (stack.empty() || !stack.peek().equals("[")) {
					System.out.println("case4_1");
					return 0;
				} else if (temp[i-1].equals("[")) {
					sum  += curr;
					stack.pop();
					curr /= 3;
					System.out.println("case4_2");
				}
			}
		}//for
		if (!stack.empty()) return 0;
		return sum;
	}
}
