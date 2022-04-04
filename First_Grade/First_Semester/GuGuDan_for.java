/*
 * 사용자로 부터 단 수를 입력받아서 구구단을 출력하는 프로그램
 * 제작 날짜 : 2022-04-04
 * 제작자 : 조한별
 */
import java.util.Scanner;
public class GuGuDan {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int inputV = 0; // 입력받을 단 수
		System.out.print("출력할 구구단의 단수를 입력하세요: ");
		inputV = scan.nextInt();
		
		for (int i = 0; i <= 9; i++) {
			System.out.println(inputV + " * " + i + " = " + (inputV * i));
		}
		
	}
}
