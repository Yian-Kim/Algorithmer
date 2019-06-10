import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ex_10828 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(reader.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<n; i++) {
			
			String line = reader.readLine();
			
			if (line.equals("top")) {
				if(!stack.isEmpty()) {
					System.out.println(stack.peek());
				} else {
					System.out.println(-1);
				}
			} else if(line.equals("pop")) {
				if(!stack.isEmpty()) {
					System.out.println(stack.pop());
				} else {
					System.out.println(-1);
				}
			} else if(line.equals("size")) {
				System.out.println(stack.size());
			} else if(line.equals("empty")) {
				
				if (stack.isEmpty()) {
					System.out.println(1);
				} else if(!stack.isEmpty()) {
					
					System.out.println(0);
				}
			} else if(line.startsWith("push")) {
				int numToPush = Integer.parseInt(line.split(" ")[1]); 
				stack.push(numToPush);
			}
		}
	}
}
