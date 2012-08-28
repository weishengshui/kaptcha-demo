package com.wss.lsl.kaptcha.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
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
		
		System.out.println("ActionContext.getContext().getSession().get(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY): "+
				ActionContext.getContext().getSession().get(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY));
		String tmpcode =  (String)ActionContext.getContext().getSession().get(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
		System.out.println("----------------------------图片code: "+tmpcode);
		System.out.println("----------------------------你输入的code: "+code);
		if(tmpcode != null && tmpcode.equalsIgnoreCase(code)){
			return SUCCESS;
		}
		return INPUT;
		
	}
}
