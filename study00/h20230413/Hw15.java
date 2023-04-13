package study00.h20230413;

import java.util.Scanner;

/*----------------------

작성자 		: 강철구
버전			: 1.0 version
함수 내용		: 조건문을 사용하여 중앙값 구하기
최초 작성 날짜	: 23.04.13
마지막 수정 날짜	: 23.04.13
수정자			: 강철구

----------------------*/

public class Hw15 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a 값:"); int a = stdIn.nextInt();
		System.out.print("정수 b 값:"); int b = stdIn.nextInt();
		System.out.print("정수 c 값:"); int c = stdIn.nextInt();
		
		int med;
		if (a >= b)
			if(b >= c)
				med = b;
			else if (a <= c)
				med = a;
			else
				med = c;
		else if (a > c)
			med = a;
		else if (b > c)
			med = c;
		else
			med = b;
		
		System.out.println("중앙값은 " + med + "입니다.");
				
	}

}
