package exam_variable;

public class Exam2 {
	public static void main(String args[]) {
		//'글' 라는 한글문자의 유니코드값을 찾아서 char형으로 선언한 변수에 저장한 뒤 그 변수를 출력하여 확인하시오
		char char1 = '글';
		int result = (int)char1;
		
		System.out.println((char)result);
		
		String hex = Integer.toHexString(result);
		System.out.println(hex);//AE00
	}
}

 