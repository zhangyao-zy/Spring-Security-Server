package com.zy.userSecurityServer.mapper;

import com.zy.userSecurityServer.domain.TbPermission;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TbPermissionMapper extends Mapper<TbPermission> {
    List<TbPermission> queryListPermissionMapper(Integer userId);
}