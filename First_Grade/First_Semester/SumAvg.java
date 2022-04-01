/*
 * 사용자로부터 0을 입력 받기 전까지의 값들에 대한 합과 평균을 계산하는 프로그램
 * 제작자 : 소융대 22학번 조한별
 * 제작 날짜 : 2022-04-01
 */
import java.util.Scanner;
public class SumAvg {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int inputNumber = 0;
		int sum = 0; // 누적변수는 초기값을 주는게 좋다.
		double avg = 0.0; // 누적 평균
		int count = 1; // 평균을 계산하기 위한 입력 카운트

		do {
			System.out.print("정수 입력 : ");
			inputNumber = scan.nextInt();
			if (inputNumber == 0)
				break;
			sum += inputNumber;
			avg = (double)sum / count++; // 평균은 소수점을 포함하는 나누기 연산이기 때문에 실수 연산 필요
			
			System.out.println("-> 합 : " + sum + " 평균 : " + avg);
		} while(true);
		System.out.println("종료");
	
	}
	
}
