package pac1;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calculator c1 = new Calculator();
		System.out.println(c1.plus(2, 3));
		
		while(true) {
		System.out.print("정수1을 입력하시오.");
		int num1 = sc.nextInt();
		System.out.print("연산자를 입력하시오.");
		String cal = sc
				.next();
		System.out.print("정수2을 입력하시오.");
		int num2 = sc.nextInt();
		
		c1.plusPlus(num1, cal, num2);
		}
		
		
	}

}
