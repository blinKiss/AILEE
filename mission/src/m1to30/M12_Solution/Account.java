package m1to30.M12_Solution;

public class Account {

	private String accountNumber;
	private String accountHolder;
	private int balance;
	private String password;
	static final int MIN_BALANCE = 0;
	final static int MAX_BALANCE = 1000000000;
	final static int MIN_TRANSFER = 0;
	final static int MAX_TRANSFER = 1000000;
	
	public Account() {
		this.accountNumber = "계좌없음";
		this.accountHolder = "이름없음";
		this.balance = 0;
	}

	public Account(String accountNumber, String accountHolder, int balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void deposit(int input) {
		if( input > MAX_TRANSFER ) return;
		if( input < MIN_TRANSFER ) return;
		if( balance + input > MAX_BALANCE ) return;
		this.balance = balance + input;
		
		System.out.println("'" + this.accountHolder + "'님의 계좌에 " + input + " 원이 입금되었습니다.");
	}
	
	public void withdrawal(int output) {
		if( output > MAX_TRANSFER ) return;
		if( output < MIN_TRANSFER ) return;
		if( balance - output < MIN_TRANSFER ) return;
		this.balance = balance - output;
		
		System.out.println("'" + this.accountHolder + "'님의 계좌에서 " + output + " 원이 출금되었습니다.");
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", balance=" + balance
				+ "]";
	}
	
	
	
	
	
}