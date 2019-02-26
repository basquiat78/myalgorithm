package algorithm.stack;

import java.util.Scanner;
import java.util.Stack;

// https://www.acmicpc.net/problem/10799
// 19964KB / 244ms
public class problem10799 {
	
	/*
	 * 인접하면 쇠막대기
	 * 인접하지 않으면 레이저
	 * 진짜 'stack을 사용해서 풀이'(앞의 올바른 괄호 문자열과 비슷하게 푼다.) 
	 * 
	 * ()가 나올때마다 스택에 들어있는 (의 갯수를 세어준다 
	 * 그런데, )가 나왔을때 이것이 레이저인지 쇠막대기 인지 구분해준다
	 * 레이저는 항상 ()와 같이 붙어진 상태로 나온다. 
	 * 스택에 (의 인덱스를 넣어서 인덱스가 1차이 나는지 확인.
	 *  
	 * 바로 top과 인접하면 pop을 해 뒤에 남은 스택만 센다(레이저의 경우).
	 * 인덱스가 1이상 차이나면 쇠막대기. 
	 */	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine().trim();
		int n = a.length();
		Stack<Integer> s = new Stack<Integer>();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			char c = a.charAt(i);
			
			// 여는 괄호 
			if(c == '(') {
				s.push(i);
				// 여는 괄호가 아닐 경우 
			} else {
				// stack의 위에 있는 객체를 본다. stack 맨위의 객체의 마지막 항목
				// stack의 top항목을 지우지 않고 불러오는것을 말한다.
				// why??
				if(s.peek()+1 == i) {
					// 레이저인 경우
					s.pop();
					ans += s.size();
				} else {
					// 쇠막대기인 경우 
					s.pop();
					ans += 1;
				}
			}
		}
		System.out.println(ans);
	}

}
