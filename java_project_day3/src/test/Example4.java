package test;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		/*
		 * 요구사항
		 * 100부터 999까지의 숫자(3자리수)를 입력받아 각 자리의 수를 합한 합계를 출력하는 프로그램을 작성하시오.
		 * [예시]
		 * 입력값:123
		 * 출력값:6
		 */

		int num,sum = 0,resultNum = 0;
		
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("100부터 999까지의 숫자(3자리수)를 입력하시오");
			num = input.nextInt();	
		} while (!(100<=num && num < 1000));
		
		int divideNum = 100;
		do {
			resultNum = (num<10)?num:num/divideNum;	
			sum += resultNum;
			num = num%divideNum;
			divideNum = divideNum/10;
		} while(divideNum>0);
		System.out.println(sum);
	    
		input.close();
	}

}
