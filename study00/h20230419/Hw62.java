package study00.h20230419;

import java.util.Random;
import java.util.Scanner;

/*----------------------

작성자 		: 강철구
함수 내용		: 숫자 맞추기 게임 

버전			: 1.0 version
최초 작성 날짜	: 23.04.18
마지막 수정 날짜	: -
마지막 수정자	: -

----------------------*/

public class Hw62 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		final int MAX_NO = 6;
		int leftNo = MAX_NO;
		int no = random.nextInt(100);
		
		System.out.println("숫자 맞추기 게임 시작");
		System.out.println("0부터 99사이의 숫자를 맞추세요.");
		
		int x;
		do {
			System.out.println("남은 횟수 " + (leftNo--) + "회, 어떤숫자일까? :");
			x = scanner.nextInt();
			
			if(x>no)
				System.out.println("더 작은 숫자입니다.");
			else if (x < no)
				System.out.println("더 큰 숫자입니다.");
		} while ( x != no && leftNo >0 );
		
		
		if (x == no)
			System.out.println((MAX_NO - leftNo) + "회만에 맞추셨습니다.");
		else
			System.out.println("아쉽네요. 정답은 " + no + "입니다.");		

	}

}
