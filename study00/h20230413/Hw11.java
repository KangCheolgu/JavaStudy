package study00.h20230413;

import java.util.Scanner;

public class Hw11 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("실수 a 값:"); double a = stdIn.nextDouble();
		System.out.print("실수 b 값:"); double b = stdIn.nextDouble();
		
//		double max;
//		
//		if (a>b)
//			max = a;
//		else
//			max = b;
//		
//		System.out.println("큰 쪽의 값은 " + max + "입니다.");
		
		double max = a > b ? a : b;
		System.out.println("큰 쪽의 값은 " + max + "입니다.");
		
	}

}
