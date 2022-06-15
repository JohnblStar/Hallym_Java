/*
 * 은행 계좌 객체를 생성하고 테스트하기 위한 클래스
 * 작성일자: 2022-05-06
 * 작성자: 조한별
 */
public class AccountTest {

	public static void main(String[] args) {
		Account a1 = new Account("111-1111", "kim");
		Account a2 = new Account("222-2222", "lee", 12000000L);
		
		System.out.println(a1.toString());
		System.out.println(a2);
		//a1.deopsit(1000000); 메소드를 void로 만든 경우
		System.out.println("현재 잔액: " + a1.deposit(1000000));
		System.out.println("현재 잔액: " + a2.withdraw(8000000));
		System.out.println("현재 잔액: " + a2.withdraw(8000000));
		
	}
}
