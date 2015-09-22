package com.test.service.impl;

import java.util.List;

import com.test.bean.Account;
import com.test.dao.AccountDAO;
import com.test.service.AccountService;

public class AccountServiceImpl implements AccountService{
	//��AccountDAO�ӿ��������󣬲����set������������ע��
	AccountDAO accountDAO;
	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
	
	//ת��
	//ʹ��@Transactionalע��ʵ��transfer�������������
	public void transfer(Account a1, Account a2) {
		accountDAO.transfer(a1, a2);
	}
	//�����˺Ż�ȡ�˻�����
	public List getAccountByAccountNo(String accountNo) {
		// TODO Auto-generated method stub
		return accountDAO.getAccountByAccountNo(accountNo);
	}

}
