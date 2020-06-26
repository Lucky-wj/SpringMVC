package com.bob.service;

import com.bob.bean.UserInfo;

/**
 * @author WangJun
 * @since 2020/6/26
 */
public interface UserInfoService {
    int deleteByPrimaryKey(Long id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}
