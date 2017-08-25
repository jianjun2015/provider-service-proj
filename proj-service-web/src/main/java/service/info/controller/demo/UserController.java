package service.info.controller.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.info.entity.User;
import service.info.service.demo.UserService;

import javax.xml.ws.RequestWrapper;
import java.util.Date;

/**
 * Created by wangjianjun on 2017/8/25.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public void addUser(){
        userService.addUser(new User("zhangsan",new Date(),100d));
    }
}
