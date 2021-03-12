package honux.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] maxDayOfMonth = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };

	public int getmaxDay(int month) {
		return maxDayOfMonth[month - 1];
	}

	private static void calendar() {
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println("   1   2    3  4   5   6   7");
		System.out.println("  8   9  10  11 12  13  14");
		System.out.println(" 15  16  17 18 19 20  21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.println("원하는 달을 입력하시오.");
		int month = scanner.nextInt();

		System.out.printf("%d월달은 %d 일 입니다%n%n", month, cal.maxDayOfMonth[month]);
		cal.calendar();
		scanner.close();

	}
}
