package study00.h20230413;

import java.util.Scanner;

/*----------------------

작성자 		: 강철구
버전			: 1.0 version
함수 내용		: 조건문을 사용하여 큰값 작은값 구분하기
최초 작성 날짜	: 23.04.13
마지막 수정 날짜	: 23.04.13
수정자			: 강철구

----------------------*/

public class Hw16 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a 값:"); int a = stdIn.nextInt();
		System.out.print("정수 b 값:"); int b = stdIn.nextInt();
		
		if (a == b)
			System.out.println();
		else {
			int min, max;
			
			if (a < b) {
				min = a;
				max = b;
			} else {
			min = b;
			max = a;
			}
			
			System.out.println("작은 값은 " + min + "입니다.");
			System.out.println("큰 값은 " + max + "입니다.");
			
		}
	}
}
