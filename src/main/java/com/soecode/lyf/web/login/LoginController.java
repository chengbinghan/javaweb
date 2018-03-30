package com.soecode.lyf.web.login;

import com.soecode.lyf.entity.User;
import com.soecode.lyf.service.BookService;
import com.soecode.lyf.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * @author ChengBing Han
 * @date 23:21  2018/3/29
 * @description
 */
@Controller
@RequestMapping("/user")
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    public static final String SESSION_USERNAME = "user:username";

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    public String login(User user, Model model, HttpSession session) {

        boolean loginSucess = false;
        if (session.getAttribute(SESSION_USERNAME) != null) {
            loginSucess = true;
        } else {

            loginSucess = userService.checkNameAndPwd(user);
            session.setAttribute(SESSION_USERNAME, user.getName());
        }

        if (loginSucess) {
            model.addAttribute((String) session.getAttribute(SESSION_USERNAME), "login success!");
            return "loginSucess";
        }
        return "login";
    }

}
