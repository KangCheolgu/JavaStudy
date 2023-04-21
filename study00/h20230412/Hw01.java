package study00.h20230412;
import java.util.Scanner;

public class Hw01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값:");
		int n = stdIn.nextInt();
		
		//if - then문 : if (조건식) 실행문
		if (n<0)
			System.out.println("이 값은 음의 값입니다.");	
	
	}

}
