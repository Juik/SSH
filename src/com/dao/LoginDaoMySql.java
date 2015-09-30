package com.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class LoginDaoMySql extends HibernateDaoSupport implements LoginDao {

	public boolean isLogin(String username, String password) {
		
		return true;
	}

}
