package study00.h20230419;

import java.util.Scanner;

/*----------------------

작성자 		: 강철구
함수 내용		: 총 그룹의 합 구하기 

버전			: 1.0 version
최초 작성 날짜	: 23.04.18
마지막 수정 날짜	: -
마지막 수정자	: -

----------------------*/

public class Hw61 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 더합니다.");
		int total = 0;
		
		Out:
			for(int i = 1; i <= 10; i++) {
				System.out.println(i+"그룹");
				
				for(int j = 0; j <5; j++) {
					System.out.print("정수 : ");
					int t = scanner.nextInt();
					if(t == 99999)
						break Out;
					else if ( t == 88888)
						continue Out;
					total += t;
				}
				
			}
			
		System.out.println("\n합계는 " + total + " 입니다");

	}

}
