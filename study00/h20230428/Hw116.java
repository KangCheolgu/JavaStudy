package study00.h20230428;

import java.util.Scanner;

public class Hw116 {
	
	static void aryRmv(int[] a, int idx) {
		if ( idx >= 0 && idx < a.length) {
			for(int i = 0; i < a.length - 1; i++)
				a[i] = a[i + 1];
		}
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("요소 수 : ");
		int num = s.nextInt();
		int[] a = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("a[" + i + "]:");
			a[i] = s.nextInt();
		}
		
		System.out.println("삭제할 요소의 인덱스 : ");
		int idx = s.nextInt();
		
		aryRmv(a, idx);
		
		for(int i = 0; i < num; i++)
			System.out.println("a[" + i + "] = " + a[i]);
		
	}

}
