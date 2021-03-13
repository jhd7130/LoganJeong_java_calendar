package honux.calendar;

import java.util.Scanner;

public class Calendar {
	
	private final int[] maxDays = {31, 28,31,30,31,30,31,30,31,30,31,30};
	
	public int maxDaysOfM(int month) {
		return maxDays[month-1];
	}
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Calendar cal = new Calendar();
	
	System.out.println("반복횟수를 입력하시오.");
	int repeat = scanner.nextInt();
	
	System.out.println("원하는 달을 입력하세요.");
	for( int i= 0; i < repeat;i++) {
		int month = scanner.nextInt();
		System.out.printf("%d달은  %d일 입니다.%n",month,cal.maxDaysOfM(month));
	}
	System.out.println("시스템이 끝났습니다.");
	scanner.close();
	}
}
/*  내가 한거
Scanner scan= new Scanner(System.in);

System.out.println("반복 횟수를 입력하세요.");
int count = scan.nextInt();

System.out.println("월을 입력하세요.");
int[] countT = new int[count];
	for(int i=0; i<countT.length; i++) {
		countT[i]=scan.nextInt();
		}
int[] max_month = {31,28,30,31,30,31,30,31,30,31,30,31};
for(int j=0; j<countT.length;j++)
	System.out.printf("%d월은 %d일 입니다.%n",countT[j],max_month[countT[j]-1]); */