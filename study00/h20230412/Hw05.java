package study00.h20230412;
import java.util.Scanner;

/*----------------------

작성자 		: 강철구
버전			: 1.0 version
함수 내용		: 양수 음수 0 구분하기
최초 작성 날짜	: 23.04.12
마지막 수정 날짜	: 23.04.13
수정자			: 강철구

----------------------*/

public class Hw05{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수값:");
		int n = stdIn.nextInt();
		
		if(n>0)
			System.out.println("양수입니다.");
		else if (n<0)
			System.out.println("음수입니다.");
		else
			System.out.println("0 입니다.");

		
	}

}