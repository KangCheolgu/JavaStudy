package study00.h20230428;

public class Hw111 {

	static void printBits(int x) {
		for (int i = 31; i >= 0 ; i--)
			System.out.print(((x >>> i & 1) == 1 ) ? '1' : '0');
	}
	
	static int set( int x, int pos) {
		return x & ~(1 << pos);
	}
	
	static int reset (int x, int pos ) {
		return x & ~(1 << pos);
	}
	
	static int inverse(int x, int pos) {
		return x ^ (1 << pos);
	}
	public static void main(String[] args) {

	}

}
