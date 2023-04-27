package study00.h20230427;

import java.util.Scanner;

public class Hw104 {

	static String seasonOf(int m) {
		switch (m) {
		case 3:
		case 4:
		case 5:
			return "봄";
		case 6:
		case 7:
		case 8:
			return "여름";
		case 9:
		case 10:
		case 11:
			return "가을";
		case 12:
		case 1:
		case 2:
			return "겨울";
		}
		return "";
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int month;

		do {
			System.out.print("몇 월? :");
			month = scan.nextInt();
		} while (month < 1 || month > 12);

		System.out.print(" 해당 월의 계절은 ");
		System.out.print(seasonOf(month));
		System.out.print("입니다.");
	}

}
