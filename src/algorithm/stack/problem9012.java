package algorithm.stack;

import java.util.Scanner;

// stack -> last in first out!
// 괄호 문자열 체크 문제 => https://www.acmicpc.net/problem/9012 
// 메모리 : 14684KB	시간 : 116ms
public class problem9012 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while(n-- > 0) {
			System.out.println(isValid(sc.nextLine()));
		}
	}

	public static String isValid(String s) {
		
		s = s.trim();
		int n = s.length();
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if(s.charAt(i) == '(') {
				cnt += 1;
			} else {
				cnt -= 1;
			}
			
			// 남은 괄호가 존재 
			if(cnt < 0 ) {
				return "NO";
			}
		}

		if(cnt == 0) {
			// stack이 비어있음
			return "YES";
		} else {
			// stack이 비어있지 않음
			return "NO";	
		}
	}
	 
	
	
}
