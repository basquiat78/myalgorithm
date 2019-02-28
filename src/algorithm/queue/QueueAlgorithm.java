package algorithm.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 
 * created by basquiat
 * 
 * <pre>
 * 
 * 관련 문제는 백준 알고리즘에서 확인
 * 
 * https://www.acmicpc.net/problem/10845
 * 
 * </pre>
 */
public class QueueAlgorithm {

	public static void main(String[] args) {
		
		/* 
		 * 
		 * 째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다.
		 * 
		 * 1. 저 사이의 정수를 입력받는다.
		 * 2. 정수만큼 반복문을 돈다.
		 * 3. 반복문을 돌때마다 다음 명령어를 입력받는다.
		 *    - push/pop/size/empty/front/back
		 *    - 정수를 큐에 넣는다/큐의 헤드의 정수를 뽑아서 출력한다 없으면 -1./큐 사이즈 사이즈/큐 체크 (비어있으면 1, 아니면 0)/큐 가장 앞의 정수를 출력만 한다. 없으면 -1/큐 가장 뒤의 정수를 출력만 한다. 없으면 -1
		 * 
		 */
		
		// 1. 큐 선언
		// 일단 Queue는 Queue로 인스턴스하지 않네?????
		// 일단 찾아보니 reference --> https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html
		// LinkedList!
		Queue<Integer> queue = new LinkedList<>();
		
		// 2. 명령의 수를 입력받는다.
		System.out.print("input loop count : ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int loopCount = scanner.nextInt();
		
		// 3. 반복문을 돈다.
		for(int i=0; i<loopCount; i++) {
			// 4. 명령어 입력 e.g. push 10, push 15
			String inputValue = scanner.nextLine();
			String command = inputValue.split(" ")[0];
			
			if(command.contains("push")) {
				// 5. push의 경우에는 정수를 입력받고 큐에 밀어넣는다.
				int INTEGER = Integer.parseInt(inputValue.split(" ")[1]);
				queue.add(INTEGER);
				
			} else if(command.equals("pop")) {
				// 6. pop이라면 poll (stack과는 좀 다르다)메소드를 통해서 출력하고 큐에서 뽑아낸다. 비어있다면 -1 출력
				System.out.println(queue.isEmpty() ? -1 : queue.poll());
				
			} else if(command.equals("size")) {
				// 7. 큐 사이즈 출력
				System.out.println(queue.size());
				
			} else if(command.equals("empty")) {
				// 8. 큐가 비어 있다면 1 아니라면 0
				System.out.println(queue.isEmpty() ? 1 : 0);
				
			} else if(command.equals("front")) {
				// 9. 큐 헤드의 정수를 출력만 한다. 비어있다면 -1 출력
				//  - element()가 있는데 이건 비어있으면 에러 발생하는 녀석
				System.out.println(queue.isEmpty() ? -1 : queue.peek());
				
			} else if(command.equals("back")) {
				// 10. 큐의 마지막 정수를 출력 한다. 비어있다면 -1 출력
				if(queue.isEmpty()) {
					System.out.println(-1);
				} else {
					// 11. iterator가 있네???
					//  - 그럼 이걸 활용하자.
					Iterator<Integer> iterator = queue.iterator();
					Integer lastElement = iterator.next();
			        while(iterator.hasNext()) {
			            lastElement = iterator.next();
			        }

			        System.out.println(lastElement);
				
				}
				
			}
			
		}
		
	}
	
}
