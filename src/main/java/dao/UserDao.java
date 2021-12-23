package dao;
import model.User;

public interface UserDao {
    int insertUser(String username, int numberOfPosts, User user);

}
