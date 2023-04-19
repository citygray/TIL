package exam_variable;

public class Exam1 {

	public static void main(String args[]) {
		// 변수 두개를 선언해서 10과 2.0을 대입하고 두 변수의 사칙연산 결과를 정수로 출력해보세요
		int num1 = 10;
		float num2 = 2.0F;
		
		System.out.printf("%d+%f = %d\n",num1,num2,num1+(int)num2);
		System.out.printf("%d-%f = %d\n",num1,num2,num1-(int)num2);
		System.out.printf("%d*%f = %d\n",num1,num2,num1*(int)num2);
		System.out.printf("%d/%f = %d\n",num1,num2,num1/(int)num2);

	}

}
