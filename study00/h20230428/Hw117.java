package study00.h20230428;

import java.util.Scanner;

// 배열에서 a[idx]에서 n개의 요소를 삭제하기

public class Hw117 {
	
	static void aryRmv(int[] a, int idx, int n) {
		if ( n > 0 && idx >= 0 && idx + n < a.length) {
			int idx2 = idx + n - 1;
			if(idx2 > a.length - n - 1)
				idx2 = a.length - n - 1;
			for(int i = idx ; i <= idx2; i++)
				a[i] = a[i+n];
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
		
		System.out.println("삭제할 요소의 수 : ");
		int n = s.nextInt();
		
		aryRmv(a, idx, n);
		for(int i = 0; i < num; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}

}
