package ch06.ch20;

public class Account {
	private String accountNum;
	private String owner;
	private int price;
	
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Account(String accountNum, String owner, int price) {
		this.accountNum = accountNum;
		this.owner = owner;
		this.price = price;
	}


}
