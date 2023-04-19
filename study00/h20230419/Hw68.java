package study00.h20230419;

import java.util.Scanner;
/*----------------------

작성자 		: 강철구
함수 내용		: 실수로 평균값 구하기 나쁜버전

버전			: 1.0 version
최초 작성 날짜	: 23.04.18
마지막 수정 날짜	: -
마지막 수정자	: -

----------------------*/
public class Hw68 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정숫값 x, y, z의 평균을 구합니다.");
		System.out.println("x값 : "); int x = scanner.nextInt();
		System.out.println("y값 : "); int y = scanner.nextInt();
		System.out.println("z값 : "); int z = scanner.nextInt();
		
		double ave = (x+y+z)/3;
		System.out.printf("x,y,z의 평균은 %.3f입니다.", ave);
	}

}
