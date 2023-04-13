package study00.h20230412;
import java.util.Scanner;

/*----------------------

작성자 		: 강철구
버전			: 1.0 version
함수 내용		: 약수 구하기
최초 작성 날짜	: 23.04.12
마지막 수정 날짜	: 23.04.13
수정자			: 강철구

----------------------*/


public class Hw03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("b는 a의 약수입니까?");

		
		System.out.print("변수 a 값:");
		int a = stdIn.nextInt();
		System.out.print("변수 b 값:");
		int b = stdIn.nextInt();
		
		if(a>b && a%b==0)
			System.out.print("b는 a의 약수입니다.");
		else if (a>b && a%b != 0) 
			System.out.print("b는 a의 약수가 아닙니다.");
		else
			System.out.print("a가 b보다 작습니다.");
		
	}

}
