package com.example.demoz.Dao;

import com.example.demoz.bean.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userDaoImpl")
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<UserBean> findall() {
        String sql = "SELECT * FROM testzhang.usertb";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<UserBean>(UserBean.class));
    }

    @Override
    public UserBean findById(int ID) {
        return null;
    }

    @Override
    public boolean addUser(UserBean user) {
        String sql = "INSERT INTO `testzhang`.`usertb` (`firstnamez`, `lastnamez`, `role`) VALUES ('?', '?', '?')";
        Object[] params = {user.getFirstnamez(),user.getLastnamez(),user.getRole()};
        return jdbcTemplate.update(sql,params)>0;
    }

    @Override
    public boolean updateById(UserBean user) {
        String sql = "UPDATE `testzhang`.`usertb` SET `firstnamez` = '?', `lastnamez` = '?', `role` = '?' WHERE (`idusertb` = '?');\n";
        Object[] params = {user.getFirstnamez(),user.getLastnamez(),user.getRole(),user.getIdusertb()};
        return jdbcTemplate.update(sql,params)>0;
    }
}
