package service.info.service.demo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.info.dal.dao.TUserMapper;
import service.info.dal.module.TUser;
import service.info.entity.User;
import service.info.service.demo.UserService;

/**
 * Created by wangjianjun on 2017/8/25.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private TUserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.insert(writeTuser(user));
    }

    private TUser writeTuser(User user){
        TUser tUser = new TUser();
        tUser.setUserName(user.getUserName());
        tUser.setUserSalary(user.getUserSalary());
        tUser.setUserBirthday(user.getUserBirthday());

        return tUser;
    }
}
