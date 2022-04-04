/*
 * 2차원 배열 모양으로 반복
 * 제작 날짜 : 2022-04-04
 * 제작자 : 조한별
 */
import java.util.Scanner;
public class TowDimArrayForm {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int row, col;
		
		System.out.print("행: ");
		col = scan.nextInt();
		System.out.print("열: ");
		row = scan.nextInt();
		
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print("[" + i + "]" + "[" + j + "] ");
			}
			System.out.println();
		}
		
	}
}
