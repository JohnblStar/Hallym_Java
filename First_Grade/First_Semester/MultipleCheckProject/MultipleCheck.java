import java.util.*;
/*
 * 사용자로부터 두 정수를 입력받아 첫번째 정수가 두번째 정수의 배수인지 판단하는 프로그램
 * 작성일자: 2022-05-15
 * 작성자: 조한별(소융대 22학번)
 */
public class MultibpleCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int inputNumber1 = 0;
		int inputNumber2 = 0;
		
		System.out.print("첫번째 정수 입력: ");
		inputNumber1 = scan.nextInt();
		System.out.print("두번째 정수 입력: ");
		inputNumber2 = scan.nextInt();
		if( multipleCheck(inputNumber1, inputNumber2))
			System.out.println(inputNumber1+"은 "+inputNumber2+"의 배수입니다.");
		else
			System.out.println(inputNumber1+"은 "+inputNumber2+"의 배수가 아닙니다.");
	}
	static boolean multipleCheck(int n1, int n2) {
		if(n1 % n2 == 0)
			return true;
		
		return false;
	}
}
