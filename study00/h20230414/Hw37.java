package study00.h20230414;

import java.util.Scanner;

/*----------------------

작성자 		: 강철구
함수 내용		: 원하는 갯수만큼 * 출력

버전			: 1.0 version
최초 작성 날짜	: 23.04.14
마지막 수정 날짜	: 23.04.14
마지막 수정자	: 강철구

----------------------*/

public class Hw37 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("몇개의 *을 표시할까요?");
		int n = stdIn.nextInt();
		
		if (n>0) {
			int i = 0;
			while (i<n) {
				System.out.print('*');
				i++;
			}
			System.out.println();
		}	
	}
}
