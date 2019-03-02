package algorithm.print;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * created by basquiat
 * 
 * https://www.acmicpc.net/problem/11718
 *
 */
public class JustPrint {

	/**
	 * 엄청 단순한 문제인데 방법이 이거뿐인 듯 싶다.
	 * @param args
	 */
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		// 1. 출력할 단어의 배열을 선언한다.
        List<String> words = new ArrayList<>();

        // 2. 입력하는 단계에서 다음 입력 라인을 체크하기 위해 while문을 이용한다.
        while(scanner.hasNextLine()) {
        	// 입력된 단어를 체크한다. nextLine의 경우 한줄에 입력된 공백을 포함한 단어를 가져오기 위해서이다.
        	String word = scanner.nextLine();
        	// 3. 입력된 단어가 null이거나 비어있다면 엔터를 쳐서 끝낸 상황이라고 판단하고 while문에서 빠져나오기 위해 break를 건다.
            if(word == null || word.isEmpty()) {
                break;
            }
            // 4. 배열에 넣는다.
            words.add(word);
        }
        
        // 5. 제너릭으로 하나씩 출력하면 끝
        for(String word : words) {
            System.out.println(word);
        }
	}

}
