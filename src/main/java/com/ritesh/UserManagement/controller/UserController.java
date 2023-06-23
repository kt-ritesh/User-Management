package com.ritesh.UserManagement.controller;

import com.ritesh.UserManagement.model.User;
import com.ritesh.UserManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("getAllUser")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("getUser/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }
    @PostMapping("addUser")
    public String addUser(@RequestBody User user){
        return userService.addNewUser(user);
    }
    @PutMapping("updateUserInfo/{id}")
    public String updateUser(@PathVariable Integer id, @RequestBody User user){
        return userService.updateUserById(id, user);
    }
    @DeleteMapping("deleteUser/{id}")
    public String deleteUser(@PathVariable Integer id){
        return userService.deleteUserById(id);
    }
}
