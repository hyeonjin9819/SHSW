package ch20.account;

import lombok.Data;

@Data
public class Account {
	private int id;
	private String accountNum;
	private String owner;
	private int price;
	
	public Account(String accountNum, String owner, int price) {
		this.accountNum = accountNum;
		this.owner = owner;
		this.price = price;
	}

}
