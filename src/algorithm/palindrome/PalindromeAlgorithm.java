package algorithm.palindrome;

import java.util.Scanner;

/**
 * 
 * created by basquiat
 * 
 * <pre>
 * 
 * What is Palindrom?
 * 
 * https://ko.wikipedia.org/wiki/%ED%9A%8C%EB%AC%B8
 * 
 * </pre>
 */
public class PalindromeAlgorithm {

	/**
	 * 입력한 단어가 palindrom인지 체크한다.
	 * 
	 * 맞으면 1을 아니라면 0을 리턴한다.
	 * 
	 * @param words
	 * @return int
	 */
	private static int isPalindrom(String words) {
		// 들어온 단어의 마지막 인덱스를 구한다.
		int fromEnd = words.length() - 1;

		// 방법은 다음과 같다. 
		// 1. 단어의 첫번째 char와 마지막 char를 비교한다.
		// 2. 반복문은 단어의 절반만 돌면 된다. 홀수의 단어의 경우에는 가운데 포함된 단어는 비교할 이유가 없다.
		//  --> 기본적인 에제에서 다음과 같은 단어인 level의 경우 v는 비교할 이유가 없기 때문이다.
		// 3. 첫번째 인덱스와 마지막 인덱스의 char를 비교한다. 반복문을 동해서 앞에서 우측으로 맨끝에서 좌측으로 하나씩 이동하면서 char를 비교하는 방법이다.
		// 4. 한번이라도 이 조건에 맞지 않으면 palindrom이 아니다.
		for(int fromStart = 0; fromStart < words.length() / 2; fromStart++, fromEnd--) {
			if(words.charAt(fromStart) != words.charAt(fromEnd)) {
				return 0;
			}
		}
		
		return 1;
	}
	
	public static void main(String[] args) {
		//String words = "level";
		//String words = "levels";
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("input words : ");
		String words = scanner.next();
		
		System.out.println(isPalindrom(words));
	}

}
