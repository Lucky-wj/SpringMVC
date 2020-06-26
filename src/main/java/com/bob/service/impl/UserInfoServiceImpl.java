package com.bob.service.impl;

import com.bob.bean.UserInfo;
import com.bob.mapper.UserInfoMapper;
import com.bob.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author WangJun
 * @since 2020/6/26
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userinfoMapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(UserInfo record) {
        return 0;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
    public int insertSelective(UserInfo record) {
        return userinfoMapper.insertSelective(record);
    }

    @Override
    public UserInfo selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(UserInfo record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UserInfo record) {
        return 0;
    }
}
