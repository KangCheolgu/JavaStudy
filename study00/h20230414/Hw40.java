package study00.h20230414;

import java.util.Scanner;

/*----------------------

작성자 		: 강철구
함수 내용		: 자릿수 계산하기

버전			: 1.0 version
최초 작성 날짜	: 23.04.14
마지막 수정 날짜	: 23.04.14
마지막 수정자	: 강철구

----------------------*/

public class Hw40 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("양의 정숫값의 자릿수를 표시합니다.");
		int x;
		
		do {
			System.out.print("양의 정숫값:");
			x = stdIn.nextInt();
		} while (x <= 0);
		
		int digit = 0;
		while (x>0) {
			digit++;
			x /= 10;
		}
		System.out.println("입력한 숫자는 " + digit + "자리입니다.");
	}
}
