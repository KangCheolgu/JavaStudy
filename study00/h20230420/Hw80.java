package study00.h20230420;

import java.util.Scanner;

public class Hw80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("요소 수: ");
		int n = scanner.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = scanner.nextInt();
		}
		
		System.out.print("a = {");
		
		if (n > 2) {
			for (int i = 0; i < n - 1; i++)
				System.out.print(a[i] + ", ");
		}
		if (n >= 1)
			System.out.print(a[n - 1]);
			
			System.out.print("}");
		
	}

}
