/*
 * 1부터 10까지 출력하는 반복 프로그램
 * 제작자 : 소융대 22학번 조한별
 * 제작 날짜 : 2022-03-29
 */
public class OntToTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int i = 0; //카운트 변수는 주로 i, j, k 사용
		int printValue = 1;
		
		while(i < 10) {
			System.out.print(printValue + " ");
			i++; //while문은 언젠가는 종료될 수 있도록 조건값을 변경해 나가야한다.
		}
		*/
		int i = 0; //카운트 변수는 주로 i, j, k 사용
		
		while(i < 10) {
			System.out.print(i++ + " ");
			//while문은 언젠가는 종료될 수 있도록 조건값을 변경해 나가야한다.
		}
	}

}
