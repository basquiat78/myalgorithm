package algorithm.stack;

import java.util.Scanner;

/**
 * 
 * created by basquiat
 * 
 * <pre>
 * 
 * 관련 문제는 백준 알고리즘에서 확인
 * 
 * https://www.acmicpc.net/problem/10828
 * 
 * </pre>
 */
public class StackAlgorithm {

	public static void main(String[] args) {

		/*
		 * 
		 * 째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다.
		 * 
		 * 1. 저 사이의 정수를 입력받는다.
		 * 2. 정수만큼 반복문을 돈다.
		 * 3. 반복문을 돌때마다 다음 명령어를 입력받는다.
		 *    - push X/pop/size/empty/top
		 *    - 정수를 스택에 넣는다/탑에 있는 정수를 뽑아서 출력한다 없으면 -1./스택에 쌓인 사이즈/스택 체크 (비어있으면 1, 아니면 0)/가장 위에 있는 정수를 출력만 한다. 없으면 -1
		 *  
		 *  
		 *  
		 * 자바 스펙을 이용하지 않을려면 전략이 필요하다.
		 * 
		 * 1. 스택을 구현할 배열을 선언한다.
		 * 2. 배열의 위치를 파악할 flag가 필요하다. 
		 *   - 인덱스는 0부터 시작한다. 따라서 최초 비어있는 스택의 위치 flag값은 -1로 설정해야한다.
		 * 
		 */
		
		// 1. 명령의 수를 입력받는다.
		System.out.print("input loop count : ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int loopCount = scanner.nextInt();
		
		// 1. 배열을 선언한다.
		//   - 당연히 배열의 크기는 loopCount
		int[] stack = new int[loopCount];
		
		// 2. top 위치 즉 스택의 최상위의 위치를 초기화 할 flag값을 설정한다.
		// - 기본값은 -1이다. 최초에는 비어있을 테니까
		int topOfStack = -1;

		// 3. 반복문을 돈다.
		for(int i=0; i<loopCount; i++) {
			// 4. 명령어 입력
			System.out.print("input command : ");
			String command = scanner.next();
			
			if(command.equals("push")) {
				// 5. push의 경우에는 정수를 입력받고 스택에 쌓는다.
				System.out.print("input INTEGER : ");
				int INTEGER = scanner.nextInt();
				// 6. topOfStack의 인덱스를 증가시킨다.
				topOfStack++;
				stack[topOfStack] = INTEGER;
				
			} else if(command.equals("pop")) {
				// 7. pop이라면 pop메소드를 통해서 출력하고 스택에서 뽑아낸다. 비어있다면 -1 출력
				// - 비어있는 것은 topOfStack을 통해서 체크할수 있다. 어떠한 스택도 쌓여잇지 않다면 topOfStack은 -1
				if(topOfStack == -1) {
					System.out.println(-1);
				} else {
					System.out.println(topOfStack == -1 ? -1 : stack[topOfStack]);
					// 8. 배열 사이즈를 줄여버린다. (remove)
					topOfStack--;
				}
				
			} else if(command.equals("size")) {
				// 9. 스택에 쌓여있는 사이즈 출력
				System.out.println(topOfStack + 1);
			
			} else if(command.equals("empty")) {
				// 10. 스택이 비어 있다면 1 아니라면 0
				System.out.println(topOfStack == -1 ? 1 : 0);
				
			} else if(command.equals("top")) {
				// 9. 스택에 샇여있는 최상위의 정수를 출력만 한다. 비어있다면 -1 출력
				System.out.println(topOfStack == -1 ? -1 : stack[topOfStack]);
				
			}
			
		}
	
	}
	
}
