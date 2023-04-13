package study00.h20230413;

import java.util.Scanner;

/*----------------------

작성자 		: 강철구
버전			: 1.0 version
함수 내용		: 조건연산자를 사용하여 출력하기
최초 작성 날짜	: 23.04.13
마지막 수정 날짜	: 23.04.13
수정자			: 강철구

----------------------*/

public class Hw13 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a 값:"); int a = stdIn.nextInt();
		System.out.print("정수 b 값:"); int b = stdIn.nextInt();
		
		int diff = a >= b  ? a - b : b - a;
		
//		if (diff <= 10)
//			System.out.println("두 값의 차는 10 이하입니다.");
//		else
//			System.out.println("두 값의 차는 10 이하입니다.");

		System.out.println("두 값의 차는 " +(diff <= 10 ? "10이하" : "11이상")+ "입니다.");
		
	}

}
