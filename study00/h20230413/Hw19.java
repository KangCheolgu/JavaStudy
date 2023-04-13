package study00.h20230413;

import java.util.Random;

/*----------------------

작성자 		: 강철구
버전			: 1.0 version
함수 내용		: 난수를 이용하여 가위바위보
최초 작성 날짜	: 23.04.13
마지막 수정 날짜	: 23.04.13
수정자			: 강철구

----------------------*/

public class Hw19 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		System.out.println("컴퓨터가 낸 것");
		int hand = rand.nextInt(3);
		
		switch(hand) {
		case 0: System.out.println("가위"); break;
		case 1: System.out.println("바위"); break;
		case 2: System.out.println("보"); break;

		}
	}
}
