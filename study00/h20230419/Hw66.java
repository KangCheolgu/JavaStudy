package study00.h20230419;

import java.util.Scanner;
/*----------------------

작성자 		: 강철구
함수 내용		: 자료형 변환 

버전			: 1.0 version
최초 작성 날짜	: 23.04.18
마지막 수정 날짜	: -
마지막 수정자	: -

----------------------*/
public class Hw66 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("변수 x는 float형 입니다. 변수 y는 double 형입니다.");
		System.out.println("x : ");
		float x = scanner.nextFloat();
		System.out.println("y : ");
		double y = scanner.nextDouble();
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}

}
