/*
 * 1차원 배열 모양으로 반복
 * 제작 날짜 : 2022-04-04
 * 제작자 : 조한별
 */
import java.util.Scanner;
public class OneDimForm {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int size = 0;
		
		System.out.print("크기 입력: ");
		size = scan.nextInt();
		
		for (int i = 0; i < size; i++) {
			System.out.print("[" + i + "]  ");
		}
		
	}
}
