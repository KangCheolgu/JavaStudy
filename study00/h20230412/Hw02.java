package study00.h20230412;
import java.util.Scanner;

public class Hw02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수값:");
		int n = stdIn.nextInt();
		
		if(n>0)
			System.out.println("이 값의 절대값은 " +n+ "입니다.");
		else if (n<0)
			System.out.println("이 값의 절대값은 " +(-n)+ "입니다.");
		else
			System.out.println("0 입니다.");
	}

}
