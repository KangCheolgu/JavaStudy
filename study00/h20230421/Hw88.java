package study00.h20230421;

import java.util.Random;
import java.util.Scanner;

public class Hw88 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("요소 수 : ");
		int n = scan.nextInt();
		
		int[] a = new int[n];

		for (int j = 0; j < n; j++) {
			System.out.print("a[" + j + "] = ");
			a[j] = scan.nextInt();
		}
		
		for ( int i = 0; i < 2* n; i++) {
			int idx1 = rand.nextInt(n);
			int idx2 = rand.nextInt(n);
			int t = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = t;
		}
		
		System.out.println("요소를 섞었습니다.");
		for ( int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}

}
