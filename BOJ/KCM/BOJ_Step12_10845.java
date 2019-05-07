import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<Integer>();
		int N = scan.nextInt();
		
		for(int i=0; i<N; i++) {
		
			StringTokenizer token = new StringTokenizer(scan.nextLine());
			String str = token.nextToken(); // ** 오류나는 부분
			// error : frontException in thread "main" java.util.NoSuchElementException
			int n = 0; // push일 경우 큐에 연산할 정수 X를 저장할 변수
			
			if(token.countTokens() >=1) { // 토큰이 1개 이상이면(push X),
				n = Integer.parseInt(token.nextToken()); // 정수 X 저장
			}
			
			switch(str) {
				case "push": // 정수 X를 큐에 넣는 연산
					queue.add(n);
					break;
				case "pop" :
					if(str.isEmpty()) { // 큐에 정수가 있는지 검사
						System.out.println("-1"); // 큐가 비어있으면 -1 출력
					} else { // 큐에 정수가 있으면 가장 앞에 있는 정수 출력
						System.out.println(queue.poll());
					}
					break;
				case "size" :
					System.out.println(queue.size()); // 큐에 들어있는 정수의 개수 출력
					break;
				case "empty" :
					if(str.isEmpty()) { // 큐에 정수가 있는지 검사
						System.out.println("1"); // 큐가 비어있으면 1 출력
					} else {
						System.out.println("0"); // 아니면 0 출력 
					}
					break;
				case "front" :
					if(str.isEmpty()) { // 큐에 정수가 있는지 검사
						System.out.println("-1"); // 큐가 비어있으면 -1 출력
					} else {
						System.out.println(queue.peek()); // 큐에 정수가 있으면 가장 앞에 있는 정수 출력
					}
					break;
				case "back" :
					if(str.isEmpty()) { // 큐에 정수가 있는지 검사
						System.out.println("-1"); // 큐가 비어있으면 -1 출력
					} else { // 큐에 정수가 있으면 가장 뒤에 있는 정수 출력
						System.out.println(((LinkedList<Integer>) queue).get(queue.size()-1)); // 큐에 들어있는 개수에서 -1하면 마지막에 있는 정수가 나옴
					}
					break;
			}
		}
	}
}
