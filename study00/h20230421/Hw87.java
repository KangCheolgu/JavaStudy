package study00.h20230421;

import java.util.Random;
import java.util.Scanner;

public class Hw87 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		int n;
		do {
			System.out.print("요소 수 : ");
			n = scan.nextInt();
		} while (n > 10);

		int[] a = new int[n];

		for (int i = 1; i < n; i++) {
			int j;
			do {
				j = 0;
				a[i] = 1 + rand.nextInt(10);
				for (; j < i; j++)
					if (a[j] == a[i])
						break;
			} while (a[i] == a[i - 1]);
		}

		for (int i = 0; i < n; i++)
			System.out.println("a[" + i + "] = " + a[i]);

	}

}
