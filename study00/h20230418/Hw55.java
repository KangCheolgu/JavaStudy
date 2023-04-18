package study00.h20230418;

import java.util.Scanner;
/*----------------------

작성자 		: 강철구
함수 내용		: 피라미드 만들기

버전			: 1.0 version
최초 작성 날짜	: 23.04.18
마지막 수정 날짜	: -
마지막 수정자	: -

----------------------*/

public class Hw55 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("피라미드를 표시합니다.");
		System.out.print("단수는 ? : ");
		int n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++)
				System.out.print(" ");
			for (int j = 1; j <= 2*i-1; j++)
				System.out.print('*');
			System.out.println();
		}

	}

}
