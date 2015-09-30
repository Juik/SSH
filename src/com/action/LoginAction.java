package com.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.LoginDao;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String username;
	private String password;
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() { 
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LoginAction [password=" + password + ", username=" + username
				+ "]";
	}
	
	public String execute() throws Exception{
		System.out.println("dsadsadsadasddasasddasdsasadsadsadsad");
		ApplicationContext ctx=
			new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("dfajkadfj");
		LoginDao ld= (LoginDao) ctx.getBean("logindao");
		boolean b = ld.isLogin(username, password);
		if(b){
		return this.SUCCESS;
		}
		return this.ERROR;
	}
}
