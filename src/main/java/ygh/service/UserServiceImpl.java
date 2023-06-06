package ygh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ygh.dao.UserDao;

import javax.annotation.Resource;

@Service
public class UserServiceImpl    implements UserService {
    @Autowired
    @Qualifier("userDaoImpl2")
    private UserDao userDao;
    public void aa(){
        userDao.save();
    }

    public static void main(String[] args) {
        UserServiceImpl userService=new UserServiceImpl();
        userService.aa();
    }
}
