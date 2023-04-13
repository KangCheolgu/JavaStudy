package study00.h20230412;
import java.util.Scanner;

/*----------------------

작성자 		: 강철구
함수 내용		: 음수 판별하기

버전			: 1.0 version
최초 작성 날짜	: 23.04.12
마지막 수정 날짜	: 23.04.13
마지막 수정자	: 강철구

----------------------*/

public class Hw01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값:");
		int n = stdIn.nextInt();
		
		//if - then문 : if (조건식) 실행문
		if (n<0)
			System.out.println("이 값은 음의 값입니다.");	
	
	}

}
