package study00.h20230417;

import java.util.Scanner;

public class Hw46 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.");
		int n;
		do {
			System.out.print("n의 값: ");
			n = stdIn.nextInt();
		} while (n<=0);
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(i == n) {
				System.out.print(i);
			} else {			
				sum += i;
				System.out.print(i + " + ");
			}
		}
		System.out.println( " = " + sum);
	}

}
