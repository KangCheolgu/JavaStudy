package study00.h20230413;
import java.util.Scanner;

/*----------------------

작성자 		: 강철구
버전			: 1.0 version
함수 내용		: 세 변수를 크기순으로 정렬하기
최초 작성 날짜	: 23.04.13
마지막 수정 날짜	: 23.04.13
수정자			: 강철구

----------------------*/



public class Hw18 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a 값:"); int a = stdIn.nextInt();
		System.out.print("정수 b 값:"); int b = stdIn.nextInt();
		System.out.print("정수 c 값:"); int c = stdIn.nextInt();
		
		if (a > b) {
			int t = a; a = b; b = t;
		}
		
		if (b > c) {
			int t = b; b = c; c = t;
		}
		
		if(a>b) {
			int t = a; a = b; b = t;
		}
		
		System.out.println("a <= b <= c 가 되도록 정렬했습니다.");
		System.out.println("변수 a는 " + a + "입니다.");
		System.out.println("변수 b는 " + b + "입니다.");
		System.out.println("변수 b는 " + c + "입니다.");

		
	}

}
