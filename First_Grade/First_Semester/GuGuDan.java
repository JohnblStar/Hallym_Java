/*
 * 입력받은 값에 따른 구구단 프로그램
 * 제작자 : 소융대 22학번 조한별
 * 제작 날짜 : 2022-03-29
 */
import java.util.Scanner;
public class GuGuDan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		int dan = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("구구단 단을 입력하세요 : ");
		dan = scan.nextInt();
		
		while (i < 10) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
			
			i++;
		}
	}

}
