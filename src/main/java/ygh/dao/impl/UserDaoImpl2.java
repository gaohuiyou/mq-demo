package ygh.dao.impl;

import org.springframework.stereotype.Repository;
import ygh.dao.UserDao;
@Repository("userDaoImpl2")
public class UserDaoImpl2 implements UserDao {
    @Override
    public void save() {
        System.out.println("userDaoImpl2");
    }
}
