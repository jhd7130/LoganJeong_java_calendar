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
	String prompt = "cal> ";
		
		while(true) {
			System.out.println("원하는 달을 입력하시오.");
			System.out.print(prompt);
			int month = scanner.nextInt();
			
			if(1<=month && month <=12) {
				System.out.printf("%n%d월달은  %d일 입니다.%n",month,cal.maxDaysOfM(month));
			}else if(month>12) {
				System.out.println("그런 달은 없습니다.");
				System.out.println();
				continue;
			}else if(month == -1){
				System.out.println("프로그램이 끝났습니다");
				break;
			}
		}
					
					
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