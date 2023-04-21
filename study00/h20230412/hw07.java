package study00.h20230412;

import java.util.Scanner;

public class hw07 {
	
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("변수 a 값:"); int a = stdIn.nextInt();
		
		if ( a > 0 )
			if ( a % 5 ==0 )
				System.out.println("이 값은 5로 나우어집니다.");
			else
				System.out.println("이 값은 5로 나누어지지 않습니다.");
		else
			System.out.println("음의 정숫값을 입력했습니다.");
	}

}
