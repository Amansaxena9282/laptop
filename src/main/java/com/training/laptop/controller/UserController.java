package com.training.laptop.controller;

import com.training.laptop.model.User;
import com.training.laptop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ap1/v1")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/getAll")
    public List<User> getAll(){
        return userService.getAll();
    }
    @PostMapping("/save")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PutMapping("/edit")
    public User editUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id){
        return userService.deleteUser(id);
    }
}

