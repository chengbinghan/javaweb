package com.soecode.lyf.service;

import com.soecode.lyf.entity.User;

/**
 * @author ChengBing Han
 * @date 23:22  2018/3/29
 * @description
 */
public interface UserService {

    boolean checkNameAndPwd(User user);
}
