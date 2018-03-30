package com.soecode.lyf.service.impl;

import com.soecode.lyf.entity.User;
import com.soecode.lyf.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author ChengBing Han
 * @date 23:24  2018/3/29
 * @description
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public boolean checkNameAndPwd(User user) {
        if (user == null) {
            return false;
        }

        if ("name".equals(user.getName()) && "pwd".equals(user.getPwd())) {
            return true;
        }


        return false;
    }
}
