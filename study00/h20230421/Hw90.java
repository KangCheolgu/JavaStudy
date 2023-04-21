package study00.h20230421;

import java.util.Random;
import java.util.Scanner;

public class Hw90 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		String[] monthString = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

		System.out.println("해당월의 영어단어 앞 3자리를 입역하시오");
		System.out.println("맨 앞글자는 대문자 나머지는 소문자로 입력하시오");

		int retry;
		int last = -1;

		do {
			int month;
			do {
				month = rand.nextInt(12);
			} while (month == last);

			last = month;

			while (true) {
				System.out.println((month + 1) + "월 : ");
				String s = scan.next();

				if (s.equals(monthString[month]))
					break;
				System.out.println("틀렸습니다.");

			}
			System.out.println("정답입니다. 다시한번? 1...YES/0...NO : ");
			retry = scan.nextInt();

		} while (retry == 1);
	}
}
