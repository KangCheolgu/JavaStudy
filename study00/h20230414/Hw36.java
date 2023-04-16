package study00.h20230414;

import java.util.Scanner;

/*----------------------

작성자 		: 강철구
함수 내용		: 정해진 수 부터 0까지 카운트다운 잘못된 버전

버전			: 1.0 version
최초 작성 날짜	: 23.04.14
마지막 수정 날짜	: 23.04.14
마지막 수정자	: 강철구

----------------------*/

public class Hw36 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("카운트다운 합니다.");
		int x;
		
		do {
			System.out.print("양의 정수값:");
			x = stdIn.nextInt();
		} while (x<=0);
		
		
		while(x>=0)
			System.out.println(--x);
		
		System.out.println("x의 값이 " + x + "이 됐습니다.");
	}

}
