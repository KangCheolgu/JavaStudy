package study00.h20230414;

import java.util.Random;
import java.util.Scanner;

/*----------------------

작성자 		: 강철구
함수 내용		: do while 연습 2 숫자 업 다운

버전			: 1.0 version
최초 작성 날짜	: 23.04.14
마지막 수정 날짜	: 23.04.14
마지막 수정자	: 강철구

----------------------*/

public class Hw33 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		int no = 10 + rand.nextInt(90);
		
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("10부터 99사이의 숫자를 맞추세요.");
		
		int x;
		do {
			System.out.print("어떤숫자일까? : ");
			x = stdIn.nextInt();
			
			if (x > no)		// 랜덤한 숫자보다 크냐 작냐
				System.out.println("더 작은 숫자입니다.");
			else if (x < no)
				System.out.println("더 큰 숫자입니다.");
		} while (x != no); // 같을때까지 반복
		
		System.out.println("정답입니다.");
		
	}

}
