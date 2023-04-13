package study00.h20230413;

import java.util.Scanner;

/*----------------------

작성자 		: 강철구
버전			: 1.0 version
함수 내용		: 조건연산자를 이용하여 더 큰값 찾기
최초 작성 날짜	: 23.04.13
마지막 수정 날짜	: 23.04.13
수정자			: 강철구

----------------------*/

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
