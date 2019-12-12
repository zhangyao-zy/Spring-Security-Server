package com.zy.userSecurityServer.mapper;

import com.zy.userSecurityServer.domain.TbUser;
import tk.mybatis.mapper.common.Mapper;

public interface TbUserMapper extends Mapper<TbUser> {
    TbUser selectOneByUserName(String userName);
}