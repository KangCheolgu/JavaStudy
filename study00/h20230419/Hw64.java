package study00.h20230419;

import java.util.Scanner;
/*----------------------

작성자 		: 강철구
함수 내용		: 진수 변환 2 

버전			: 1.0 version
최초 작성 날짜	: 23.04.18
마지막 수정 날짜	: -
마지막 수정자	: -

----------------------*/

public class Hw64 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int x = scanner.nextInt();
		
		System.out.printf(" 8진수는 %o입니다.\n", x);
		System.out.printf(" 16진수는 %x입니다.\n", x);

	}

}
