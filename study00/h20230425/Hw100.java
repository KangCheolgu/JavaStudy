package study00.h20230425;

import java.util.Scanner;

public class Hw100 {
	static int min(int a, int b, int c) {
		
		int min = a;
		
		if (b < min)
			min = b;
		
		if (c < min)
			min = c;
		
		return min;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 a : "); int a = scan.nextInt();
		System.out.print("정수 b : "); int b = scan.nextInt();
		System.out.print("정수 c : "); int c = scan.nextInt();
		System.out.println("최솟값은 " + min(a,b,c) + " 입니다.");
	}

}
