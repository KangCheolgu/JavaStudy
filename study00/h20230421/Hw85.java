package study00.h20230421;

import java.util.Random;
import java.util.Scanner;

public class Hw85 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("요소 수 : ");
		int n = scan.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) 
			a[i] = 1 + rand.nextInt(10);
		
		for(int i = 0; i < n; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}

}
