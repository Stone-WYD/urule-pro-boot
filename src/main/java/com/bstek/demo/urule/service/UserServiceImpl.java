package com.bstek.demo.urule.service;

import java.util.ArrayList;
import java.util.List;

import com.bstek.urule.console.database.model.Group;
import com.bstek.urule.console.database.model.User;
import com.bstek.urule.console.database.service.user.UserService;
import com.bstek.urule.exception.RuleException;

//@Service("urule.userService")
public class UserServiceImpl implements UserService {

	@Override
	public User get(String account) {
		if ("test".equals(account)) return null;
		User user = new User();
		user.setId(account);
		user.setEmail(account+"@bstek.com");
		user.setEnable(true);
		user.setName("用户"+account);
		return user;
	}

	@Override
	public User validate(String account, String password) {
		if ("123456".equals(password)) {
			User user = get(account);
			List<Group> userGroups = new ArrayList<Group>();
			Group group = new Group();
			group.setId("bstekteam");
			group.setName("上海锐道信息技术有限公司");
			group.setCreateUser("admin");
			userGroups.add(group);
			user.setGroups(userGroups);
			return user;
		}
		throw new RuleException("不存在该用户对象");
	}

}
