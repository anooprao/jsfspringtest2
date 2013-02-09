package com.anooprao.user.bo.impl;

import org.springframework.stereotype.Service;

import com.anooprao.user.bo.UserBo;

@Service
public class UserBoImpl implements UserBo {

	public String getMessage() {
		 
		return "JSF 2 + Spring Integration";
 
	}


}
