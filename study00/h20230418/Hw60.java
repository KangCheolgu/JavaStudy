package study00.h20230418;

import java.util.Scanner;

/*----------------------

작성자 		: 강철구
함수 내용		: continue를 이용하여 음수를 제외한 정수값을 더하고 평균내기

버전			: 1.0 version
최초 작성 날짜	: 23.04.18
마지막 수정 날짜	: -
마지막 수정자	: -

----------------------*/

public class Hw60 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요? : ");
		int n = scanner.nextInt();

		int sum = 0;
		int i;
		int count = 0;

		for (i = 0; i < n; i++) {
			System.out.print("정수(0으로 종료) : ");
			int t = scanner.nextInt();
			if (t == 0)	break;
			if (t < 0) {
				System.out.println("음수는 더하지 않습니다.");
				continue;
			}
			sum += t;
			count++;
		}
		System.out.println("합계는 " + sum + " 값입니다.");
		if (i != 0) {
			System.out.println("평균은 " + sum / count + " 입니다.");
		}
	}

}
