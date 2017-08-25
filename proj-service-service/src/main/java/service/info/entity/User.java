package service.info.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wangjianjun on 2017/8/25.
 */
public class User implements Serializable {
    private static final long serialVersionUID = -5800590558213416119L;

    private Integer userId;
    private String userName;
    private Date userBirthday;
    private Double userSalary;

    public User() {
    }

    public User(String userName, Date userBirthday, Double userSalary) {
        this.userName = userName;
        this.userBirthday = userBirthday;
        this.userSalary = userSalary;
    }

    public User(Integer userId, String userName, Date userBirthday, Double userSalary) {
        this.userId = userId;
        this.userName = userName;
        this.userBirthday = userBirthday;
        this.userSalary = userSalary;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public Double getUserSalary() {
        return userSalary;
    }

    public void setUserSalary(Double userSalary) {
        this.userSalary = userSalary;
    }
}
