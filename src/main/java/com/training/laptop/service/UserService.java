package com.training.laptop.service;
import com.training.laptop.model.User;

import java.util.List;
public interface UserService {
    public List<User>getAll();
    public User addUser(User user);
    public User updateUser(User user);
    public User deleteUser(User user);

    String deleteUser(Long id);
}
