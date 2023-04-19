package study00.h20230419;

import java.util.Scanner;
/*----------------------

작성자 		: 강철구
함수 내용		: 진수 변환 3 

버전			: 1.0 version
최초 작성 날짜	: 23.04.18
마지막 수정 날짜	: -
마지막 수정자	: -

----------------------*/

public class Hw65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수 : ");
		int x = scanner.nextInt();

		System.out.printf(" 8진수는 %o이고 16진수는 %x입니다", x, x);
	}

}
