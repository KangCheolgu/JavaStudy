package study00.h20230413;

import java.util.Scanner;

/*----------------------

작성자 		: 강철구
버전			: 1.0 version
함수 내용		: 세 값중 최소값 찾기
최초 작성 날짜	: 23.04.13
마지막 수정 날짜	: 23.04.13
수정자			: 강철구

----------------------*/

public class Hw14 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a 값:"); int a = stdIn.nextInt();
		System.out.print("정수 b 값:"); int b = stdIn.nextInt();
		System.out.print("정수 c 값:"); int c = stdIn.nextInt();
		
		int min = a ;
		if(b < min) min = b;
		if(c < min) min = c;
		
		System.out.println("최솟값은 " + min + "입니다.");

	}

}
