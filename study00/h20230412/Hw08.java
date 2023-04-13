package study00.h20230412;

import java.util.Scanner;

/*----------------------

작성자 		: 강철구
버전			: 1.0 version
함수 내용		: 10의 배수 판별하기
최초 작성 날짜	: 23.04.12
마지막 수정 날짜	: 23.04.13
수정자			: 강철구

----------------------*/

public class Hw08 {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값 :"); int a = stdIn.nextInt();
		
		if ( a > 0 )
			if ( a % 10 ==0 )
				System.out.println("이 값은 10의 배수입니다.");
			else
				System.out.println("이 값은 10의 배수가 아닙니다.");
		else
			System.out.println("음의 정숫값을 입력했습니다.");
	}

}
