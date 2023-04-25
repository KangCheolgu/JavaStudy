package study00.h20230425;

import java.util.Scanner;

public class Hw93 {

	// a, b, c 의 중간값 반환
	static int med3(int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 a : "); int a = scan.nextInt();
		System.out.print("정수 b : "); int b = scan.nextInt();
		System.out.print("정수 c : "); int c = scan.nextInt();
		
		System.out.println("중간값은 " + med3(a,b,c) + "입니다.");
	}

}
