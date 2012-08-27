package com.wss.lsl.kaptcha.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	private static final long serialVersionUID = -2797943646735988371L;
	
	private String code;
	
	
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}

	public String login() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		code =  (String)session.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_CONFIG_KEY);
		System.out.println("----------------------------code: "+code);
		// TODO Auto-generated method stub
		return SUCCESS;
	}
}
