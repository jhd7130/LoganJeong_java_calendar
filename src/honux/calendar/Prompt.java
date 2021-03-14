package honux.calendar;

import java.util.Scanner;

public class Prompt {
	/**
	 * 
	 * @param week
	 * @return 0~6
	 */
	public int parseDay(String week) {
			if(week== "SU") return 0;
			else if(week.equals("MO")) return 1;
			else if(week.equals("TU")) return 2;
			else if(week.equals("WE")) return 3;
			else if(week.equals("TH")) return 4;
			else if(week.equals("FR")) return 5;
			else if(week.equals("SA")) return 6;
		return 0;
	}

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		CalendarAuto cal = new CalendarAuto();
		String prompt = "cal> ";

		int month = 1;
		int year = 1;
		int weekday = 0;
		
		while (true) {
			
			System.out.println("년도를 입력하세요.");
			System.out.println("YEAR>>");
			year = scanner.nextInt();
			System.out.println("달을 입력하세요.");
			System.out.println("MONTH>>");
			month = scanner.nextInt();
			System.out.println("첫번째 요일을 입력하세요. (SA, MO, TU, WE, TH, FR, SA");
			System.out.println("WEEKDAY>>");
			String strWeekday = scanner.next();
			weekday = parseDay(strWeekday);
			
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}
			cal.printCalendar(year, month,weekday);
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
