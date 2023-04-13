package study00.h20230412;

import java.util.Scanner;

/*----------------------

작성자 		: 강철구
버전			: 1.0 version
함수 내용		: 변수 크기 비교하기
최초 작성 날짜	: 23.04.12
마지막 수정 날짜	: 23.04.13
수정자			: 강철구

----------------------*/

public class Hw06 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("변수 a 값:"); int a = stdIn.nextInt();
		
		System.out.print("변수 b 값:"); int b = stdIn.nextInt();
		
		if(a>b)
			System.out.println("a가 크다");
		else if (a < b)
			System.out.println("b가 크다");
		else
			System.out.println("a와 b가 같다");
		
	}

}
