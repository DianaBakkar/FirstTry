package service;

import dao.UserDao;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserDao userDao;
    @Autowired

    public UserService(@Qualifier("fakeUserDao")UserDao userDao) {
        this.userDao = userDao;
    }

    public int insertUser(User user){
        return userDao.insertUser(user.getUsername(), user.getNumberOfPosts(), user);
    }
}
