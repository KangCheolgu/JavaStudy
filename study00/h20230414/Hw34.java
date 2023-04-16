package study00.h20230414;

import java.util.Scanner;

/*----------------------

작성자 		: 강철구
함수 내용		: 두개의 숫자 사이의 모든 정수 출력

버전			: 1.0 version
최초 작성 날짜	: 23.04.14
마지막 수정 날짜	: 23.04.14
마지막 수정자	: 강철구

----------------------*/

public class Hw34 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 A : "); int a = stdIn.nextInt();
		System.out.print("정수 B : "); int b = stdIn.nextInt();
		
		if(a>b) { // a가 더 클경우 a b 값 교환
			int t = a;
			a = b;
			b = t;
		}
		
		do {
			System.out.print(a + " ");
			a = a + 1;
		} while (a <= b);
		System.out.println();
		
	}

}
