/*

- 파일명 : BOJ_Step11_10828.java
- 작성자 : KCM
- 작성일자 : 2019.06.11.
- 문제 : BOJ 11단계 스택 사용하기 (기초)
        10828번 스택 (https://www.acmicpc.net/problem/10828)
- 난이도 : ★★☆☆☆
- 후기 : 조건에 맞는 연산을 구현하는 데에는 어려움이 없었으나, 입력값을 받는 것부터가 어려웠다. 
        push X의 경우 push를 담을 배열과 X를 담을 변수를 고민했는데, split을 사용하면 되는 문제였다.
        다른 명령어는 띄어쓰기 없이 쓰이므로 오류가 날 것이라 생각했지만
        command[0]에는 명령어가 담기고 command[1]에는 띄어쓰기 기준으로 정수가 담겼다.
        nextInt() 다음에 nextLine()을 사용할 경우 개행문자(엔터, newline)을 제거하지 않는다는 문제점을 간과했다.
        마지막 출력값이 나오지 않아 헤매었는데, 다행히 변수 N을 Integer로 형변환하여 입력받으니 문제를 해결할 수 있었다.
        
*/

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		Scanner scan = new Scanner(System.in);

		int N = Integer.parseInt(scan.nextLine()); // 주어지는 명령수

		for (int i = 0; i < N; i++) {

			String str = scan.nextLine(); // 라인 단위 입력

			String command[] = str.split(" "); // command 배열에 명령어 스플릿

			switch (command[0]) { // 명령어

			case "push": // 정수 X를 스택에 넣는 연산
				int num = Integer.parseInt(command[1]); // push 일 때 숫자는 배열[1]로 처리
				stack.push(num);
				break;

			case "pop":
				if (stack.isEmpty()) { // 스택에 들어있는 정수가 없는 경우에는 -1을 출력
					System.out.println(-1);
				} else { // 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력
					System.out.println(stack.pop());
				}
				break;

			case "size": // 스택에 들어있는 정수의 개수를 출력
				System.out.println(stack.size());
				break;

			case "empty": // 스택이 비어있으면 1, 아니면 0을 출력
				if (stack.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;

			case "top":
				if (stack.isEmpty()) { // 스택에 들어있는 정수가 없는 경우에는 -1을 출력
					System.out.println(-1);
				} else { // 스택의 가장 위에 있는 정수를 출력
					System.out.println(stack.peek());
				}
				break;

			} // End of switch
		} // End of for
	} // End of main
} // End of class