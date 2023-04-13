package study00.h20230412;

import java.util.Scanner;

/*----------------------

작성자 		: 강철구
버전			: 1.0 version
함수 내용		: 5로 나누어 지는 수 판별하기
최초 작성 날짜	: 23.04.12
마지막 수정 날짜	: 23.04.13
수정자			: 강철구

----------------------*/

public class hw07 {
	
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("변수 a 값:"); int a = stdIn.nextInt();
		
		if ( a > 0 )
			if ( a % 5 ==0 )
				System.out.println("이 값은 5로 나우어집니다.");
			else
				System.out.println("이 값은 5로 나누어지지 않습니다.");
		else
			System.out.println("음의 정숫값을 입력했습니다.");
	}

}
