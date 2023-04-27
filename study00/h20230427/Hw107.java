package study00.h20230427;

import java.util.Scanner;

public class Hw107 {
static Scanner scan = new Scanner(System.in);
	
	static int readPlusInt() {
		int x;
		
		do {
			System.out.println("양의 정숫값 : ");
			x = scan.nextInt();
		} while ( x <= 0);
		
		return x;
	}
	
	
	public static void main(String[] args) {
		
		int x;
		
		do {
			int n = readPlusInt();
			
			System.out.println("반대로 읽으면 ");
			
			while (n > 0) {
				System.out.println(n%10);
				n/=10;
			}
			System.out.println("입니다.");
			
			do {
				System.out.println("다시 한번?<에스..1/No..0>:");
				x = scan.nextInt();
				
			} while (x !=0 && x !=1);
			
		}while ( x == 1 );

	}

}
