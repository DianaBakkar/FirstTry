package dao;

import model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("fakeUserDao")
public class FakeUserDataAccessService implements UserDao{
    private static List<User> DB=new ArrayList<>();
    @Override
    public int insertUser(String username, int numberOfPosts, User user) {
        DB.add(new User(user.getUsername(),user.getNumberOfPosts()));
        return 1;
    }
}
