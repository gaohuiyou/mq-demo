package ygh.dao;

import org.springframework.stereotype.Repository;
import ygh.entity.User;

@Repository
public interface UserDao {
    public void save(User user);


}
