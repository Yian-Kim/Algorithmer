/*
비타알고] 04월 1주차: 숫자 블럭 쌓기 ★3

영재유치원에서 종호와 창현이가 숫자 블럭으로 재밌게 놀고 있습니다. 이렇게도 쌓아보고 저렇게도 쌓아보다가 슬슬 질린다고 생각하던 종호는 한 가지 재미있는 아이디어를 떠올렸습니다.

"창현아, 우리 재밌는 게임 해보지 않을래? 내가 x가 적힌 블럭을 쌓으면서 'add x'라고 말할게. 너는 적당한 때에 'remove'라고 말하면서 맨 위에 있는 블럭을 빼서 정리함에 쌓는거야."

"오, 그래. 재밌겠다. 한번 해보자!"

하지만 창현이는 정리함에 숫자가 뒤죽박죽 섞이는 것이 너무 싫었기 때문에, 블럭을 1부터 시작해서 N까지 순서대로 쌓아올리고 싶어합니다. 그래서 종호가 그 다음에 쌓을 블럭을 찾는 동안 지금까지 쌓은 블럭을 순서대로 바꿔 놓으려 합니다. 종호와 창현이의 대화 기록 한가지를 통해 어떤 형식으로 진행되는지 설명드리겠습니다.

위 그림은 3개의 블록을 add 1 -> remove -> add 2 -> add 3 -> remove -> remove, 총 6개의 대화과정을 거쳤을 때 블록이 쌓이는 방법에 대한 그림이니 참고하시기 바랍니다. 자, 여기서 정리함에 1부터 N까지 순서대로 블럭이 쌓이려면 창현이는 블럭의 순서를 최소 몇 번 바꾸어야 할까요?

입력]

첫째 줄에 블럭의 개수를 나타내는 정수 N이 주어집니다. (단, 1 <= N <= 300,000)

둘째 줄부터 2*N개의 줄에 걸쳐 "add" 혹은 "remove"로 시작하는 문자열이 주어집니다. "add"로 시작할 경우 그 뒤에 정수 x()가 주어지며, 이는 종호가 x가 적힌 숫자 블럭을 쌓았다는 뜻입니다. "remove"는 종호가 지금까지 쌓은 블럭에서 가장 위에 있는 블럭을 정리함으로 가져가 쌓는 것을 뜻하며, 블럭을 빼내기 전 쌓인 블록의 순서를 마음대로 바꿀 수 있습니다.

"add"와 "remove"는 각각 N번씩 등장함이 보장되며, N번의 "add" 뒤에 있는 정수 x는 모두 서로 다르고 "remove"할 때 숫자 블럭은 이미 한 개 이상 쌓여있음이 보장됩니다. 또한, 정리함에 1부터 N까지의 순서로 쌓을 수 있는 것도 역시 보장됩니다.

출력]

창현이가 정리함에 1부터 N까지 순서대로 쌓기 위해 블럭의 순서를 바꿔야 하는 최소 횟수를 출력합니다.
*/
/*
- 파일명 : Groom_Stack-number-blocks.java
- 작성자 : KCM
- 작성일자 : 2019.09.11.
- 문제 : 구름EDU 19년 04월 위클리 비타알고
        04월 1주차: 숫자 블럭 쌓기 ★3 (https://bit.ly/2m69dLQ)
- 난이도 : ★★☆☆☆
- 후기 : 이 문제를 풀면서 매우 "유레카"한 경험을 했다.
        최근 파이썬으로 문제를 풀었는데, 지원한 회사에서 파이썬이 지원언어가 아니기 때문에
		다시 자바로 알고리즘을 하게 되었다. 이 문제를 풀면서 느낀 점은 "모든 것을 구현할 필요가 없다"는 것이었다.

		1. 처음에는 블록의 맨 끝 값과 정리함 맨 끝 값+1을 비교하는걸로 생각했는데 
		블록은 1부터 순차적으로 정리함에 넣는다고 했으므로 idx로 제어하면 되는거라 정리함 순서가 필요 없어졌다.

		2. 들어온 값에 대해서만 판별하면 되므로 블록 순서 역시 필요없었다.

		3. 만약 정리함과 블록 순서까지 고려해서 코드를 짠다면 Timeout이 생길 것이다.

		처음에는 Timeout이 있었으나 All Clear한 코드이다.
*/

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		int count = 0;
		int idx = 1;

		for (int i = 0; i < 2 * N; ++i) {
			String input = br.readLine();
			String command = input.split(" ")[0];

			switch (command) {
			case "add":
				int X = Integer.parseInt(input.split(" ")[1]);
				stack.push(X);
				break;
			case "remove":
				if (!stack.isEmpty() && stack.peek() == idx) {
					stack.pop();
				} else if (!stack.isEmpty()) {
					count++;
					stack.clear();
				}
				idx++;
				break;
			}
		}
		br.close();
		System.out.print(count);
	}
}