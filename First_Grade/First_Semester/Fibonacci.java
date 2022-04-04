/*
 * 피보나치 수열을 출력하는 프로그램
 * 제작 날짜 : 2022-04-05
 * 제작자 : 조한별
 */
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int end = 0;
		int first = 0; // 피보나치 수열 첫번째는 0값
		int second = 1; // 피보나치 수열 두번째는 1값
		int next; // 다음 피보나치 수열값을 계산하기 위한 변수
		
		System.out.print("마지막 항 입력 : ");
		end = scan.nextInt();
		System.out.print("피보나치 수열 : ");
		
		for (int i = 0; i < end; i++) {
			if(i < 2) {
				System.out.print(i + " , ");
			} else {
				next = first + second;
				if(i == end - 1)
					System.out.print(next);
				else
					System.out.print(next + " , ");
				first = second;
				second = next;
			}
		}
		
	}
}
