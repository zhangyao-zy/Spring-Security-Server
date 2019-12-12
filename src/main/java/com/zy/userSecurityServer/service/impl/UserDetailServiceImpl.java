package com.zy.userSecurityServer.service.impl;

import com.zy.userSecurityServer.domain.TbPermission;
import com.zy.userSecurityServer.domain.TbUser;
import com.zy.userSecurityServer.mapper.TbPermissionMapper;
import com.zy.userSecurityServer.mapper.TbUserMapper;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

/**
 * @author: zhangyao
 * @create:2019-12-10 11:31
 **/
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    TbPermissionMapper tbPermissionMapper;
    @Autowired
    TbUserMapper tbUserMapper;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        TbUser tbUser = tbUserMapper.selectOneByUserName(userName);
        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
        if(tbUser!=null){
            List<TbPermission> permissions = tbPermissionMapper.queryListPermissionMapper(tbUser.getUserId());
            for (TbPermission permission : permissions) {
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permission.getPermissionName());
                grantedAuthorities.add(grantedAuthority);
            }
            return new User(tbUser.getUserName(), tbUser.getPassword(), grantedAuthorities);
        }
        return null;
    }
}
