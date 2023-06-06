package ygh;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ygh.service.UserService;
import ygh.service.UserServiceImpl;

@SpringBootTest
@RunWith(SpringRunner.class)
public class Test {
    @Autowired
    private UserService userServiceImpl;



    @org.junit.Test
    public void a(){
        userServiceImpl.aa();
    }
}
