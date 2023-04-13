package study00.h20230413;

import java.util.Scanner;

/*----------------------

작성자 		: 강철구
버전			: 1.0 version
함수 내용		: 월 입력하면 계절 출력하기
최초 작성 날짜	: 23.04.13
마지막 수정 날짜	: 23.04.13
수정자			: 강철구

----------------------*/

public class Hw20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("몇 월입니까?");
		int month = stdIn.nextInt();
		
		switch(month) {

		case 3:
		case 4:
		case 5: System.out.println("봄"); break;
		case 6:
		case 7:
		case 8:System.out.println("여름"); break;
		case 9:
		case 10:
		case 11:System.out.println("가을"); break;
		case 12:
		case 1:
		case 2:System.out.println("겨울"); break;
		default : System.out.println("그런월은 없습니다."); break;
			
		}
	}

}
