package com.test.service.impl;

import java.util.List;

import com.test.bean.Account;
import com.test.dao.AccountDAO;
import com.test.service.AccountService;

public class AccountServiceImpl implements AccountService{
	//用AccountDAO接口声明对象，并添加set方法用于依赖注入
	AccountDAO accountDAO;
	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
	
	//转账
	//使用@Transactional注解实现transfer方法的事务管理
	public void transfer(Account a1, Account a2) {
		accountDAO.transfer(a1, a2);
	}
	//根据账号获取账户对象
	public List getAccountByAccountNo(String accountNo) {
		// TODO Auto-generated method stub
		return accountDAO.getAccountByAccountNo(accountNo);
	}

}
