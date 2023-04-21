package study00.h20230413;

import java.util.Scanner;

public class Hw16 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a 값:"); int a = stdIn.nextInt();
		System.out.print("정수 b 값:"); int b = stdIn.nextInt();
		
		if (a == b)
			System.out.println();
		else {
			int min, max;
			
			if (a < b) {
				min = a;
				max = b;
			} else {
			min = b;
			max = a;
			}
			
			System.out.println("작은 값은 " + min + "입니다.");
			System.out.println("큰 값은 " + max + "입니다.");
			
		}
	}
}
