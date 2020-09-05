package service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.UserDao;
import entity.User;
import service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService  {

	@Resource
	private UserDao userDao;
	
	
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
