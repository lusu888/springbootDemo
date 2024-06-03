package com.example.demoz.Dao;

import com.example.demoz.bean.UserBean;
import java.util.List;

public interface UserDao {
    List<UserBean> findall();
    UserBean findById(int ID);
    boolean addUser(UserBean user);
    boolean updateById(UserBean user);
}
