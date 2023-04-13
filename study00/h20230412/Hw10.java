package study00.h20230412;

import java.util.Scanner;

/*----------------------

작성자 		: 강철구
버전			: 1.0 version
함수 내용		: 점수에 따른 성적 나누기
최초 작성 날짜	: 23.04.12
마지막 수정 날짜	: 23.04.13
수정자			: 강철구

----------------------*/

public class Hw10 {
	
	public static void main(String[] args) {
		
	
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("점수 :"); int point = stdIn.nextInt();
		
		if (point >= 0 && point <= 49)
			System.out.println("가");
		else if (point >= 50 && point <= 59)
			System.out.println("양");
		else if (point >= 60 && point <= 69)
			System.out.println("미");
		else if (point >= 70 && point <= 79)
			System.out.println("우");
		else if (point >= 80 && point <= 100)
			System.out.println("수");
		else 
			System.out.println("잘못된 점수입니다");
	}
}
