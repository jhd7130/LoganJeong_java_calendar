package honux.calendar;

public class CalendarAuto {
	private final int[] maxDays = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };

	public int getMaxDay(int month) {
		return maxDays[month - 1];
	}

	public void printCalendar(int year, int month) {
		System.out.printf("      <%4d 년 %3d 월>\n" , year , month );
		System.out.println("  SU MO TU WE TH FR SA");
		System.out.println("------------------------");
		
		 int max = getMaxDay(month);
		 
		 for(int i=1; i <= max;  i++) {
			 System.out.printf("%3d",i);
			 if(i % 7 == 0) 
				 System.out.println();
		 }
		 System.out.println();
	}

	public static void main(String[] args) {

	}

}
