package study00.h20230425;

import java.util.Random;
import java.util.Scanner;

public class Hw92 {

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

				day = rand.nextInt(7);
				
			} while (day == last);

			last = day;

			int action;

			do {

				System.out.println(dayKorean[day] + " 요일 : ");
				String s = scan.next();

				if (s.equals(dayEnglish[day])) {

					System.out.println("정답입니다.");
					break;

				}

				System.out.println("오답입니다.");

				do {

					System.out.println("정답입니다. 다시한번? 1...YES/0...NO : ");
					action = scan.nextInt();

				} while (action != 0 && action != 1);

				if (action == 0)
					System.out.println(dayKorean[day] + "요일은\"" + dayEnglish[day] + "\"입니다.");

			} while (action == 1);

			System.out.println("다시한번? 1...YES/0...NO : ");

			retry = scan.nextInt();

		} while (retry == 1);
	}

}
