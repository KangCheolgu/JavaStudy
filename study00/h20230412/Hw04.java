package study00.h20230412;
import java.util.Scanner;

public class Hw04 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("b는 a의 약수입니까?");

		
		System.out.print("변수 a 값:");
		int a = stdIn.nextInt();
		
		System.out.print("변수 b 값:");
		int b = stdIn.nextInt();
		
		if(a>b && a%b!=0)
			System.out.print("b는 a의 약수가 아닙니다.");
		else if (a>b && a%b == 0) 
			System.out.print("b는 a의 약수입니다.");
		else
			System.out.print("a가 b보다 작습니다.");
		
	}

}