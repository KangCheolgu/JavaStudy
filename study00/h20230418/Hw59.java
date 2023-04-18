package study00.h20230418;

import java.util.Scanner;

/*----------------------

작성자 		: 강철구
함수 내용		: 합이 1000이내에서 정수값을 더하고 평균내기

버전			: 1.0 version
최초 작성 날짜	: 23.04.18
마지막 수정 날짜	: -
마지막 수정자	: -

----------------------*/

public class Hw59 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요? : ");
		int n = scanner.nextInt();
		
		int sum = 0;
		int i;
		
		for(i = 0; i < n; i++) {
			System.out.print("정수(0으로 종료) : ");
			int t = scanner.nextInt();
			
			if ( t == 0) break;
			
			if ( sum + t > 1000 ) {
				
				System.out.println("합계가 1,000을 넘었습니다.");
				System.out.println("마지막 값은 무시합니다.");
				break;
				
			}
			
			sum += t;
			
		}
		System.out.println("합계는 " + sum + " 값입니다.");
		if(i!=0) {
			System.out.println("평균은 "+ sum / i + " 입니다.");
		}

	}
}
