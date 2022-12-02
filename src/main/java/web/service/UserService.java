package main.java.web.service;

import main.java.web.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(long id);

    public void deleteUser(long id);

    public void updateUser(User user);
}
