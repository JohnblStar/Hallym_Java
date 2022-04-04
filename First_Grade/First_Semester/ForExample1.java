/*
 * 1부터 10까지 for문을 이용한 출력
 * 제작 날짜 : 2022-04-04
 * 제작자 : 조한별
 */
public class ForExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
		int i = 1; // 제어변수가 for문 밖에 있을 경우 for문 종료시도 유효한 변수
			   // 제어변수가 for문 안에 있을 경우 for문 종료시 사라지는 변수
		for ( ; ;) { // 10회 반복 루프
//		while(i <= 10) {
			if(i <= 10)
			System.out.print(i + " "); // 1부터 10까지 값을 출력
			i++;
		}
*/		
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + " "); //1부터 10까지 출력
		}
	}

}
