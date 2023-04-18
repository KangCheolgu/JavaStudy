package study00.h20230418;

import java.util.Scanner;

/*----------------------

작성자 		: 강철구
함수 내용		: 소수 판별하기

버전			: 1.0 version
최초 작성 날짜	: 23.04.18
마지막 수정 날짜	: -
마지막 수정자	: -

----------------------*/

public class Hw57 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n;
		int i;
		
		do {
			System.out.print("2 이상의 정숫값 : ");
			n = scanner.nextInt();
		} while (n < 2);
		
		for(i = 2; i < n; i ++) {
			if(n% i == 0)
				break;
		}
			
		if(i == n)
			System.out.println("소수입니다.");
		else
			System.out.println("소수가 아닙니다.");
	}

}
