package ygh.dao.impl;

import org.springframework.stereotype.Repository;
import ygh.dao.UserDao;
@Repository("userDaoImpl")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("userDaoImpl1");
    }
}
