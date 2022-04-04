/*
 * 사용자로 부터 입력을 받아 소수를 구하는 프로그램
 * 제작 날짜 : 2022-04-05
 * 제작자 : 조한별
 */
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int max = 0;
		int c = 0; // 나누어지는 횟수
		System.out.print("출력 최대값 입력 : ");
		max = scan.nextInt();
		System.out.print("소수 : ");
		
		for (int i = 2; i <= max; i++) {
			c = 0;
			for (int j = 2; j <= i; j++) {
				if (i % j == 0)
					c++;
			}

			if(c <= 1) {
				System.out.print(" " + i);
			}
			
		}
		
	}
}
