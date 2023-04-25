package study00.h20230425;

import java.util.Random;
import java.util.Scanner;

public class Hw91 {

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		String[] dayKorean = { "일", "월", "화", "수", "목", "금", "토" };
		String[] dayEnglish = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };

		System.out.println("요일명을 영어 소문자로 입력하시요.");

		int retry;
		int last = -1;

		do {
			int day;
			do {
				day = rand.nextInt(12);
			} while (day == last);

			last = day;

			while (true) {
				System.out.println(dayKorean[day] + " 요일 : ");
				String s = scan.next();

				if (s.equals(dayEnglish[day]))
					break;
				System.out.println("틀렸습니다.");

			}
			System.out.println("정답입니다. 다시한번? 1...YES/0...NO : ");
			retry = scan.nextInt();

		} while (retry == 1);
	}

}
