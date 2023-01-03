package m1to30.M12_Solution;

import java.util.Scanner;

public class Bank {

	public static Account[] accountList = new Account[1000];
	public static String adminPassword = "1111";
	public static Scanner sc = new Scanner(System.in); 
	
	
	public static void main(String[] args) {
		
		do {
			System.out.println("===================================");
			System.out.println("1. 계좌등록");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 계좌조회");
			System.out.println("5. 계좌목록");
			System.out.println("6. 종료");
			System.out.println("===================================");
			System.out.print("입력>>");
			
			int no = sc.nextInt();
			int cnt = 0;
			
			String accountNumber = "";
			String accountHolder = "";
			int balance = 0;
			String password = "";
			Account account = null;
			
			int input = 0;
			int output = 0;
			boolean pwOk = false;
			int ch = 0;
			
			switch (no) {
				case 1:
						System.out.print("계좌번호>>");
						accountNumber = sc.next();
						System.out.print("예금주>>");
						accountHolder = sc.next();
						System.out.print("최초예금액>>");
						balance = sc.nextInt();
						System.out.print("비밀번호>>");
						password = sc.next();
	
						account = new Account(accountNumber, accountHolder, balance);
						account.setPassword(password);
						accountList[cnt] = account;
						
						System.out.println("'" + account.getAccountHolder() + "'님의 계좌가 개설되었습니다.");
						
						break;
				
				case 2: 
						System.out.println("============= 입금 =============");
						System.out.print("계좌번호>>");
						accountNumber = sc.next();
						System.out.print("입금액>>");
						input = sc.nextInt();
						
						for (int i = 0; i < accountList.length; i++) {
							account = accountList[i];
							if( account == null ) continue;
							if( accountNumber.equals(account.getAccountNumber()) ) {
								accountHolder = account.getAccountHolder();
								break;
							}
						}
						System.out.println("'" + accountHolder + "'님에게 입금하는게 맞으십니까?");
						System.out.println("1. 예");
						System.out.println("2. 아니오");
						System.out.print(">>");
						ch = sc.nextInt();
						if( ch == 1 )
							account.deposit(input);
						break;
				case 3:
						System.out.println("============= 출금 =============");
						System.out.print("계좌번호>>");
						accountNumber = sc.next();
						System.out.print("비밀번호>>");
						password = sc.next();
						
						pwOk = false;
						for (int i = 0; i < accountList.length; i++) {
							account = accountList[i];
							if( account == null ) continue;
							if( accountNumber.equals(account.getAccountNumber()) ) {
								if( password.equals(account.getPassword()) ){
									pwOk = true;
								}
								break;
							}
						}
						
						if( pwOk ) {
							System.out.print("출금액>> ");
							output = sc.nextInt();
							account.withdrawal(output);
						} else {
							System.err.println("비밀번호가 다릅니다!");
						}
						break;
				case 4: 
						System.out.println("============= 계좌조회 =============");
						System.out.print("계좌번호>>");
						accountNumber = sc.next();
						System.out.print("비밀번호>>");
						password = sc.next();
						
						pwOk = false;
						for (int i = 0; i < accountList.length; i++) {
							account = accountList[i];
							if( account == null ) continue;
							if( accountNumber.equals(account.getAccountNumber()) ) {
								if( password.equals(account.getPassword()) ){
									pwOk = true;
								}
								break;
							}
						}
						
						if( pwOk )
							System.out.println("'" + account.getAccountHolder() + "'님의 계좌잔액은 " + account.getBalance() + "원 입니다.");
						else
							System.err.println("계좌번호 또는 비밀번호가 일치하지 않습니다.");
						break;
				case 5:
						System.out.print("관리자 비밀번호>> ");
						password = sc.next();
						if( password.equals(adminPassword) ) {
							System.out.println("예금주\t\t계좌번호\t\t잔고");
							for(int i = 0 ; i < accountList.length ; i++) {
								Account a = accountList[i];
								if( a == null ) continue;
								System.out.println(a.getAccountHolder() + "\t\t" + a.getAccountNumber() + "\t\t" + a.getBalance());
							}
						} else {
							System.err.println("관리자 비밀번호가 다릅니다.");
						}
				default:
					break;
			}
			
		
		} while(true);
	}
	
}