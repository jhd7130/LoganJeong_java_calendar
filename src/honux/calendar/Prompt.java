package honux.calendar;

import java.util.Scanner;

public class Prompt {
	private final static String PROMPT = "cal>  ";

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		CalendarAuto cal = new CalendarAuto();
		String prompt = "cal> ";

		int month = 1;

		while (true) {
			System.out.println("달을 입력하세요.");
			System.out.println(prompt);
			month = scanner.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}
			cal.printCalendar(2021, month);
		}
		System.out.println("Bye~");
		scanner.close();

	}

	public static void main(String[] args) {
		// 셀 실
		Prompt p = new Prompt();
		p.runPrompt(); 
	}
}
