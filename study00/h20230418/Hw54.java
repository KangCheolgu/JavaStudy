package study00.h20230418;

import java.util.Scanner;

/*----------------------

작성자 		: 강철구
함수 내용		: 이등변 삼각형 만들기

버전			: 1.0 version
최초 작성 날짜	: 23.04.18
마지막 수정 날짜	: -
마지막 수정자	: -

----------------------*/

public class Hw54 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.print("단수는 ? : ");
		
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n ; i++) {  //왼쪽 아래가 직각인 이등변 삼각형
			for(int j = 1; j <= i ; j++)
				System.out.print('*');
			System.out.println();
		}
		
		System.out.println();

		for (int i = 1; i <= n ; i++) {  //왼쪽 위가 직각인 이등변 삼각형
			for(int j = 1; j <= n-i+1 ; j++)
				System.out.print('*');
			System.out.println();
		}

	}

}
