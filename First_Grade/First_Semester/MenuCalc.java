/*
 * 종료가 선택될 때까지 계산하는 계산기 프로그램을 작성하시오.
 * 제작자 : 소융대 22학번 조한별
 * 제작 날짜 : 2022-04-01
 */
import java.util.Scanner;
public class MenuCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int firstN = 0;
		int secondN = 0;
		int menu = 0;
		
		do {
			System.out.println("select menu");
			System.out.println("1: 숫자 입력");
			System.out.println("2: 더하기");
			System.out.println("3: 빼기");
			System.out.println("4: 곱하기");
			System.out.println("5: 나누기");
			System.out.println("6: 종료");
			
			System.out.print("메뉴선택 : ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("두 수를 입력하세요 : ");
				firstN = scan.nextInt();
				secondN = scan.nextInt();
				
				break;
				
			case 2:
				if(firstN == 0 && secondN == 0)
					System.out.println("값을 먼저 입력하세요!");
				else
					System.out.println("두 수를 더한 값은 : " + (firstN + secondN));
				break;
				
			case 3: 
				System.out.println("두 수를 뺀 값은 : " + (firstN - secondN));
				break;
				
			case 4: 
				System.out.println("두 수를 곱한 값은 : " + (firstN * secondN));
				break;
			
			case 5: 
				System.out.println("두 수를 나눈 값은 : " + ((double)firstN / secondN));
				break;
				
			case 6: 
				break; // return; main 메소드를 끝내고 프로그램 종료
				
			default:
				System.out.println("매뉴를 잘못 입력했습니다.");
				break;
			}
		}while(menu != 6);
	
		System.out.println("프로그램 종료");
		
	}

}
