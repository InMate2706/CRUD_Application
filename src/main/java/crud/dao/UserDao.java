package crud.dao;

import crud.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    void deleteUser(Long id);
    List<User> getAllUsers();
    void updateUser(User user);
    User getUserById(Long id);
}
