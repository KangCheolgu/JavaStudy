package study00.h20230414;

import java.util.Scanner;

/*----------------------

작성자 		: 강철구
함수 내용		: 양수 음수 판별 반복문

버전			: 1.0 version
최초 작성 날짜	: 23.04.14
마지막 수정 날짜	: 23.04.14
마지막 수정자	: 강철구

----------------------*/

public class Hw31 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;
		
		do {
			System.out.print("정숫값:");
			int n = stdIn.nextInt();
			
			if(n > 0)
				System.out.println("이 값은 양수입니다.");
			else if (n<0)
				System.out.println("이 값은 음수입니다.");
			else
				System.out.println("이 값은 0입니다.");
			
			System.out.println("다시 한번? 1-Yes / 0-No:"); 
			retry = stdIn.nextInt();

		} while (retry==1);

	}

}
