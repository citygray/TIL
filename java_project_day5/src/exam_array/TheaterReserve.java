package exam_array;

import java.util.Scanner;

public class TheaterReserve {
	
	
	public static void main(String[] args) {

		/*
		
		[실행결과]
		
		----------------------------
		
		1 2 3 4 5 6 7 8 9 10 
		
		----------------------------
		
		0 0 0 0 0 0 0 0 0 0 
		
		----------------------------
		
		원하시는 좌석번호를 입력하세요(종료는 -1): 2
		
		예약되었습니다.
		
		----------------------------
		
		1 2 3 4 5 6 7 8 9 10 
		
		----------------------------
		
		0 1 0 0 0 0 0 0 0 0 
		
		----------------------------
		
		원하시는 좌석번호를 입력하세요(종료는 -1): 2
		
		이미 예약된 자리입니다.
		
		----------------------------
		
		1 2 3 4 5 6 7 8 9 10 
		
		----------------------------
		
		0 1 0 0 0 0 0 0 0 0 
		
		----------------------------
		
		원하시는 좌석번호를 입력하세요(종료는 -1): 99
		
		좌석 번호 선택이 잘못되었습니다.
		
		----------------------------
		
		1 2 3 4 5 6 7 8 9 10 
		
		----------------------------
		
		0 1 0 0 0 0 0 0 0 0 
		
		----------------------------
		
		원하시는 좌석번호를 입력하세요(종료는 -1): -1
		
		프로그램을 종료합니다. 
		
		[요구사항]
		간단한 극장 예약 시스템을 작성하여 보자. 
		아주 작은 극장이라서 좌석이 10개밖에 안된다. 
		사용자가 예약을 하려고 하면 먼저 좌석 배치표를 보여준다. 
		즉 예약이 끝난 좌석은 1로, 예약이 안된 좌석은 0으로 나타낸다.
		
		​*/
		
		//좌석이 10개
		/*
		----------------------------
		
		1 2 3 4 5 6 7 8 9 10 
		
		----------------------------
		
		0 0 0 0 0 0 0 0 0 0 
		
		----------------------------
		*/
		int[] seats = new int[10];
		
		//좌석배치표를 보여준다.
		System.out.println("----------------------------");
		System.out.println("1 2 3 4 5 6 7 8 9 10 ");
		System.out.println("----------------------------");
		for(int seat:seats) {
			System.out.print(seat+" ");
		}
		System.out.println();
		System.out.println("----------------------------");
			

		
		//사용자가 예약좌석을 입력한다.
		Scanner input = new Scanner(System.in);
		int pick = 0;
		while(true) {
			System.out.println("원하는 좌석의 번호를 입력하시오.>>");
			pick = input.nextInt();
			if(pick==-1) {
				System.out.println("종료");
				break;
			}
			if(pick<0||10<pick) {
				System.out.println("좌석 번호 선택이 잘못되었습니다.");
				continue;
			}
			if(seats[pick-1]==1) {
				System.out.println("이미 예약된 좌석입니다.");
				continue;
			}else {
				seats[pick-1] = 1;
				System.out.println("예약되었습니다.");
				//좌석배치표를 보여준다.
				System.out.println("----------------------------");
				System.out.println("1 2 3 4 5 6 7 8 9 10 ");
				System.out.println("----------------------------");
				for(int seat:seats) {
					System.out.print(seat+" ");
				}
				System.out.println();
				System.out.println("----------------------------");
			}
		}
		input.close();
		

			
	    //	입력값 -1
		//		종료
		//  -1이 아닌 값
		//		1~10 아닌 값
		// 			잘못된 선택입니다.
		//		1~10 
		//			예약가능한 좌석
 		//				해당 좌석을 0->1
		//				좌석 배치표를 보여준다
		//			이미 예약된 좌석
		//				이미 예약된 좌석임을 알린다.
				
		//  
	}

}
