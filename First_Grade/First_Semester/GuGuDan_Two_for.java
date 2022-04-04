/*
 * 구구단 표를 출력하는 프로그램
 * 제작 날짜 : 2022-04-04
 * 제작자 : 조한별
 */
public class GuGuDan {
	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + (j * i) + "\t");
			}
			System.out.println();
		}
	}
}
