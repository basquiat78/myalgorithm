package algorithm.stack;

import java.util.Scanner;
import java.util.Stack;

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
public class StackAlgorithmUsingJavaAPI {

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
		 * 자바 스펙을 이용하면 코드는 간결해진다.
		 */
		// 1. 스택 선언
		Stack<Integer> stack = new Stack<>();
		
		// 2. 명령의 수를 입력받는다.
		System.out.print("input loop count : ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int loopCount = scanner.nextInt();
		
		// 3. 반복문을 돈다.
		for(int i=0; i<loopCount; i++) {
			// 4. 명령어 입력
			System.out.print("input command : ");
			String command = scanner.next();
			
			if(command.equals("push")) {
				// 5. push의 경우에는 정수를 입력받고 스택에 쌓는다.
				System.out.print("input INTEGER : ");
				int INTEGER = scanner.nextInt();
				stack.push(INTEGER);
				
			} else if(command.equals("pop")) {
				// 6. pop이라면 pop메소드를 통해서 출력하고 스택에서 뽑아낸다. 비어있다면 -1 출력
				System.out.println(stack.isEmpty() ? -1 : stack.pop());
				
			} else if(command.equals("size")) {
				// 7. 스택에 쌓여있는 사이즈 출력
				System.out.println(stack.size());
				
			} else if(command.equals("empty")) {
				// 8. 스택이 비어 있다면 1 아니라면 0
				System.out.println(stack.isEmpty() ? 1 : 0);
				
			} else if(command.equals("top")) {
				// 9. 스택에 샇여있는 최상위의 정수를 출력만 한다. 비어있다면 -1 출력
				System.out.println(stack.isEmpty() ? -1 : stack.peek());
				
			}
			
		}
		
	}
	
}
