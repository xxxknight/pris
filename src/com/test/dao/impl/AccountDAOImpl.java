package com.test.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.test.bean.Account;
import com.test.dao.AccountDAO;

public class AccountDAOImpl extends HibernateDaoSupport implements AccountDAO {

	
	//转账
	public void transfer(Account a1, Account a2) {
		this.getHibernateTemplate().update(a1);
		this.getHibernateTemplate().update(a2);
	}

	//根据账号获取账户对象
	public List getAccountByAccountNo(final String accountNo) {
		// TODO Auto-generated method stub
		String hql ="from Account account where account.accountNo=?";	
	    return this.getHibernateTemplate().find(hql,accountNo);
	}
}
