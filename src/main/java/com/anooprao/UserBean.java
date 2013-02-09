package com.anooprao;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.anooprao.user.bo.UserBo;
 
@Component
@ManagedBean
@SessionScoped
public class UserBean{
 
	@Autowired
	UserBo userBo;
 
	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}
 
	public String printMsgFromSpring() {
		return userBo.getMessage();
	}
 
}
