package com.bestpay.skynet.mockerplatform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestpay.skynet.mockerplatform.entity.User;
import com.bestpay.skynet.mockerplatform.repository.UserMapper;
import com.bestpay.skynet.mockerplatform.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public Long addUserModelInfo(User userModel) {
		return userMapper.insert(userModel);
	}

	@Override
	public Long removeUserModelInfo(Long id) {
		return userMapper.deleteByPrimaryKey(id);

	}

	@Override
	public Long updateUserModelInfo(User userModel) {
		return userMapper.updateByPrimaryKey(userModel);
	}

	@Override
	public User searchUserModelInfo(Long userId) {
		return userMapper.selectByPrimaryKey(userId);
	}
	
}
