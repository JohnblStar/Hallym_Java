/*
 * 1부터 50까지 숫자중 3의 배수, 5의 배수가 *로 출력되는 프로그램
 * 제작자 : 소융대 22학번 조한별
 * 제작 날짜 : 2022-03-29
 */
public class ThreeOfFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		
		while( i <= 50 ) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(" * ");
			} else {
				System.out.println( i + " ");
			}
			
			i++; // i = i + 1
		}
	}

}
