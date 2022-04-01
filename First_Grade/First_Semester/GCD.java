/*
 * 유클리드 호제법
 * 제작자 : 소융대 22학번 조한별
 * 제작 날짜 : 2022-04-01
 */
import java.util.Scanner;
public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int firstN = 0;
		int secondN = 0;
		int x; // 두 입력값 중 큰 수
		int y; // 두 입력값 중 작은 수
		int r; // 두 수의 나눈 나머지 값

		System.out.print("최대 공약수를 구할 두 정수를 입력하세요 : ");
		firstN = scan.nextInt();
		secondN = scan.nextInt();
		x = firstN > secondN ? firstN : secondN; // max
		y = firstN < secondN ? firstN : secondN; // min
		
		while(y != 0) {
			r = x % y;
			x = y;
			y = r;
		}
		System.out.println("최대 공약수는 " + x);
	}

}
