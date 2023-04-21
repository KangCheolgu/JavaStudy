package study00.h20230421;

import java.util.Scanner;

public class Hw84 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int n = scan.nextInt();
		double[] a = new double[n];

		for (int j = 0; j < n; j++) {
			System.out.print("a[" + j + "] = ");
			a[j] = scan.nextDouble();
		}
		
		double sum = 0;
		for (double i : a) {
			sum += i;
		}
		
		System.out.println("모든 요소의 합은" + sum + "입니다.");
		System.out.println("모든 요소의 평균은" + sum/n + "입니다.");
	}

}
