package com.bstek.demo.urule.service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.bstek.urule.console.database.service.user.UserService;
import com.bstek.urule.console.security.entity.DefaultUser;
import com.bstek.urule.console.security.entity.User;
import com.bstek.urule.console.security.provider.SecurityProvider;

//@Service(SecurityProvider.BEAN_ID)
public class DefaultSecurityProvider implements SecurityProvider {

	@Resource(name=UserService.BEAN_ID)
	UserService userService;
	
	@Override
	public User getLoginUser(HttpServletRequest req) {
		return (User)req.getSession().getAttribute("urule.user");
	}

	@Override
	public void login(HttpServletRequest req, String account, String password) {
		com.bstek.urule.console.database.model.User user = userService.validate(account, password);
		User securityUser = new DefaultUser(user.getId(), user.getName(), user.getGroups());
		req.getSession().setAttribute("urule.user", securityUser);
	}

	@Override
	public void logout(HttpServletRequest req) {
		req.getSession().removeAttribute("urule.user");

	}

}
