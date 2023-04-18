package study00.h20230418;

import java.util.Scanner;

/*----------------------

작성자 		: 강철구
함수 내용		: *로 정사각형 모양 만들기

버전			: 1.0 version
최초 작성 날짜	: 23.04.12
마지막 수정 날짜	: 23.04.13
마지막 수정자	: 강철구

----------------------*/

public class Hw53 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정방형을 표시합니다.");
		System.out.print("단수는 : ");
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for(int j = 1; j<=n; j++) 
				System.out.print('*');
			System.out.println();
		}

	}

}
