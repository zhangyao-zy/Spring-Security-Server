package com.zy.userSecurityServer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: zhangyao
 * @create:2019-12-09 10:53
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class SecurityServerTest {

    Logger logger = LoggerFactory.getLogger(Logger.class);
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Test
    public void testPassword(){
        logger.info(bCryptPasswordEncoder.encode("123456"));
    }
}
