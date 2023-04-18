package study00.h20230418;

import java.util.Scanner;

/*----------------------

작성자 		: 강철구
함수 내용		: 제곱 구하기

버전			: 1.0 version
최초 작성 날짜	: 23.04.18
마지막 수정 날짜	: --
마지막 수정자	: --

----------------------*/

public class Hw51 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정숫값 : ");
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i + "의 제곱은 " + i * i + " 입니다.");
		}
		
		for(int i = 1, j = 1; i <= n; i++, j=i * i) {
			System.out.println(i + "의 제곱은 " + j + " 입니다.");
		}

	}

}
