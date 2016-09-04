package com.bestpay.skynet.mockerplatform.service;

import com.bestpay.skynet.mockerplatform.entity.User;

public interface UserService {

	Long addUserModelInfo(User user);

	Long removeUserModelInfo(Long id);

	Long updateUserModelInfo(User user);

	User searchUserModelInfo(Long userId);
}
