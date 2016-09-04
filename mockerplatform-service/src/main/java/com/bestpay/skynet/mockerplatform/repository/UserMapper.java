package com.bestpay.skynet.mockerplatform.repository;

import org.springframework.stereotype.Repository;

import com.bestpay.skynet.mockerplatform.entity.User;

@Repository
public interface UserMapper {
    Long deleteByPrimaryKey(Long id);

    Long insert(User record);

    Long insertSelective(User record);

    User selectByPrimaryKey(Long id);

    Long updateByPrimaryKeySelective(User record);

    Long updateByPrimaryKey(User record);
}