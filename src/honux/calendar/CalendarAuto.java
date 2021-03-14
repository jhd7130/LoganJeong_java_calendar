package honux.calendar;

public class CalendarAuto {
	private final int[] maxDays = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };
	private final int[] LeapMaxDays = { 31, 29, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 }; 

	public boolean isLeaps(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public int getMaxDay(int year, int month) {
		if (isLeaps(year)) {
			return LeapMaxDays[month - 1];

		} else {
			return maxDays[month - 1];
		}
	}

	public void printCalendar(int year, int month, int weekday) {
		System.out.printf("      <%4d 년 %3d 월>\n", year, month);
		System.out.println("  SU MO TU WE TH FR SA");
		System.out.println("------------------------");

		int max = getMaxDay(year, month);
		int count = 7- weekday;
		int delim = count <7 ? count : 0;
		
		for( int i = 0; i< weekday; i++) {
			System.out.print("   ");
		}
		for(int i= 1; i <=count; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		
		count++;
		
		for (int i = count; i <= max; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == delim)
				System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {

	}

}
