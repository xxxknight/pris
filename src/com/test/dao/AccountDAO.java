package com.test.dao;

import java.util.List;

import com.test.bean.Account;

public interface AccountDAO {
	public List getAccountByAccountNo(String accountNo);

	public void transfer(Account a1, Account a2);

}