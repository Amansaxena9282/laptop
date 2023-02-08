package com.training.laptop.service;
import com.training.laptop.model.User;
import com.training.laptop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {

        return userRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        User user1=userRepository.getById(user.getId());
        if(user.getName()!=null)
            user1.setName(user.getName());
        if(user.getMobile()!=null)
            user1.setMobile(user.getMobile());
        return userRepository.save(user1);
    }

    @Override
    public User deleteUser(User user) {
        return null;
    }

    @Override
    public String deleteUser(Long id) {
        userRepository.deleteById(id);
        return "userId:"+id+" Deleted Successfully";
    }
}