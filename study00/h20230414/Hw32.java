package study00.h20230414;

import java.util.Scanner;

/*----------------------

작성자 		: 강철구
함수 내용		: do while 연습

버전			: 1.0 version
최초 작성 날짜	: 23.04.14
마지막 수정 날짜	: 23.04.14
마지막 수정자	: 강철구

----------------------*/

public class Hw32 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x;
		
		do {
			System.out.println("세 자리의 정숫값:");
			x = stdIn.nextInt();
		} while (x < 100 || x > 999); //  세자리수 아니면 반복
		
		System.out.println("입력한 값은 " +x+ "입니다.");

	}

}
