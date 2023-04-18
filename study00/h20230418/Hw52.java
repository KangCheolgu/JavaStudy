package study00.h20230418;

import java.util.Scanner;

/*----------------------

작성자 		: 강철구
함수 내용		: 월 입력하면 계절 나오게하기

버전			: 1.0 version
최초 작성 날짜	: 23.04.12
마지막 수정 날짜	: 23.04.13
마지막 수정자	: 강철구

----------------------*/

public class Hw52 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int retry;
		System.out.println("계절을 찾습니다.");

		do {
			int month;
			do {
				System.out.println("몇 월입니까? : ");
				month = scanner.nextInt();
			} while (month < 1 || month > 12);
			
			if(month >= 3 && month <= 5)
				System.out.println("봄입니다.");
			else if ( month >= 6 && month <= 8)
				System.out.println("여름입니다.");
			else if ( month >= 9 && month <= 11)
				System.out.println("가을입니다.");
			else if ( month == 12 || month == 1 || month == 2)
				System.out.println("겨울입니다.");
			
			System.out.println("다시 하겠습니까? 1...YES/0...No : ");
			retry = scanner.nextInt();

		} while (retry == 1);

	}

}
