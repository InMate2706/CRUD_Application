package crud.service;

import crud.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void deleteUser(Long id);
    List<User> getAllUsers();
    void updateUser(User user);
    User getUserById(Long id);
}
