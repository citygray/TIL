package exam_array;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// 사용자로 부터 5개의 정수를 입력받아 총합과 평균값을 계산하여 출력하는 프로그램
		// 소숫점 1째 자리 까지
		
		Scanner input = new Scanner(System.in);
		
		int sum =0;
		for(int i=0;i<5;i++) {
			System.out.println(i+"번째 숫자를 입력하시오");
			sum += input.nextInt();
		}
		System.out.println("총합은 "+sum);
		System.out.println("평균값은 "+sum/5);
		
		input.close();

	}

}
