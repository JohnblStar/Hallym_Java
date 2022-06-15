import java.util.Scanner;
/*
 * 두 클래스를 하나의 java 파일에 만들 경우는
 * 클래스 이름은 main 메서드를 가지는 클래스로 생성
 * 작성일자: 2022-05-06
 * 작성자: 조한별
 */
class GuGuDan { // 하나의 java 파일에 두개의 public 클래스는 만들 수 없다.

	private	int dan; // 구구단의 단 수를 저장할 멤버 변수
	
	public GuGuDan() { // GuGuDan g1 = new GuGuDan();
		
	}
	public GuGuDan(int dan) { // GuGuDan g2 = new GuGuDan(8);
		this.dan = dan;
	}
	public void setDan(int d) {
		dan = d;
	}
	public void PrintGuGu() {
		System.out.println("구구단 " + dan + "단 출력");
		System.out.println("------------");
		for (int i = 0; i <= 9; i++) {
			System.out.println(dan + "*" + i + " = " + (dan*i));
		}
	}
}

public class GuGuTest { 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = 0;
		
		System.out.println("출력할 단수를 입력: ");
		input = scan.nextInt();
		GuGuDan g1 = new GuGuDan(input);
		g1.PrintGuGu();
		g1.setDan(9);
		g1.PrintGuGu();
	}

}
