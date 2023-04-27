package study00.h20230427;

import java.util.Scanner;

public class Hw105 {
	
	static void putChars(char c, int n) {
		while (n-- > 0)
			System.out.println(c);
	}
	static void putStars(int n) {
		putChars('*', n);
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.println("단수는 : ");
		
		int n = scan.nextInt();
		for(int i = 1; i <= n; i++) {
			putStars(i);
			System.out.println();
		}
	}
}
