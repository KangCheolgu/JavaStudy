package study00.h20230428;

import java.util.Scanner;

public class Hw112 {
	
	static void printBits(int x) {
		for (int i = 31; i >= 0 ; i--)
			System.out.print(((x >>> i & 1) == 1 ) ? '1' : '0');
	}
	
	static int setN(int x , int pos, int n) {
		return x | (~(~0 << n) << pos);
	}
	
	static int resetN(int x, int pos, int n) {
		return x &  ~(~(~0<<n) << pos);
	}
	
	static int inverseN(int x, int pos, int n) {
		return x ^ (~(~0 << n) << pos);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 x의 pos 번째 비트부터 n개 비트를 변경합니다.");
		System.out.print("x : "); int x = scan.nextInt();
		System.out.print("pos : "); int pos = scan.nextInt();
		System.out.print("n : "); int n = scan.nextInt();
		
		System.out.print("x                                = "); printBits(x);
		System.out.print("\nsetN(x,pos,n)                  = "); printBits(setN(x, pos, n));
		System.out.print("\nresetN(x,pos,n)                  = "); printBits(resetN(x, pos, n));
		System.out.print("\ninverseN(x,pos,n)                  = "); printBits(inverseN(x, pos, n));
		System.out.println();
		
	}
	
}
