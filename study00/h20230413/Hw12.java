package study00.h20230413;

import java.util.Scanner;

public class Hw12 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a 값:"); int a = stdIn.nextInt();
		System.out.print("정수 b 값:"); int b = stdIn.nextInt();
	

//		int diff;
//		if (a>=b)
//			diff = a-b;
//		else
//			diff = b-a;
		
		int diff = a >= b ? a - b : b - a;
		
		System.out.println("두 값의 차는 " + diff + "입니다.");
		
	}

}
