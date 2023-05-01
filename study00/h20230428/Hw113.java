package study00.h20230428;

import java.util.Scanner;


public class Hw113 {
	
	static int sumUp(int[] a) {

		int sum = 0;

		for (int i = 0; i <= a.length; i++) {
			sum += a[i];
		}

		return sum;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("요소 수 : ");
		int num = scan.nextInt();
		int [] x = new int[num];
		
		for (int i = 0; i < num; i ++) {
			System.out.print("x[" + i + "]:");
			x[i] = scan.nextInt();
		}
		
		System.out.println("모든 요소의 합은 " + sumUp(x) + "입니다.");
	}

}
