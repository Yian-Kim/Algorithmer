import java.util.Scanner;
import java.util.Stack;

public class ex_9021 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		for (int i=0; i<n; i++) {
			
			Stack<String> stack = new Stack<String>();
			String line[] = scan.nextLine().split("");
			
			if (line[0].equals("(")) {
				stack.push(line[0]);
				
				for (int j=1; j<line.length; j++) {
					
					if(!stack.isEmpty()) {
						String prev = stack.peek();
						if(line[j].equals(prev)) {
							stack.push(line[j]);
						} else if (!line[j].equals(prev) && prev.equals("(")) {
							stack.pop();
						}
					} else {
						stack.push(line[j]);
					}
				}
				
				if (stack.isEmpty()) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
				
			} else {
				System.out.println("NO");
			}
		}
	}
}
