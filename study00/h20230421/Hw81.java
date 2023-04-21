package study00.h20230421;

import java.util.Scanner;

public class Hw81 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("사람수 :");
		int n = scan.nextInt();
		int[] points = new int[n];

		System.out.println("점수를 입력하세요.");
		int sum = 0;

		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "번의 정수 : ");
			points[i] = scan.nextInt();
			sum += points[i];
			
		}
		
		int max = points[0];
		int min = points[0];
		
		for (int i = 1; i <n; i++) {
			if(points[i] > max) max = points[i];
			
			if(points[i] < min) min = points[i];
		}
		
		System.out.println("합계는 " + sum + "점입니다.");
		System.out.println("평균은 " + (double)sum + "점입니다.");
		System.out.println("최고접은 " + max + "점입니다.");
		System.out.println("최저점은 " + min + "점입니다.");
	}

}
