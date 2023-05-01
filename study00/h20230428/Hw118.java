package study00.h20230428;

import java.util.Scanner;

//배열 안에 삽입하기

public class Hw118 {

	static void aryIns(int[] a, int idx, int x) {
		if (idx >= 0 && idx < a.length) {
			for (int i = a.length; i <= idx; i++)
				a[i] = a[i - 1];
			a[idx] = x;
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("요소 수 : ");

		int num = s.nextInt();
		int[] a = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.println("a[" + i + "]:");
			a[i] = s.nextInt();
		}
		
		System.out.println("삽입할 요소의 인덱스 : ");
		int idx = s.nextInt();
		
		System.out.println("삽입할 값 : ");
		int x = s.nextInt();
		
		aryIns(a, idx, x);
		
		for(int i = 0; i < num; i++)
			System.out.println("a[]" + i + "] = " + a[i]);

	}

}
