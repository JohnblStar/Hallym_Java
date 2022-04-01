/*
 * 사용자로 부터 입력받은 값이 500이 넘기 전까지의 누적합을 구하는 프로그램
 * 제작자 : 소융대 22학번 조한별
 * 제작 날짜 : 2022-03-30
 */
import java.util.Scanner;
public class InputSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int inputNumber = 0;
		int sum = 0; // 누적변수는 0을 초기화 하는게 좋다.
					// sum += inputNumber; sum = sum + inputNumber;
					//					 		 초기화 하지 않으면 쓰레기값			
		while(sum <= 500) {
			System.out.print("누적할 값을 입력하세요 : ");
			inputNumber = scan.nextInt();
			if (inputNumber == 0) 
				break;
			sum += inputNumber;
			System.out.printf("현재까지의 누적 합은 %d 입니다.\n", sum);
		}
		System.out.println("총 누적합은 " + sum + "입니다.");
	}

}
