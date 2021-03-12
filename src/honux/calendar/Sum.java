package honux.calendar;
/*두 수를 입력하세요.
5 10 (엔터)
두 수의 합은 15입니다.*/

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int a,b;
		System.out.println("두수를 입력하시오");
		Scanner scan= new Scanner(System.in);
		String s1,s2;
		s1 = scan.next();
		s2 = scan.next();
		a=Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		int add = a+b;
		int dividend = a/b;
		
		System.out.println("두수의 합은 : " + add + "입니다.");
		scan.close();
	}
}
 