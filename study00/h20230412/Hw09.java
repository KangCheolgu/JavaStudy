package study00.h20230412;

import java.util.Scanner;

/*----------------------

작성자 		: 강철구
버전			: 1.0 version
함수 내용		: 3으로 나누고 나머지 구하기
최초 작성 날짜	: 23.04.12
마지막 수정 날짜	: 23.04.13
수정자			: 강철구

----------------------*/

public class Hw09 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값 :"); int a = stdIn.nextInt();
		
		if ( a > 0 )
			if ( a % 3 == 0 )
				System.out.println("이 값은 3으로 나누어집니다.");
			else if (a%3 == 1)
				System.out.println("이 값을 3으로 나눈 나머지는 1입니다.");
			else
				System.out.println("이 값을 3으로 나눈 나머지는 2입니다.");
		else
			System.out.println("음의 정숫값을 입력했습니다.");

	}

}
