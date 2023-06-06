package ygh.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import ygh.dao.UserDao;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceImplTest {
    @Autowired
    @Qualifier("userDaoImpl")
    private UserDao userDao;
    @Test
    void aa() {
        userDao.save();
    }
}