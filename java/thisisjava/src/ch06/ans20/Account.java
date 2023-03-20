package ch06.ans20;

public class Account {
	private String accountNum;
	private String name;
	private int firstDeposit;
	
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFirstDeposit() {
		return firstDeposit;
	}
	public void setFirstDeposit(int firstDeposit) {
		this.firstDeposit = firstDeposit;
	}
	
	public Account(String accountNum, String name, int firstDeposit) {
		this.accountNum = accountNum;
		this.name = name;
		this.firstDeposit = firstDeposit;
	}

}
