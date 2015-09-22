package com.test.action.account;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.test.bean.Account;
import com.test.service.AccountService;

public class AccountManagerAction extends ActionSupport {
	private String ac1;
	private String ac2;
	private String amount;

	public String getAc1() {
		return ac1;
	}

	public void setAc1(String ac1) {
		this.ac1 = ac1;
	}

	public String getAc2() {
		return ac2;
	}

	public void setAc2(String ac2) {
		this.ac2 = ac2;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	private AccountService service;

	public void setAccountService(AccountService service) {
		this.service = service;
	}

	@Override
	public String execute() throws Exception {
		System.out.println(ac1);
		System.out.println(ac2);
		Account a1 = null;
		Account a2 = null;

		List list1 = service.getAccountByAccountNo(ac1);
		if (list1.size() > 0) {
			a1 = (Account) list1.get(0);
			System.out.println("ac1");
			a1.setBalance((a1.getBalance() - Double.parseDouble(amount)));
		}
		
		List list2 = service.getAccountByAccountNo(ac2);
		if (list2.size() > 0) {
			a2 = (Account) list2.get(0);
			System.out.println("ac2");
			a2.setBalance((a2.getBalance() + Double.parseDouble(amount)));
		}
		try {

			service.transfer(a1, a2);
			System.out.println("transfer");
		} catch (Exception e) {

			System.out.println(e);
			return "error1";
		}

		return "success1";
	}
}
