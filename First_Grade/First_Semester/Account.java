/*
 * 은행 계좌를 객체로 표현하기 위한 클래스
 * 작성일자: 2022-05-06
 * 작성자: 조한별
 */
public class Account {
	private String accountNo;
	private String Owner;
	private long balance;
	
	public Account() {
		
	}
	public Account(String accountNo, String Owner) {
		this.accountNo = accountNo;
		this.Owner = Owner;
		this.balance = 0L;
	}
	public Account(String accountNo, String owner, long balance) {
		this(accountNo, owner); // 다른 생성자를 통해서 일부 초기화하는 부분
		if(balance < 0) // 중복되는 제어를 제거할 수 있다.
			this.balance = 0;
		else
			this.balance = balance;
	}
	public void setAccontNo(String acc) {
		 this.accountNo = acc;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public String getOwner() {
		return Owner;
	}
	public void setOwner(String owner) {
		Owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	@Override
	public String toString() {
		return "계좌정보 =" + accountNo + ", Owner=" + Owner + ", balance=" + balance + "]";
	}
	public long deposit(long money) { // void
		if(money > 0)
			this.balance += money; // 저축
		else
			System.out.println("0보다 작은 금액은 입금할 수 없습니다.");
		return balance; // 현재 잔액 리턴 // return x
	}
	public long withdraw(long money) {
		if(balance - money < 0)
			System.out.println("잔액이 부족합니다.");
		else
			this.balance -= money;
		return balance;
	}
}
