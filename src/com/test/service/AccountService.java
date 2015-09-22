package com.test.service;

import java.util.List;

import com.test.bean.Account;

public interface AccountService {
	public List getAccountByAccountNo(String accountNo);

	public void transfer(Account a1, Account a2);
}
